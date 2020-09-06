package best.com;

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

    public static void main(String[] args) throws /*CloneNotSupportedException,*/ MyExceptions {

        Vehicle currentCar = new Vehicle();
        currentCar.addWheels(Wheel.Type.WINTER, 135);
        currentCar.addDoors();
        currentCar.addEngine("Ford", "Mustang", Engine.TypeOfFuel.PETROL);
        currentCar.addFuelTank(30, 30);
        currentCar.addPassenger(20, "John", "Wick", Passenger.Sex.MALE);
        showListOfPassengers(currentCar.getPassengers());
        currentCar.drive(1);

    }

}
