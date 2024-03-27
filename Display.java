package boxing;

public class Display {
    
    public static void showData(Math data,Boxer n1,Boxer n2){
        PowerGlove powerGlove = new PowerGlove();
        System.out.println("#################################################################");
        System.out.println("#\t\t\tTurn:"+data.getRound()+"\t\t\t\t\t#");
        System.out.println("#Name: \t\t"+n1.getName()+"\t"+"Name: \t"+n2.getName()+"\t\t#");
        System.out.println("#HP: \t\t"+n1.getHealthPower()+"\t\t"+"HP: \t\t"+n2.getHealthPower()+"\t\t#");
        System.out.println("#PP: \t\t"+n1.getPunchPower()+"\t\t"+"PP: \t\t"+n2.getPunchPower()+"\t\t#");
        System.out.println("#NumOfTarget: \t"+n1.getNumOfTarget()+"\t\t"+"NumOfTarget: \t"+n2.getNumOfTarget()+"\t\t#");
        System.out.println("#LeftGuard: \t"+n1.getLeftGuard()+"\t\t"+"LeftGuard: \t"+n2.getLeftGuard()+"\t\t#");
        System.out.println("#RightGuard: \t"+n1.getRightGuard()+"\t\t"+"RightGuard: \t"+n2.getRightGuard()+"\t\t#");
        System.out.println("#Item: ".concat(n1.getEquip() == true? powerGlove.getName() : "Null\t")+"\t\t"+"Item: ".concat(n2.getEquip() == true? powerGlove.getName()+"\t\t#" : "Null \t\t\t#"));
        System.out.println("#################################################################");        
    }  
    
}
