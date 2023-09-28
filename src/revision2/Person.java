package revision2;

public class Person {
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    String name;String gender; String address;
    int age;
    Person(String name,int age ,String gender,String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }


}
