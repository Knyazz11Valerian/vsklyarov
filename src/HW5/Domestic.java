package HW5;

public class Domestic extends Animals{

    String name;

    public Domestic(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color);
        this.name=name;
        s+= "my name is "+name+". ";
    }

}
