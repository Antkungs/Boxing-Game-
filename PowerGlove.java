package boxing;

public class PowerGlove {

    private String name;
    
    private boolean isItem;
    
    private int effect;
    private int punchCount;
    private int effectiveEvery;
    
    public PowerGlove(){
        this.name = "Power Grove";
        this.isItem = true;
        this.effect = 5;
        this.punchCount = 0;
        this.effectiveEvery = 3;
    }
    
    public int affect(int punchPower,boolean item){
        int damage = punchPower;
        if(item){
            this.punchCount ++;
            if(this.punchCount == this.effectiveEvery){
                this.punchCount = 0;
                return damage*effect;
            }
            return damage;
        }
        return damage;
    }
    //get
    public String getName() {
        return name;
    }
    
    public int getPunchCount() {
        return punchCount;
    }
    
    public int getEffect(){
        return effect;
    }
    
    public int getEffectiveEvery(){
        return effectiveEvery;
    }
    
    public boolean getIsItem(){
        return this.isItem;
    }
    //set
    public void setPunchCount(int punchCount) {
        this.punchCount = punchCount;
    }
       
    public void isIsItem(boolean isItem){
        this.isItem = isItem;
    }
}
