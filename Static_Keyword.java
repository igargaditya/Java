class NewSchool {
    private static NewSchool school = new NewSchool();

    private NewSchool() {
        System.out.println("New School Created");
    }

    public static NewSchool getSchool() {
        return school;
    }

}

class Static {
    private int age;
    public static int count = 0;

    static {
        // Used to initialize
        count = 10;
    }

    Static() {
        count++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void getCount() {
        System.out.println("Number of instances, " + count);
    }

}

public class Static_Keyword {
    public static void main(String[] args) {
        Static s1 = new Static();
        s1.setAge(20);
        Static s2 = new Static();
        s2.setAge(21);
        Static s3 = new Static();
        s3.setAge(23);
        System.out.println(Static.count);
        Static.getCount();

        NewSchool.getSchool(); // Only 1 instance will be made always and constuctor would be called only once
        NewSchool.getSchool();

    }
}
