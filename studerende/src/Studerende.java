public class Studerende {

    String name;
    int age;
    String city = "Næstved";
    String major = "Datamatiker";
    Studerende(String name, int age, String city, String major){
        this.name = name;
        this.age = age;
        this.city = city;
        this.major = major;
    }

    Studerende(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    Studerende(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
}
