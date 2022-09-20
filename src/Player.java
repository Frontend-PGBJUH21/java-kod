public class Player extends GameObject {
    private int health;
    private PlayerVehicle vehicle;
    public Player(int health, PlayerVehicle vehicle) {
        super();
        this.health = health;
        this.vehicle = vehicle;
    }
    public boolean IsAlive(){
        return health > 0;
    }
    public void ApplyDamage(int damage, int cash){
       health -= damage - vehicle.getStrength();
        // om en bil har mer strength kommer den ta mindre skada
    }
    public void Accelerate(){
        vehicle.Up();
    }
    public void Brake(){
        vehicle.Down();
    }
    public void SteerLeft(){
        vehicle.Left();
    }
    public void SteerRight(){
        vehicle.Right();
    }
}
