package animals;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Chicken extends Bird implements Flyable{
    public Chicken(int age, String gender) {
        super(age, gender);
    }

    // en möjlig lösning på kyckling-problemet...
    // om vi skapar ett kyckling objekt
    // och kallar på fly() kommer vi få det här meddelandet
    // method overriding
   public void fly() {System.out.println("not able to fly...");
   }
}
