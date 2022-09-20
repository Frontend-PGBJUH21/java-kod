package animals;

public class Zoo {
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken(1, "F");
        chicken1.fly();
        // skulle vi gå in och kommentera ut fly() i chicken
        // har vi fortfarande tillgång till fly() och kycklingen kan flyga......

    }
}
