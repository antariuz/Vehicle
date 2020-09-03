package best.com;

import java.util.ArrayList;
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

    public void drive(boolean checkPassenger) throws MyExceptions {
//        if (checkPassenger) {
//            if (FuelTank.getCurrentVolume > 0) {
//                // движение
//            } throw new MyExceptions("Can't drive, you have the empty fuel tank");
//        } else throw new MyExceptions("В машине нет хотя бы одного водителя старше 18 лет");
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

//    @Override
//    public String toString() {
//        return
//                "Quantity of Passengers: " + passengerQuantity + "\n" +
//                        "Current speed: " + currentSpeed + "\n" +
//                        "Level of Fuel: " + currentFuelVolume + "\n" +
//                        "Volume of Fuel Tank: " + fuelVolume + "\n" +
//                        "Last Activity Date: " + recentActivityDate + "\n"
//                ;
//    }

    public void addWheels(){
            wheels.add(new Wheel("Winter",135));
    }

}
