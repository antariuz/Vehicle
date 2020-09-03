package best.com;

import java.util.List;

public class Wheel implements Cloneable {

    private enum type {
        Summer, Winter, Allseason
    }

    private int diameter;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setWheels(List<Wheel> wheels) {

    }

    public Wheel(String type, int diameter) {
        this.type = type;
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
