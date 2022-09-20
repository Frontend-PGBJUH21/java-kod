package animals;

public class Animal {
    int age;
    String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public Animal() {
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}
