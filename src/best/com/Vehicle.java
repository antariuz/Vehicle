package best.com;

import java.util.Date;
import java.util.List;

public class Vehicle {

    private List<Passenger> passengers;
    private int currentSpeed;
    private List<Wheel> wheels;
    private List<Door> doors;
    private Engine engine;
    private FuelTank fuelTank;
    private Date recentActivityDate;

    public void drive(boolean checkPassenger) {
        if (checkPassenger) {
            if (FuelTank.getVolume > 0) {
                // движение
            } else System.out.println("Can't drive, you have the empty fuel tank");
        } else System.out.println("В машине нет хотя бы одного водителя старше 18 лет");
    }

    public void pickUpPassenger(Passenger passenger) {
        // pick up
    }

    public void dropPassenger(Passenger passenger) {
        // drop passenger
    }

    public void speedUp(int currentSpeed) {
        //
    }

    public void speedDown(int currentSpeed) {
        //
    }

    public void checkSpeed(int currentSpeed) {
        //
    }

    public Date recentActivityDate()

    {
        //
        return recentActivityDate;
    }


}
