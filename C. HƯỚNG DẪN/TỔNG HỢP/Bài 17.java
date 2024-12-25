import java.util.Scanner;

public class Bai17 {
    // Viết chương trình cho phép nhập vào một chuỗi và in ra màn hình chuỗi đảo
	// ngược.
	/**
	 * @return
	 */
	public static String nhapChuoi() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("Nhập chuỗi: ");
		str = sc.nextLine();
		sc.close();
		System.out.print("Chuỗi vừa nhập: " + str);
		return str;
	}

	public static void xuatChuoiDaoNguoc(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		String str = nhapChuoi();
		System.out.print("\nChuỗi đảo ngược: ");
		xuatChuoiDaoNguoc(str);
	}
}
