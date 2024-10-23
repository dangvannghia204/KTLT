package buoi5;

public class Bai5_2 {
    public static void viDu1() {
        int a = 3;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a++ + 1);
        System.out.println(++a + 1);
    }

    public static void viDu2() {
        int a = 0, b, c;
        a++;
        b = a;
        c = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static void main(String[] args) {
        viDu1();
        viDu2();
    }
}
