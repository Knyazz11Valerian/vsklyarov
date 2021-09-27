package HW5;

public class Wild extends Animals{

    boolean isPredator;

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator=isPredator;
        if(isPredator){
            s+="and I am angry.";
        }
    }

}
