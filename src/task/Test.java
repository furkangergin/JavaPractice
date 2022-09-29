package task;

public class Test {

    public static void main(String[] args) {

        Encapsulation_Square e = new Encapsulation_Square(5);

        System.out.println("e.getSide() = " + e.getSide());

        e.setSide(10);

        System.out.println("e.area() = " + e.area());
        System.out.println("e.perimeter() = " + e.perimeter());

        System.out.println(e);
    }
}
