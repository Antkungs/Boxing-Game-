package boxing;

import java.util.Random;

public class Boxer {
    
    private String name;
    
    private boolean isWinner = false;    
    private boolean equippedItem = false;
    
    private int damage = 10;
    private int punchPower = 10;
    private int healthPower = 100;
    private int numOfTarget = 5;
    private int leftGuard = 1;
    private int rightGuard = 1;
    private int target = guard();

    private PowerGlove powerGlove;
    private Math math;
    
    public Boxer(String name) {
        powerGlove = new PowerGlove();
        math = new Math();
        this.name = name;
    }

    public void punch(Boxer another) {
        math.fight(this,another);    
    }

    public int guard() {
        Random rand = new Random();
        int random = rand.nextInt(numOfTarget) + 1;
        this.leftGuard = rand.nextInt(numOfTarget) + 1;
        this.rightGuard = rand.nextInt(numOfTarget) + 1;
        return random;     
    }

    public void equipItem() {
        this.equippedItem = true;
        powerGlove.isIsItem(true);
    }

    public void unequipItem() {
        this.equippedItem = false;
        powerGlove.isIsItem(false);
    }
    //set
    public void setHealthPower(int health){
        this.healthPower = health;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    public void setTarget(int target){
        this.target = target;
    }
    //get
    public boolean isEquip(){
        return equippedItem;
    }
    
    public void isIsWinner(boolean winner){
        this.isWinner = winner;
    }
    
    public String getName(){
        return name;
    }
    
    public int getHealthPower(){
        return healthPower;
    }
    
    public int getPunchPower(){
        return punchPower;
    }
    
    public int getNumOfTarget(){
        return numOfTarget;
    }
    
    public int getLeftGuard(){
        return leftGuard;
    }
    
    public int getRightGuard(){
        return rightGuard;
    }
    
    public boolean getEquip(){
        return equippedItem;
    }
    
    public int getTarget(){
        return target;
    }
    
    public int getDamage(){
        return damage;
    }

    public PowerGlove getPowerGlove() {
        return powerGlove;
    }
}
