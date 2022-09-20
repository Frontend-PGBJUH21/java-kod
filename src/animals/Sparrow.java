package animals;

import java.sql.SQLOutput;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(int age, String gender) {
        super(age, gender);
    }

    public void fly() {
        System.out.println("Sparrow can fly");
    }
}
