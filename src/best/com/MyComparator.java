package best.com;

import java.util.Comparator;
import java.util.Iterator;

public class MyComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {

        Iterator<Passenger> iteratorForo1 = o1.getPassengers().iterator();
        Passenger olderPassengerInVehicleO1 = iteratorForo1.next();
        if (iteratorForo1.hasNext()) {
            Passenger olderPassengerInVehicleO1Next = iteratorForo1.next();
            while (iteratorForo1.hasNext()) {
                olderPassengerInVehicleO1 = olderPassengerInVehicleO1.getAge() > olderPassengerInVehicleO1Next.getAge()
                        ? olderPassengerInVehicleO1 : olderPassengerInVehicleO1Next;
                olderPassengerInVehicleO1Next = iteratorForo1.next();
            }
            olderPassengerInVehicleO1 = olderPassengerInVehicleO1.getAge() > olderPassengerInVehicleO1Next.getAge()
                    ? olderPassengerInVehicleO1 : olderPassengerInVehicleO1Next;
        }

        Iterator<Passenger> iteratorForo2 = o2.getPassengers().iterator();
        Passenger olderPassengerInVehicleO2 = iteratorForo2.next();
        if (iteratorForo2.hasNext()) {
            Passenger olderPassengerInVehicleO2Next = iteratorForo2.next();
            while (iteratorForo2.hasNext()){
                olderPassengerInVehicleO2 = olderPassengerInVehicleO2.getAge() > olderPassengerInVehicleO2Next.getAge()
                        ? olderPassengerInVehicleO2 : olderPassengerInVehicleO2Next;
                olderPassengerInVehicleO2Next = iteratorForo2.next();
            }
            olderPassengerInVehicleO2 = olderPassengerInVehicleO2.getAge() > olderPassengerInVehicleO2Next.getAge()
                    ? olderPassengerInVehicleO2 : olderPassengerInVehicleO2Next;
        }

        return olderPassengerInVehicleO2.getAge().compareTo(olderPassengerInVehicleO1.getAge());

    }

}
