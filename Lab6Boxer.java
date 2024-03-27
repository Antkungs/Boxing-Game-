package boxing;

public class Lab6Boxer {

    public static void main(String[] args) {
        Boxer n1 = new Boxer("Adam Win");
        Boxer n2 = new Boxer("Blue walker");
        
        n1.equipItem();
        n2.equipItem();
        n1.punch(n2);
        
    
    }
}