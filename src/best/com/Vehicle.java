package best.com;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
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
    private List<Model> model;

    public void addWheels(Wheel.Type type, int diameter) throws MyExceptions {
        int SET_OF_WHEELS = 5;
        if (wheels == null) {
            wheels = new ArrayList<>();
            for (int i = 0; i < SET_OF_WHEELS; i++) {
                wheels.add(new Wheel(type, diameter));
            }
        } else throw new MyExceptions("This car has already wheels");
    }

    public void addDoors() throws MyExceptions {
        int SET_OF_DOORS = 4;
        if (doors == null) {
            doors = new ArrayList<>();
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

    public void addPassenger(Integer age, String name, String surname, Passenger.Sex sex) throws MyExceptions {
        int MAX_COUNT_OF_PASSENGERS = 5;
        if (passengers == null) {
            passengers = new ArrayList<>();
            Passenger passenger = new Passenger.Builder()
                    .age(age).name(name).surname(surname).sex(sex).build();
            passengers.add(passenger);
        } else {
            if (!(passengers.size() == MAX_COUNT_OF_PASSENGERS)) {
                Passenger passenger = new Passenger.Builder()
                        .age(age).name(name).surname(surname).sex(sex).build();
                passengers.add(passenger);
            } else throw new MyExceptions("This car is full of passengers");
        }
    }

    public boolean hasDriver() {
        return !(passengers == null);
    }

    public boolean hasFuel() {
        return fuelTank.getFuelVolume().compareTo(BigDecimal.ZERO) > 0;
    }

    public BigDecimal fuelAndDistanceRate() {
        int FUEL_RATE = 10;
        int DISTANCE_RATE = 100;
        BigDecimal fuelRate = new BigDecimal(FUEL_RATE);
        BigDecimal distanceRate = new BigDecimal(DISTANCE_RATE);
        return new BigDecimal(String.valueOf(fuelRate.divide(distanceRate)));
    }

    public boolean hasEnoughFuel(int distance, BigDecimal fuelAndDistanceRate) {
        return fuelTank.getFuelVolume().compareTo(fuelAndDistanceRate.multiply(new BigDecimal(distance))) >= 0;
    }

    private void startMove(int distance) {
        fuelTank.setFuelVolume(fuelTank.getFuelVolume().subtract
                ((fuelAndDistanceRate()).multiply(new BigDecimal(distance))));
    }

    public void drive(int distance) throws MyExceptions {
        if (hasDriver()) {
            if (hasFuel()) {
                if (hasEnoughFuel(distance, fuelAndDistanceRate())) {
                    startMove(distance);
                    System.out.println("The car has moved " + distance + " km and " + fuelTank.getFuelVolume()
                            + " litres of fuel has left");
                } else throw new MyExceptions("Can't drive such distance due to not enough of fuel volume");
            } else throw new MyExceptions("Can't drive, you have the empty fuel tank");
        } else throw new MyExceptions("There is no a driver in the car");
    }

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

    public List<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public boolean equals(Vehicle v) {
        if (this == v) return true;
        if (v == null || getClass() != v.getClass()) return false;
        return hashCode() == ((Vehicle) v).hashCode();
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + passengers.size();
        result = 31 * result + doors.size();
        return result;
    }

}
