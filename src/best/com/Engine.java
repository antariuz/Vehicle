package best.com;

public class Engine {

    private String brand;
    private String model;
    private TypeOfFuel typeOfFuel;

    public Engine(String brand, String model, TypeOfFuel type) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TypeOfFuel getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(TypeOfFuel typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public enum TypeOfFuel {PETROL, DIESEL, GAS}

}
