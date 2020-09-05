package best.com;

import java.math.BigDecimal;
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

    public void addWheels(Wheel.Type type, int diameter) throws MyExceptions {
        int SET_OF_WHEELS = 5;
        if (wheels == null) {
            wheels = new ArrayList<Wheel>();
            for (int i = 0; i < SET_OF_WHEELS; i++) {
                wheels.add(new Wheel(type, diameter));
            }
        } else throw new MyExceptions("This car has already wheels");
    }

    public void addDoors() throws MyExceptions {
        int SET_OF_DOORS = 4;
        if (doors == null) {
            doors = new ArrayList<Door>();
            for (int i = 0; i < SET_OF_DOORS; i++) {
                switch (i) {
                    case 0:
                        doors.add(new Door(Door.Side.LEFT_FRONT_DOOR));
                        break;
                    case 1:
                        doors.add(new Door(Door.Side.RIGHT_FRONT_DOOR));
                        break;
                    case 2:
                        doors.add(new Door(Door.Side.LEFT_REAR_DOOR));
                        break;
                    case 3:
                        doors.add(new Door(Door.Side.RIGHT_REAR_DOOR));
                        break;
                }
            }
        } else throw new MyExceptions("This car has already doors");
    }

    public void addEngine(String brand, String model, Engine.TypeOfFuel fuelType) throws MyExceptions {
        if (engine == null) {
            this.engine = new Engine(brand, model, fuelType);
        } else throw new MyExceptions("This car has already engine");
    }

    private boolean isValidTankVolume(BigDecimal tankVolume) {
        return ((tankVolume.compareTo(FuelTank.FUEL_VOLUME_30_L) == 0) ||
                (tankVolume.compareTo(FuelTank.FUEL_VOLUME_50_L) == 0) ||
                (tankVolume.compareTo(FuelTank.FUEL_VOLUME_70_L) == 0));
    }

    private boolean isValidFuelVolume(BigDecimal tankVolume, BigDecimal fuelVolume) {
        return tankVolume.compareTo(fuelVolume) >= 0;
    }

    public void addFuelTank(int initialTankVolume, int initialFuelVolume) throws MyExceptions {
        if (fuelTank == null) {
            BigDecimal tankVolume = new BigDecimal(initialTankVolume);
            if (!isValidTankVolume(tankVolume)) {
                throw new MyExceptions("The tank volume must be 30, 50 or 70 litres");
            }
            BigDecimal fuelVolume = new BigDecimal(initialFuelVolume);
            if (!isValidFuelVolume(tankVolume, fuelVolume)) {
                throw new MyExceptions("Inputted fuel volume is larger than tank volume");
            }
            this.fuelTank = new FuelTank(tankVolume, fuelVolume);
        } else throw new MyExceptions("This car has already fuel tank");
    }

    public boolean checkDriver() {
        return true;
    }

//    public void drive() {
//        if (checkDriver()) {
//            if (FuelTank.getCurrentVolume > 0) {
//                // движение
//            } throw new MyExceptions("Can't drive, you have the empty fuel tank");
//        } else throw new MyExceptions("В машине нет хотя бы одного водителя старше 18 лет");
//    }

//    public void refuel(BigDecimal inFuel) {
//        // заправка
//        if ((((currentVolume.add(inFuel)).compareTo(volume)) > 0)) {
//            currentVolume = volume;
//        } else {
//            currentVolume = currentVolume.add(inFuel);
//        }
//    }

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

    public Date recentActivityDate() {
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


    public List<Wheel> getWheels() {
        return wheels;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

}
