package HW7.AnimalsRefactored;

public class Lion extends Wild{

    public Lion(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
        this.isPredator=true;
    }
}
