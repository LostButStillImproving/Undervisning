public class Studerende {

    String name;
    int age;
    String city;
    String major = "Datamatiker";

    Studerende(){
        this.name = name;
        this.age = age;
        this.city = city;
        this.major = "Datamatiker";
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
