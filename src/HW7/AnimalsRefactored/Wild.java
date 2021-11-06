package HW7.AnimalsRefactored;

public abstract class Wild extends Animals{

    boolean isPredator;

     Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator=isPredator;
        if(isPredator){
            s+="and I am angry.";
        }
    }

}
