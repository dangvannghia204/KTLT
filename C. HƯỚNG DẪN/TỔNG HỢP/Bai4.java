import java.util.Scanner;

public class Bai4 {
    /**
	 * Viết chương trình kiểm tra số nguyên dương N nhập vào từ bàn phím có phải là
	 * số nguyên tố không? Số nguyên tố là số tự nhiên có đúng 2 ước số là 1 và
	 * chính nó. Hoặc Số nguyên tố là số nguyên dương chỉ chia hết cho 1 và chính
	 * nó. 0 và 1 không phải là số nguyên tố. Ví dụ: 2, 3, 5, 7, 11, 13, 17, 19, 23,
	 * ... Chỉ cần xét từ 2 đến căn bậc 2 của n. Nếu n chia hết cho các số từ 2 đến
	 * căn bậc 2 của n => n không phải là số nguyên tố
	 */
	// Hàm kiểm tra số nguyên tố
	public static boolean kiemTraNguyenToWhile(int n) {
		boolean kq = true;
		if (n == 1 || n == 0)
			return false;
		int i = 2;
		int tam = (int) Math.sqrt(n);
		while (i <= tam) {
			if (n % i == 0) {
				kq = false;
				break;
			}
			i++;
		}
		return kq;
	}

	//Hàm kiểm tra số nguyên tố
	public static boolean kiemTraNguyenToFor(int n) {
		boolean kq = true;
		if (n == 1 || n == 0)
			return false;
		int tam = (int) Math.sqrt(n);
		for (int i = 2; i <= tam; i++) {
			if (n % i == 0) {
				kq = false;
				break;
			}
		}
		return kq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giá trị: ");
		n = Integer.parseInt(sc.nextLine());
		if (kiemTraNguyenToFor(n) == true)
			System.out.printf("%d là số nguyên tố", n);
		else {
			System.out.printf("%d không phải số nguyên tố", n);
		}
	}
}
