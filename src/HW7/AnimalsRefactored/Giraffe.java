package HW7.AnimalsRefactored;

public class Giraffe extends Wild{
    public Giraffe(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
        this.isPredator=false;
    }
}
