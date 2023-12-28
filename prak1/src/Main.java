import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob"); d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        System.out.println();
        Ball b1 = new Ball("Orange","Basketball");
        Ball b2 = new Ball("Blue");
        Ball b3 = new Ball();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();
        Human h1 = new Human("David",75,"Dentist");
        System.out.println(h1);
        h1.worksStage();
    }
}