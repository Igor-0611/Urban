public class Person {

    String name;
    int age;
    Gender gender;

    public Person (String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    enum Gender {
        MALE,
        FEMALE
    }

    @Override
    public String toString() {
        return name + " - возраст: " +age;
    }
}
