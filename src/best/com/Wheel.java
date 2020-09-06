package best.com;

public class Wheel /*implements Cloneable*/ {

    private final int diameter;

    public enum Type {SUMMER, WINTER, ALLSEASON}

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public Wheel(Type season, int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

}
