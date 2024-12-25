import java.util.Scanner;

public class Bai18 {
    /**
     * Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố. Ví dụ:
     * Số 28 được phân tích thành 2 x 2 x 7. for (int i = 2; i <= num; i++) { while
     * (num % i == 0) { System.out.print("\t" + i); num /= i; } }
     * 
     * @param args
     */
    public static void phanTichThanhThuaSoNguyenTo(int num) {
        int i = 2;
        while (num > 1) {
            if (num % i == 0) {
                System.out.print("\t" + i);
                num /= i;
            } else
                i++;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.printf("Kết quả phân tích '%d' thành: ", num);
        phanTichThanhThuaSoNguyenTo(num);
    }
}
