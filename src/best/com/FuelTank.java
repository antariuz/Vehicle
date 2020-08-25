package best.com;

import java.math.BigDecimal;
import java.util.List;

public class FuelTank {

    private BigDecimal volume;
    private int currentVolume;

    public BigDecimal getVolume() {
        return volume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(BigDecimal volume) {
        if ((volume != 30) || (volume != 50) || (volume != 70)) {
            System.out.println("The volume of Fuel Tank should be 30, 50 or 70 litres");
        } else this.volume = volume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setWheels(List<Wheel> wheels) {

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
