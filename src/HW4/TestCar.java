package HW4;

public class TestCar {
    public static void main(String[] args) {
        int odessaKO = 179, kOJashkiv = 153, jashkivKiiv = 148, fuelPrice = 29, tripPrice , tripFinalPrice =0;
        Car car = new Car(60, 60, 8);
        car.tankResidue = Car.howMuchLeft(car.tankVolume, car.fuelConsumption, odessaKO);
        tripPrice = Car.howMuchNeedToBeFilled(car.tankVolume, car.fuelConsumption, odessaKO) * fuelPrice;
        tripFinalPrice += tripPrice;
        System.out.println("Остановка в Кривом Озере. Нужно долить "+car.tankResidue+
                " литров топлива. Вы заплатите "+tripPrice+" гривен.");
        car.tankResidue = Car.fillTank(car.tankVolume);
        car.tankResidue = Car.howMuchLeft(car.tankVolume, car.fuelConsumption, kOJashkiv);
        tripPrice = Car.howMuchNeedToBeFilled(car.tankVolume, car.fuelConsumption, kOJashkiv) * fuelPrice;
        tripFinalPrice += tripPrice;
        System.out.println("Остановка в Жашкове. Нужно долить "+car.tankResidue+
                " литров топлива. Вы заплатите "+tripPrice+" гривен.");
        car.tankResidue = Car.fillTank(car.tankVolume);
        car.tankResidue = Car.howMuchLeft(car.tankVolume, car.fuelConsumption, jashkivKiiv);
        System.out.println("Приехали в Киев. Осталось "+car.tankResidue+
                " литров топлива. Всего за тепливо заплачено "+tripFinalPrice+" гривен.");



    }
}
