package best.com;

public class Model {

    private final String model; 
    private final int manufactureYear;

    public Model(String model, int manufactureYear) {
        this.model = model;
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

}
