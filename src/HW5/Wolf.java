package HW5;

public class Wolf extends Wild{
    public Wolf(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
        this.isPredator=true;
    }
}
