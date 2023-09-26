/*
// 1. What is a setter?
// Setters and getters are how we are able to access private variables in public classes.
// We use public set methods to access and update the value of private variables.
// 2. What is a getter?
// We use a public get method to retrieve the updated private variable that we set using our setter.
// 3. Why do you think we have/use constructors?
// We use constructors to initialize the object with a default state. It is also helpful for
// informing of dependencies. We are able to see what the class needs in order to be used
// from looking at the constructor.
// 4. What do we call the object variables Household has of type Child, Guardian, and Dog?
// Instance variables.
*/

public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        // TODO STUDENT
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void setName(String name) {
        // TODO STUDENT
        this.name = name;
    }

    public String getName() {
        // TODO STUDENT
        return this.name;
    }

    public void setAge(int age) {
        // TODO STUDENT
        this.age = age;
    }

    public int getAge() {
        // TODO STUDENT
        return this.age;
    }

    public void setBreed(String breed) {
        // TODO STUDENT
        this.breed = breed;
    }

    public String getBreed() {
        // TODO STUDENT
        return this.breed;
    }

    public static void main(String[] args) {
        Dog Buster = new Dog("Buster", 4, "Golden Retriever");
        System.out.println(
                String.format("Name: %s\nAge: %d\nBreed: %s", Buster.getName(), Buster.getAge(), Buster.getBreed()));
        Dog Tucker = new Dog("Tucker", 3, "Border Collie");
        System.out.println(
                String.format("Name: %s\nAge: %d\nBreed: %s", Tucker.getName(), Tucker.getAge(), Tucker.getBreed()));
    }
}