public class Guardian {
    private String name;
    private int age;
    private String parentingStyle;
    private String favColor;

    public Guardian(String name, int age, String parentingStyle, String favColor) {
        this.name = name;
        this.age = age;
        this.parentingStyle = parentingStyle;
        this.favColor = favColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setParentingStyle(String parentingStyle) {
        this.parentingStyle = parentingStyle;
    }

    public String getParentingStyle() {
        return parentingStyle;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getFavColor() {
        return favColor;
    }

    public String play(Child child) {
        if (child.getFavColor().contains("blue") || child.getFavColor().contains("orange")
                || child.getFavColor().contains("black")) {
            return "played pretend";
        }
        if (child.getSport().contains("ball")) {
            return "played sports";
        }
        if (child.getAge() > 12) {
            return "played video games";
        } else {
            return "played board games";
        }
    }

    public Boolean watchTv(Child child, double time) {
        if (child.getBedtime() < time) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Guardian Max = new Guardian("Max", 29, "gentle", "green");
        System.out.println(
                String.format("Meet %s. They are age %d, their favorite color is %s, and they are a %s parent.",
                        Max.getName(), Max.getAge(), Max.getFavColor(), Max.getParentingStyle()));
        Child Sebastian = new Child("Sebastian", 9, 7.15, "pickleball", "blue");
        Child Rebecca = new Child("Rebecca", 13, 9.15, "underwater basket weaving", "purple");
        String test = Max.play(Sebastian);
        String test2 = Max.play(Rebecca);
        System.out.println(test);
        System.out.println(test2);
        System.out.println(Max.watchTv(Rebecca, 10.15));
    }
}