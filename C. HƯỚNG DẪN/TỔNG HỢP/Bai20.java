import java.util.Scanner;

public class Bai20 {
    /**
	 * *Viết chương trình liệt kê n số nguyên tố đầu tiên.
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

	public static void lietKeNSoNguyenTo(int n) {
/* 		int dem = 0;
		for (int i = 2;; i++) {
			if (kiemTraNguyenTo(i)) {
				System.out.print("\t" + i);
				dem += 1;
				if (dem == n)
					break;
			}

		} */
		int i = 2, dem =0;
		while(dem<=n)
		{
			if(kiemTraNguyenTo(i))
			{
				System.out.print("\t" + i);
				dem +=1;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giá trị: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.printf("Danh sách %d số nguyên tố đầu tiên là: ", n);
		lietKeNSoNguyenTo(n);
	}

}
