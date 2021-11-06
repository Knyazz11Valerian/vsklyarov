package HW7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CarV9 {
    private BigDecimal tankCapacity = BigDecimal.valueOf(Math.random() * 31 + 30)
            .setScale(2, RoundingMode.CEILING);

    private BigDecimal fuelConsumption = BigDecimal.valueOf(Math.random() * 11 + 5)
            .setScale(2, RoundingMode.CEILING);

    private BigDecimal fuelInTank = tankCapacity
            .divide(BigDecimal.valueOf(100.0), RoundingMode.CEILING)
            .multiply(BigDecimal.valueOf(Math.random() * 41 + 10))
            .setScale(2, RoundingMode.CEILING);

    private double tripDistance;

    private BigDecimal tripMoneySpent = new BigDecimal(0)
            .setScale(2, RoundingMode.CEILING);

    public String location;

    CarV9(String location) {
        this.location = location;
    }

    public void setTripDistance(double tripDistance) {
        this.tripDistance = tripDistance;
    }


    public BigDecimal getFuelInTank() {
        return fuelInTank;
    }

    public String toString() {
        return location;
    }

    public void fillTank(double liters, double fuelPrice) {
        BigDecimal price = new BigDecimal(fuelPrice);

        BigDecimal litersValue = new BigDecimal(liters);

        BigDecimal fuelToFullTank = tankCapacity.subtract(fuelInTank);

        if (litersValue.compareTo(fuelToFullTank) == 1) {
            litersValue = fuelToFullTank;
        }

        fuelInTank = fuelInTank.add(litersValue);

        System.out.printf("Заправлено %.1f литров. Оплачено %.2f грн.\n", litersValue, litersValue.multiply(price));

        tripMoneySpent = tripMoneySpent.add(price.multiply(litersValue));
    }


    public void fillFullTank(double fuelPrice) {
        System.out.println("Заправляем полный бак.");

        fillTank(tankCapacity.subtract(fuelInTank).doubleValue(), fuelPrice);
    }


    public void drive(int distance, String destination) throws RuntimeException {
        System.out.printf("Едем в %s. %s км ...\n", destination, distance);

        fuelInTank = fuelInTank
                .subtract(BigDecimal.valueOf(distance)
                        .divide(BigDecimal.valueOf(100.0), RoundingMode.CEILING)
                        .multiply(fuelConsumption));

        if (fuelInTank.compareTo(BigDecimal.valueOf(0)) == -1) {
            throw new RuntimeException("Вот незадача!... БЕНЗИН ЗАКОНЧИЛСЯ!");
        }

        tripDistance += distance;
    }


    public void printTripReport() {
        System.out.println("\nОтчет:");
        System.out.printf("\nОстатось топлива в баке%7.2f л. ", getFuelInTank());
        System.out.printf("\nРасстояние:%7.2f км.", tripDistance);
        System.out.printf("\nЗатраты на топливо:%9.2f ₴.",tripMoneySpent.setScale(2, RoundingMode.CEILING));
    }
}
