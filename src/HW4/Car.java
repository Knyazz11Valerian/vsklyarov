package HW4;

public class Car {

       int tankVolume, tankResidue, fuelConsumption;

    public Car(int tankVolume, int tankResidue, int fuelConsumption) {
        this.tankVolume = tankVolume;
        this.tankResidue = tankResidue;
        this.fuelConsumption = fuelConsumption;
    }

    public static int fillTank(int tankVolume){
        return tankVolume;
    }

    public static int howMuchLeft(int tankVolume, int fuelConsumption, int kilometers) {
        int left=tankVolume-fuelConsumption*kilometers/100;
        return left;
    }
    public static int howMuchNeedToBeFilled(int tankVolume,int fuelConsumption, int kilometers){
        return tankVolume-howMuchLeft( tankVolume, fuelConsumption, kilometers);
    }

}
