public class Player {
    private String name=null;
    int num=0;
    public Player(String _name) {
        this.name=_name;
    }
    public void play() {
        Dice d=new Dice();
        //num=d.roll();
        d.roll();
        num=d.getNum();
    }
    public String getName() {
        return this.name;
    }
    public int getNum() {
        return this.num;
    }
}