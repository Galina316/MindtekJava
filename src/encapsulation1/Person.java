package encapsulation1;

public class Person {
    private String name;
    private int age;
    private char gender;
    private boolean isAdult;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isAdult=" + isAdult +
                '}';
    }

    public Person(String name, int age, char gender, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isAdult = isAdult;
    }
}

