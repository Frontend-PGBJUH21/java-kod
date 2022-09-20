public class PlayerVehicle {
    public PlayerVehicle(String name, int handling, int topSpeed, int strength) {
        super();
        this.name = name;
        this.handling = handling;
        this.topSpeed = topSpeed;
        this.strength = strength;
    }
    private String name;
    private int handling;
    // handling, topSpeed m.m. svarar tex bilen fortare på accelerate osv.
    // tillsammans tillåter dessa attribut att vi kan skapa olika typer
    // av bilar som är olika bra/dåliga
    private int topSpeed;
    private int strength;
    public String getName() {
        return name;
    }
    public int getHandling() {
        return handling;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public int getStrength() {
        return strength;
    }
    public void Up(){

    }
    public void Down(){

    }
    public void Left(){

    }
    public void Right(){

    }
}
