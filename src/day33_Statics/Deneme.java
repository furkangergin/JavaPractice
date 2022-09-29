package day33_Statics;

public class Deneme {
    public void main(String[] args) {

        int a = 10;
        //public static int b = 20;
        System.out.println(A.b);
        A.b = 40;
        System.out.println("A.b = " + A.b);
        C furkan = new C();
        System.out.println("furkan.d = " + furkan.d);

    }

    static class A {
        public static int b = 20;
    }

    static class B {
        public static int c = 30;
    }

    public class C {
        public int d = 40;
    }

    public class D {
        public int e = 50;
        C furkan = new C();

    }
}
