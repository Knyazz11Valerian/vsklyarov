package HW7.AnimalsRefactored;

public class GuideDog extends Dog {
    boolean isTrained;

    public GuideDog(int id, int age, int weight, String color, String name, boolean isTrained) {
        super(id, age, weight, color, name);
        this.isTrained = isTrained;
        if (isTrained) {
            s += "I can take you home.";
        }
    }

    public static void TakeHome(boolean isTrained) {
        if (isTrained) {
            System.out.println("I'll lead the way to home.");
        } else {
            System.out.println("I can't do it.");
        }
    }
}
