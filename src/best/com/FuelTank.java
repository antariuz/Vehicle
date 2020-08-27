package best.com;

import java.math.BigDecimal;

public class FuelTank {

    private BigDecimal volume;
    private BigDecimal currentVolume;

    public static BigDecimal FUEL_CAPACITY_30_L = new BigDecimal(30);
    public static BigDecimal FUEL_CAPACITY_50_L = new BigDecimal(50);
    public static BigDecimal FUEL_CAPACITY_70_L = new BigDecimal(70);

    public BigDecimal getVolume() {
        return volume;
    }

    public BigDecimal getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(BigDecimal volume) throws MyExceptions {
        if ((this.volume.compareTo(FUEL_CAPACITY_30_L) <= 0) ||
            (this.volume.compareTo(FUEL_CAPACITY_50_L) <= 0) ||
            (this.volume.compareTo(FUEL_CAPACITY_70_L) <= 0)) {
            throw new MyExceptions("The tank volume must be 30, 50 or 70 litres");
        }
        this.volume = volume;
    }

    public void setCurrentVolume(BigDecimal currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void refuel(BigDecimal inFuel) {
        // заправка
        if ((((currentVolume.add(inFuel)).compareTo(volume)) > 0)) {
            currentVolume = volume;
        } else {
            currentVolume = currentVolume.add(inFuel);
        }
    }

}
