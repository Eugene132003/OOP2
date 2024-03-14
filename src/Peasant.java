public class Peasant extends Person{
    private int arrowsNum;
    boolean inGame=true;
    public Peasant(String name, int age) {
        super(name, 20, 5, age, 0, 20, "nothing", 50);
    }
    public void giveArrowes(int val){
        this.arrowsNum-=val;
        if (!isInGame()){
            inGame=false;
        }
    }
    public boolean isInGame(){
        return this.arrowsNum==0?false:true;
    }
}
