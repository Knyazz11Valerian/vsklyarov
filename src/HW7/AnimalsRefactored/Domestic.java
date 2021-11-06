package HW7.AnimalsRefactored;

public abstract class Domestic extends Animals {

    String name;

    Domestic(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color);
        this.name = name;
        s += "my name is " + name + ". ";
    }

}
