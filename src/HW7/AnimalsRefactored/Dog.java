package HW7.AnimalsRefactored;

public class Dog extends Domestic {
    public Dog(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
        s += "Woof. ";
    }
}
