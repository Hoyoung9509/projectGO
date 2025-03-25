package test;

public class Movie {
    private String name;
    private String drector;
    private String year;
    private int age;


    public Movie(String name, String drector, String year, int age) {
        this.name = name;
        this.drector = drector;
        this.year = year;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrector() {
        return drector;
    }

    public void setDrector(String drector) {
        this.drector = drector;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", drector='" + drector + '\'' +
                ", year='" + year + '\'' +
                ", age=" + age +
                '}';
    }
}

