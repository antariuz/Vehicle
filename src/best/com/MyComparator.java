package best.com;

import java.util.Comparator;

public class MyComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {

        Passenger olderPassengerInVehicleO1 = o1.getPassengers().get(0);
        for (int i = 0; i < o1.getPassengers().size() - 1; i++) {
            olderPassengerInVehicleO1 = olderPassengerInVehicleO1.getAge() > o1.getPassengers().get(i + 1).getAge()
                    ? olderPassengerInVehicleO1 : o1.getPassengers().get(i + 1);
        }

        Passenger olderPassengerInVehicleO2 = o2.getPassengers().get(0);
        for (int i = 0; i < o2.getPassengers().size() - 1; i++) {
            olderPassengerInVehicleO2 = olderPassengerInVehicleO2.getAge() > o2.getPassengers().get(i + 1).getAge()
                    ? olderPassengerInVehicleO2 : o2.getPassengers().get(i + 1);
        }

        int oldestPassengerInVehicles =
                olderPassengerInVehicleO2.getAge().compareTo(olderPassengerInVehicleO1.getAge());
        return oldestPassengerInVehicles;

    }

}
