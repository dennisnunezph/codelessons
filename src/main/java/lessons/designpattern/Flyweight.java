package lessons.designpattern;

/**
 * Created by dennis on 6/28/16.
 */
public class Flyweight {

    public static void main(String[] args) {
        String fly = "fly", weight = "weight";
        String fly2 = "fly", weight2 = "weight";
        System.out.println(fly == fly2);       // fly and fly2 refer to the same String instance
        System.out.println(weight == weight2); // weight and weight2 also refer to
        // the same String instance
        String distinctString = fly + weight;
        System.out.println(distinctString == "flyweight"); // flyweight and "flyweight" do not
        // refer to the same instance
        String flyweight = (fly + weight).intern();
        System.out.println("Intern:" + flyweight == "flyweight"); // The intern() method returns a flyweight
        System.out.println("Equals:" + flyweight.equals("flyweight")); // The intern() method returns a flyweight

    }
}
