package best.com;

// ----------------------------------------------------------------------------------
// должна включать в себя двери, колеса, мотор (enum), пассажира (отдельные классы),
// должна иметь состояние: количество пассажиров, максимум 5; начинать движение, заканчивать движение;
// увеличивать скорость, сбрасывать скорость, измерять скорость, максимум 100 км/час, высаживать пассажиров, подбирать.
// Двери в зависимости от местоположения создаются и нельзя две одинаковые засунуть
// Безобак может быть на 30, 50, 70 литров
// Объем топлива в бензобаке, тип BigDecimal
// Ещё пусть в тачке будет поле recentActivityDate и меняй мне его в зависимости от изменений
// Выполнено: ++++++++++++++++++++++++++++++++++++++++++++
// Пасскажир должен содержать имя, возраст, пол
// Машина может поехать, только если есть хоть один пассажир старше 18
// Класс колеса, должен содержать тип резины(зима,лето, демисезон) и диаметр
// Естественно его можно заправлять (бензобак)
// Реализуй клонабле для колес
// В машину всунь бензобака и проверяй количество бензина
// Метод toString в машине, должен показать состояние её

import best.com.Door;
import best.com.Wheel;

import java.util.Date;
import java.util.List;

public class Vehicle {

    private int passengerQuantity;
    private int currentSpeed;
    private List<Wheel> wheels;
    private List<Door> doors;
    private String engine;
    private int currentFuelVolume;
    private int fuelVolume;
    private Date recentActivityDate;

    public void drive(boolean checkPassenger) {
        if (checkPassenger) {
            // движение
        } else System.out.println("В машине нет хотя бы одного водителя старше 18 лет");
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


}
