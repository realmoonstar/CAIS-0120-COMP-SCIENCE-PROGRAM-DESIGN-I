package PersonApp;

public class Person {

    private String name;
    private char gender;
    private int age;

    public Person() {
        name = "";
        gender = 'm';
        age = 0;
    }

    public Person(String newName, char newGender, int newAge) {
        name = newName;
        gender = newGender;
        age = newAge;
    }

    public void growOlder(int numberYears) {
        if (age + numberYears >= 0)
            age += numberYears;
        else
            age = 0;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name +
               " | Gender: " + gender +
               " | Age: " + age;
    }
}
