public class Child {
    private String name;
    private int age;
    private double bedtime;
    private String sport;
    private String favColor;

    public Child(String name, int age, double bedtime, String sport, String favColor) {
        // TODO STUDENT
        this.name = name;
        this.age = age;
        this.bedtime = bedtime;
        this.sport = sport;
        this.favColor = favColor;
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

    public void setBedtime(double bedtime) {
        // TODO STUDENT
        this.bedtime = bedtime;
    }

    public double getBedtime() {
        // TODO STUDENT
        return this.bedtime;
    }

    public void setSport(String sport) {
        // TODO STUDENT
        this.sport = sport;
    }

    public String getSport() {
        // TODO STUDENT
        return this.sport;
    }

    public void setFavColor(String favColor) {
        // TODO STUDENT
        this.favColor = favColor;
    }

    public String getFavColor() {
        // TODO STUDENT
        return this.favColor;
    }

    public String playFetch(Dog dog) {
        // System.out.print(dog.getAge());
        if (dog.getAge() < 2 || dog.getAge() > 12) {
            return "didn't fetch the ball";
        } else if (dog.getAge() >= 2 && dog.getAge() <= 5) {
            return "got the ball but didn't bring it back";
        } else {
            return "fetched the ball";
        }
    }

    public static void main(String[] args) {
        Child Roman = new Child("Roman", 8, 9.30, "baseball", "yellow");
        Child Mya = new Child("Mya", 12, 10.15, "volleyball", "pink");
        System.out.println(String.format(
                "Meet %s. They are %d years old.\nThey go to bed at %d:%d every night.\nThey play %s, and their favorite color is %s.",
                Roman.getName(), Roman.getAge(), (int) Roman.getBedtime(),
                (int) ((Roman.getBedtime() - (int) Roman.getBedtime()) * 100), Roman.getSport(), Roman.getFavColor()));
        System.out.println(String.format(
                "Meet %s. They are %d years old.\nThey go to bed at %d:%d every night.\nThey play %s, and their favorite color is %s.",
                Mya.getName(), Mya.getAge(), (int) Mya.getBedtime(),
                (int) ((Mya.getBedtime() - (int) Mya.getBedtime()) * 100), Mya.getSport(), Mya.getFavColor()));
        Dog Tucker = new Dog("Tucker", 6, "BC");
        String test = Mya.playFetch(Tucker);
        System.out.print(test);

    }
}