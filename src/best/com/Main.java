package best.com;

import java.util.ArrayList;

public class Main {

    public static void showListOfPassengers(ArrayList<Passenger> passengers) {
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

    public static ArrayList<Passenger> createPassengerTest() {
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        Passenger mJ = new Passenger.Builder()
                .age(35)
                .name("Michael")
                .surname("Jackson")
                .build();
        passengers.add(mJ);
        Passenger eM = new Passenger.Builder()
                .age(35)
                .name("Elon")
                .surname("Musk")
                .build();
        passengers.add(eM);
        return passengers;
    }

    public static void main(String[] args) throws /*CloneNotSupportedException,*/ MyExceptions {

        Vehicle currentCar = new Vehicle();
        showListOfPassengers(createPassengerTest());
        currentCar.addWheels(Wheel.Type.WINTER, 135);
        currentCar.addDoors();
        currentCar.addEngine("TOYOTA", "CAMRY V30", Engine.TypeOfFuel.PETROL);
        currentCar.addFuelTank(30, 0);
    }

}
