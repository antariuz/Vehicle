package best.com;

import java.math.BigDecimal;

public class FuelTank {

    private BigDecimal volume;
    private BigDecimal currentVolume;

    public static BigDecimal FUEL_CAPACITY_30_L = new BigDecimal (30);
    public static BigDecimal FUEL_CAPACITY_50_L = new BigDecimal (50);
    public static BigDecimal FUEL_CAPACITY_70_L = new BigDecimal (70);

    public BigDecimal getVolume() {
        return volume;
    }

    public BigDecimal getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setCurrentVolume(BigDecimal currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void refuel(int inFuel) {
        // заправка
        if ((currentFuelVolume + inFuel) >= fuelVolume) {
            currentFuelVolume = fuelVolume;
            System.out.println("The fuel tank is fully refueled");
        } else {
            currentFuelVolume += inFuel;
            System.out.println("The fuel tank is refueled to " + currentFuelVolume + " litres");
        }

    }

    public void checkFuelVolume(int currentFuelVolume) {
        System.out.println("The fuel tank is full of " + currentFuelVolume + " litres");
    }

}
