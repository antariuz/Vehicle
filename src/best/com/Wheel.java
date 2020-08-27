package best.com;

import java.util.ArrayList;
import java.util.List;

public class Wheel implements Cloneable {

    private String type;
    private int diameter;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setWheels(List<Wheel> wheels) {

    }

}
