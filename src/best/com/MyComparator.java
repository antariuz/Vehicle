package best.com;

import java.util.Comparator;
import java.util.Iterator;

public class MyComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {

        Iterator<Passenger> iteratorForo1 = o1.getPassengers().iterator();
        Passenger olderPassengerInVehicleO1 = o1.getPassengers().iterator().next();
        while (iteratorForo1.hasNext()) {
            olderPassengerInVehicleO1 = olderPassengerInVehicleO1.getAge() > o1.getPassengers().iterator().next().getAge()
                    ? olderPassengerInVehicleO1 : o1.getPassengers().iterator().next();
        }
        Iterator<Passenger> iteratorForo2 = o2.getPassengers().iterator();
        Passenger olderPassengerInVehicleO2 = o2.getPassengers().iterator().next();
        while (iteratorForo2.hasNext()){
            olderPassengerInVehicleO2 = olderPassengerInVehicleO2.getAge() > o2.getPassengers().iterator().next().getAge()
                    ? olderPassengerInVehicleO2 : o2.getPassengers().iterator().next();
        }

        return olderPassengerInVehicleO2.getAge().compareTo(olderPassengerInVehicleO1.getAge());

    }

}
