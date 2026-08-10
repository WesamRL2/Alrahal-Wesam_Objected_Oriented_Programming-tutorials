package tutorials.week_3_4;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Wesam", "P001");
        Person p2 = new Student("Wesam", "S001");
        Person p3 = new Lecturer("Ahmed", "L001");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}