package best.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void showListOfPassengers(List<Passenger> passengers) {
        for (int i = 0; i < passengers.size(); i++) {
            if (i == 0) {
                System.out.println("\n" + "Driver: " + passengers.get(i).getName() +
                        " " + passengers.get(i).getSurname());
            } else if (i == 1) {
                System.out.println(i + "st passenger: " + passengers.get(i).getName() +
                        " " + passengers.get(i).getSurname());
            } else if (i == 2) {
                System.out.println(i + "nd passenger: " + passengers.get(i).getName() +
                        " " + passengers.get(i).getSurname());
            } else if (i == 3) {
                System.out.println(i + "rd passenger: " + passengers.get(i).getName() +
                        " " + passengers.get(i).getSurname());
            } else if (i == 4) {
                System.out.println(i + "th passenger: " + passengers.get(i).getName() +
                        " " + passengers.get(i).getSurname());
            }
        }
    }

    public static void showListOfSort(List<Vehicle> vehicleList, String kindOfList) throws MyExceptions {
        if (kindOfList.equals("unsorted")) {
            System.out.println("-----------------------------------");
            System.out.println("Unsorted list of vehicle:");
        } else if (kindOfList.equals("sorted")) {
            System.out.println("-----------------------------------");
            System.out.println("Sorted list of vehicles by the oldest passenger:");
        } else throw new MyExceptions("Use only \"sorted\" or \"unsorted\"");
        int i = 1;
        for (Vehicle vehicle : vehicleList) {
            System.out.println(i++ + ") " + vehicle.getEngine().getBrand() + " " + vehicle.getEngine().getModel());
            int j = 1;
            for (Passenger passenger : vehicle.getPassengers()) {
                System.out.println("    " + j++ + ") " + passenger.getName() + " " + passenger.getAge() + " years old");
            }
        }
    }

    public static void main(String[] args) throws /*CloneNotSupportedException,*/ MyExceptions {

        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle car1 = new Vehicle();
        car1.addWheels(Wheel.Type.WINTER, 35);
        car1.addDoors();
        car1.addEngine("Ford", "Mustang", Engine.TypeOfFuel.PETROL);
        car1.addFuelTank(30, 30);
        car1.addPassenger(9, "John", "Wick", Passenger.Sex.MALE);
//        car1.addPassenger(9, "John", "Wick", Passenger.Sex.MALE);
        car1.addPassenger(190, "Sponge", "Bob", Passenger.Sex.MALE);
//        showListOfPassengers(car1.getPassengers());
//        car.drive(1);

        Vehicle car2 = new Vehicle();
        car2.addWheels(Wheel.Type.ALLSEASON, 135);
        car2.addDoors();
        car2.addEngine("Toyota", "Camry", Engine.TypeOfFuel.GAS);
        car2.addFuelTank(30, 30);
        car2.addPassenger(8, "Michael", "Jackson", Passenger.Sex.MALE);
        car2.addPassenger(120, "Harry", "Potter", Passenger.Sex.MALE);

        Vehicle car3 = new Vehicle();
        car3.addWheels(Wheel.Type.SUMMER, 85);
        car3.addDoors();
        car3.addEngine("Nigga", "Car", Engine.TypeOfFuel.PETROL);
        car3.addFuelTank(30, 30);
        car3.addPassenger(220, "Mike", "Tyson", Passenger.Sex.MALE);

        vehicleList.add(car1);
        vehicleList.add(car2);
        vehicleList.add(car3);

        showListOfSort(vehicleList, "unsorted");
        Comparator<Vehicle> ageComparator = new MyComparator();
        vehicleList.sort(ageComparator);
        showListOfSort(vehicleList, "sorted");

    }

}
