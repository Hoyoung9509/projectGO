package test;

public class testmo {

    private String name;
    private String date;
    private int age;

    public testmo(){}

    public testmo(String name, String date, int age){
        this.name = name;
        this.date = date;
        this.age = age;
    }

    @Override
    public String toString() {
        return "testmo{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
