public class Household {
    private Child child;
    private Guardian guardian;
    private Dog dog;
    private double time;

    public Household(Child child, Guardian guardian, Dog dog, double time) {
        this.child = child;
        this.guardian = guardian;
        this.dog = dog;
        this.time = time;
    }

    public void setChild(Child kid) {
        child = kid;
    }

    public Child getChild() {
        return this.child;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setDog(Dog pet) {
        this.dog = pet;
    }

    public Dog getDog() {
        return dog;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public String enforceBedtime() {
        if (child.getBedtime() < time) {
            return "go to bed!";
        } else {
            return "I guess you can watch a little more tv";
        }
    }

    public static void main(String[] args) {
        Child Roman = new Child("Roman", 8, 9.30, "baseball", "yellow");
        Guardian Max = new Guardian("Max", 29, "gentle", "green");
        Dog Buster = new Dog("Buster", 4, "Golden Retriever");
        double time = 11.46;
        Household house = new Household(Roman, Max, Buster, time);
        System.out.println(String.format(
                "This family has a child named %s, a guardian named %s, a dog named %s, and it is currently %d:%d",
                house.child.getName(), house.guardian.getName(), house.dog.getName(), (int) house.getTime(),
                (int) ((house.getTime() - (int) house.getTime()) * 100)));
        Child Megan = new Child("Megan", 25, 8.30, "horseback", "yellow");
        Guardian Becca = new Guardian("Becca", 13, "harsh", "green");
        Dog Tucker = new Dog("Tucker", 3, "Border Collie");
        double time2 = 7.15;
        Household house2 = new Household(Megan, Becca, Tucker, time2);
        System.out.println(String.format(
                "This family has a child named %s, a guardian named %s, a dog named %s, and it is currently %d:%d",
                house.child.getName(), house.guardian.getName(), house.dog.getName(), (int) house.getTime(),
                (int) ((house.getTime() - (int) house.getTime()) * 100)));
        System.out.println(house.enforceBedtime());
        System.out.println(house2.enforceBedtime());

    }
}