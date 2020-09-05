package best.com;

import java.math.BigDecimal;

public class FuelTank {

    private final BigDecimal volume;
    private BigDecimal fuelVolume;

    public static final BigDecimal FUEL_VOLUME_30_L = new BigDecimal(30);
    public static final BigDecimal FUEL_VOLUME_50_L = new BigDecimal(50);
    public static final BigDecimal FUEL_VOLUME_70_L = new BigDecimal(70);

    public FuelTank(BigDecimal volume, BigDecimal fuelVolume) throws MyExceptions {
        this.volume = volume;
        this.fuelVolume = fuelVolume;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public BigDecimal getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(BigDecimal fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

}
