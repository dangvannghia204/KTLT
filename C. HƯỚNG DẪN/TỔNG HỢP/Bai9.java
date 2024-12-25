import java.util.Scanner;

public class Bai9 {
   /*  Bài 9. Viết chương trình tính tổng các số lẻ từ 1 đến n. */
    public static int tongSoLe(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                tong += i; // tong = tong + i
            }
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập giá trị: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.printf("Tổng các số lẻ từ 1 đến %d là %d", n, tongSoLe(n));
    }
}
