package best.com;

public class Wheel /*implements Cloneable*/ {

    private int diameter;
    private Type type;

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

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {SUMMER, WINTER, ALLSEASON}

}
