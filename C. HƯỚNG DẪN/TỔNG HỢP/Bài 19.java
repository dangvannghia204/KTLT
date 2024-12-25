import java.util.Scanner;

public class Bai19 {
    /**
	 * Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.
	 * 
	 * @param args
	 */
	public static boolean kiemTraNguyenTo(int num) {
		boolean kq = true;
		if (num == 0 || num == 1)
			return false;
		int i = 2;
		int tam = (int) Math.sqrt(num);
		while (i <= tam) {
			if (num % i == 0) {
				kq = false;
				break;
			}
			i++;
		}
		return kq;
	}

	public static void lietKeSoNguyenTo(int n) {
		for (int i = 2; i < n; i++) {
			if (kiemTraNguyenTo(i))
				System.out.print(i + "\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giá trị: ");
		int n = Integer.parseInt(sc.nextLine());
		if (n <= 2)
			System.out.printf("Không tồn tại số nguyên tố nhỏ hơn %d", n);
		else {
			System.out.printf("Các số nguyên tố nhỏ hơn %d là: ", n);
			lietKeSoNguyenTo(n);
		}
	}

}
