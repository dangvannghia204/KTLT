import java.util.Scanner;

public class Bai1 {
    /**
     * Giải phương trình bậc hai có dạng ax2 + bx + c = 0 (a # 0) a là tham số bậc 2
     * b là tham số bậc 1 c là số hạng tự do
     */
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("\nPhương trình vô nghiệm");
            } else {
                System.out.printf("\nPhương trình có nghiệm duy nhất x = %.1f",(-c / b));
            }
        } else {
            float delta = b * b - 4 * a * c;
            float x1, x2;
            if (delta < 0) {
                System.out.printf("\nGiá trị delta = %.1f", delta);
                System.out.print("\nPhương trình vô nghiệm!");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.printf("\nGiá trị delta = %.1f", delta);
                System.out.printf("\nPhương trình có nghiệm kép x1 = x2 = %.1f", x1);
            } else {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.printf("\nGiá trị delta = %.1f", delta);
                System.out.printf("\nPhương trình có hai nghiệm phân biệt x1 = %.1f và x2 = %.1f", x1, x2);
            }
        }
    }

    // Hàm nhập số thực
    public static float nhapSoThuc() {
        Scanner sc = new Scanner(System.in);
        float tam = 0;
        while (true) {
            try {
                System.out.print("Nhập số thực: ");
                tam = Float.parseFloat(sc.next());
                break;
            } catch (Exception ex) {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại");
            }
        }
        sc.close();
        return tam;
    }

    public static void main(String[] args) {
        float a, b, c;
        a = nhapSoThuc();
        b = nhapSoThuc();
        c = nhapSoThuc();
        System.out.printf("Các giá trị vừa nhập là a= %.1f, b=%.1f, c= %.1f", a, b, c);
        giaiPTBac2(a, b, c);
    }
}
