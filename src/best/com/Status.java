package best.com;

public class Status {

    @Override
    public String toString() {
        return
                "Quantity of Passengers: " + passengerQuantity + "\n" +
                        "Current speed: " + currentSpeed + "\n" +
                        "Level of Fuel: " + currentFuelVolume + "\n" +
                        "Volume of Fuel Tank: " + fuelVolume + "\n" +
                        "Last Activity Date: " + recentActivityDate + "\n"
                ;
    }

}
