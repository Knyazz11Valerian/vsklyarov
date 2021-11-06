package HW7.AnimalsRefactored;


public abstract class Animals {
    int id;
    int age;
    double weight;
    String color;
    String s = "Hello, ";

    Animals(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.s = s;
    }

    public static void Speak(String s) {
        System.out.println(s);
    }

    public static void ColorCheck(String color) {
        System.out.println("I'm " + color + ".");
    }


}
