public class Car {
    // inkapsling med access modifiers
    private String manufacturer;
    private float fuel;
    private float speed;
    private int registrationNum;
    private boolean isRunning;

    // initilize state, constructor
    public Car(String manuf, float fuel, int regNum) {
        manufacturer = manuf;
        this.fuel = fuel;
        // this för member variable
        registrationNum = regNum;
        speed = 0;
        isRunning = false;

    }

    public void SwitchOn() {
            isRunning = true;
    }

    public void SwitchOff() {
    isRunning = false;
    }

    public void Accelerate() {
        // om user kallar på accelerate så måste vi kolla så
        // att bilen är igång. Kan va ett exempel på nåt man inte tänkt
        // under analysen
        if(!isRunning)
            return;
        speed++;
        fuel -= 0.5f;
    }

   public void Brake() {
    speed = 0;
    }

   public void Dashboard() {
        // metod för att printa ut info
        System.out.println("Speed " + speed);
        System.out.println("Fuel " + fuel);
    }

    //alternativa metoder till dashboard
    public void FillFuel(float amount) {
        fuel += amount;
    }

    public float GetFuel() {
        return fuel;
    }

    public float GetSpeed() {
        return speed;
    }
}
