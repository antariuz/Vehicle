package best.com;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Vehicle currentCar = new Vehicle();
        Wheel wheel = new Wheel();
        Wheel wheel_2_clone = (Wheel) wheel.clone();
        Wheel wheel_3_clone = (Wheel) wheel.clone();
        Wheel wheel_4_clone = (Wheel) wheel.clone();

        currentCar.addWheel(wheel);

    }
}
