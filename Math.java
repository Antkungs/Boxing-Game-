package boxing;
import java.util.Scanner;

public class Math {
    static boolean haveWinner = false;
    private int round = 1;

    public void fight(Boxer n1,Boxer another){
        Scanner scan = new Scanner(System.in);
        while(true){            
            //สุ่มการต่อย
            n1.setTarget(n1.guard());
            another.setTarget(another.guard());           
            //เช็คหาคนชนะ
            check(n1,another);
            round++;
            if(haveWinner){
                break;
            }           
            //ปรับ damage ตาม round
            n1.setDamage(n1.getPowerGlove().affect(n1.getPunchPower(),n1.isEquip()));
            another.setDamage(another.getPowerGlove().affect(another.getPunchPower(),another.isEquip()));          
            //ทำการต่อย และลดเลือด
            if(n1.getTarget() == another.getLeftGuard() || n1.getTarget() == another.getRightGuard()){
                System.out.println(n1.getName()+" punches at target "+n1.getTarget()+" but "+another.getName()+" Blocked !!" );
            }
            else{
                if((n1.getDamage() > n1.getPunchPower()) && n1.getEquip()){
                    System.out.println(n1.getName()+"!! Critical ATtacks !! "+n1.getDamage()+" at target "+n1.getTarget()+" to "+another.getName());
                }                   
                else{
                    System.out.println(n1.getName()+" damages "+n1.getPunchPower()+" at target "+n1.getTarget()+" to "+another.getName());
                }
                another.setHealthPower(another.getHealthPower() - n1.getDamage());
            }           
            if(another.getTarget() == n1.getLeftGuard() || another.getTarget() == n1.getRightGuard()){
                System.out.println(another.getName()+" punches at target "+another.getTarget()+" but "+n1.getName()+" Blocked !!" );
            }
            else{
                if((another.getDamage() > n1.getPunchPower() && another.isEquip())){
                    System.out.println(another.getName()+"!! Critical ATtacks !! "+another.getDamage()+" at target "+another.getTarget()+" to "+n1.getName());
                }               
                else{
                System.out.println(another.getName()+" damages "+another.getPunchPower()+" at target "+another.getTarget()+" to "+n1.getName());
                }
                n1.setHealthPower(n1.getHealthPower() - another.getDamage());
            }         
        //ตั้ง guard ป้องกัน
        n1.guard(); 
        another.guard();
        //กดเพื่อเปลี่ยน round
        System.out.println("\nPress enter to see the next turn ...");
        String enterkey = scan.nextLine();  
        }       
    }

    public void check(Boxer n1,Boxer n2){
        
        if(n1.getHealthPower() <= 0 || n2.getHealthPower() <= 0){
            if(n1.getHealthPower() > n2.getHealthPower()){
                System.out.println("\n\t\t\t!!"+n1.getName()+" wins!!");
                Display.showData(this,n1,n2);
                System.out.println("\t\t-- Thank For Watching The Match --");
                n1.isIsWinner(true);
            }
            else if(n2.getHealthPower() > n1.getHealthPower()){
                System.out.println("\n\t\t!!"+n2.getName()+" wins!!");
                Display.showData(this,n1,n2);
                System.out.println("\t\t-- Thank For Watching The Match --");
                n2.isIsWinner(true);
            }
            else if(n2.getHealthPower() == n1.getHealthPower()){
                System.out.println("\n\t\t\t!! Draw !!");
                Display.showData(this,n1,n2);
                System.out.println("\t\t-- Thank For Watching The Match --");
            }
            haveWinner = true;
        }
        else{
            Display.showData(this,n1,n2);
        }
    }
    
    public int getRound(){
        return round;
    }
}
