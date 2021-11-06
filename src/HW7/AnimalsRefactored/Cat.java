package HW7.AnimalsRefactored;

public class Cat extends Domestic {
    public Cat(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
        s += "Mew. ";
    }
}
