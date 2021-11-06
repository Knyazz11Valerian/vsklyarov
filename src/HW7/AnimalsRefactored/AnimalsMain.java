package HW7.AnimalsRefactored;

public class AnimalsMain {
    public static void main(String[] args) {

        Cat cat = new Cat(0, 11, 4, "red with white", "Simona");
        Crocodile crocodile = new Crocodile(1, 15, 240, "green", true);
        Dog dog = new Dog(2, 15, 30, "grey", "Richard");
        Fish fish = new Fish(3, 1, 1, "gold", "Karl");
        Giraffe giraffe = new Giraffe(4, 28, 900, "yellow and brown", false);
        GuideDog guideDog1 = new GuideDog(5, 12, 38, "black", "Doogle", true);
        GuideDog guideDog2 = new GuideDog(6, 8, 25, "black", "Garry", false);
        Hamster hamster = new Hamster(7, 2, 4, "light grey", "Muffin man");
        Lion lion = new Lion(8, 16, 150, "light yellow", true);
        Wolf wolf = new Wolf(9, 10, 50, "grey", true);

        Animals[] animalsArray = new Animals[]{cat, crocodile, dog, fish, giraffe, guideDog1, guideDog2, hamster, lion, wolf};

        for (Animals a : animalsArray) {
            a.Speak(a.s);
            a.ColorCheck(a.color);
            if (a.id == 5 || a.id == 6) {
                ((GuideDog) a).TakeHome(((GuideDog) a).isTrained);
            }
            System.out.println();
        }
    }
}

