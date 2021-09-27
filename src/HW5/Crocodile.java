package HW5;

public class Crocodile extends Wild{
    public Crocodile(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
        this.isPredator=true;
    }
}
