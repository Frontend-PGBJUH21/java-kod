public class SideObject extends GameObject {
    // exempel på arv
    // SideObject ärver GameObject
    private int damage ;
    private int cash ;
    protected int count ;

    public SideObject(int damage, int cash) {
        super();
        this.damage = damage;
        this.cash = cash;
        count = 0 ;
    }

    public int getDamage() {
        return damage;
    }
    public final void setDamage(int damage) {
        this.damage = damage;
    }
    public final int getCash() {
        return cash;
    }
    public final void setCash(int cash) {
        this.cash = cash;
    }


}
