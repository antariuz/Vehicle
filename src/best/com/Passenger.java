package best.com;

public class Passenger {

    private Integer age;
    private String name;
    private String surname;

    private enum sex {Male, Female}

    public static class Builder {

        private final Passenger newPassenger;

        public Builder() {
            newPassenger = new Passenger();
        }

        public Builder age(int age) {
            newPassenger.age = age;
            return this;
        }

        public Builder name(String name) {
            newPassenger.name = name;
            return this;
        }

        public Builder surname(String surname) {
            newPassenger.surname = surname;
            return this;
        }

//        public Builder sex(Enum sex) {
//            newPassenger. = sex;
//            return this;
//        }

        public Passenger build() {
            return newPassenger;
        }

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
