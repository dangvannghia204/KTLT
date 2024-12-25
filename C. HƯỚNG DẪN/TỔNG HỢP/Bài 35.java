import java.util.Scanner;

public class Bai35 {
    /*
     * Bài 35. Viết chương trình nhập vào ma trận A có n dòng, m cột, các phần từ là
     * những số
     * nguyên lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím. Thực hiện các yêu cầu
     * sau:
     * a. Tìm phần tử lớn nhất cùng với chỉ số.
     * b. Tìm và in ra các phần tử là số đối xứng (Palindrome).
     * c. Tìm và in ra các phần tử là số nguyên tố (các phần tử không phải là số
     * nguyên tố
     * được thay bằng số 0)
     * d. Sắp xếp tất cả các cột theo thứ tự tăng dần và hiển thị kết quả.
     */
    public static final Scanner sc = new Scanner(System.in);

    public static int[][] nhapMaTran() {
        int row, col; // số dòng và cột
        while (true) {
            try {
                System.out.print("Nhập số dòng: ");
                row = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập số cột: ");
                col = Integer.parseInt(sc.nextLine());
                if (row > 0 && col > 0)
                    break;
                else
                    System.out.println("Giá trị không hợp, hãy nhập lại!");
            } catch (Exception e) {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
            }
        }
        int tam[][] = new int[row][col];
        for (int i = 0; i < tam.length; i++) {
            for (int j = 0; j < tam[i].length; j++) {
                while (true) {
                    try {
                        System.out.print("Nhập giá trị: ");
                        tam[i][j] = Integer.parseInt(sc.nextLine());
                        if (tam[i][j] > 0 && tam[i][j] < 100)
                            break;
                        else
                            System.out.println("Giá trị không hợp lệ, hãy nhập lại!");
                    } catch (Exception e) {
                        System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
                    }
                }

            }

        }
        return tam;
    }

    public static void xuatMaTran(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
    }

    public static void timGiaTriLonNhat(int a[][]) {
        int max = a[0][0], rowIndex = 0, colIndex = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.printf("Giá trị lớn nhất là %d xuất hiện tại tại dòng %d và cột %d", max, rowIndex, colIndex);
    }

    public static boolean kiemTraSoDoiXung(int num) {
        int sBanDau = num, sDaoNguoc = 0;
        while (num != 0) {
            int tam = num % 10;
            sDaoNguoc = sDaoNguoc * 10 + tam;
            num /= 10;
        }
        return sBanDau == sDaoNguoc;
    }

    public static void hienThiSoDoiXung(int a[][]) {
        int dem = 0;
        System.out.print("\nKết quả: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (kiemTraSoDoiXung(a[i][j])) {
                    System.out.print("\t" + a[i][j]);
                    dem += 1;
                }

            }
        }
        if (dem == 0)
            System.out.print("Không tồn tại số đối xứng!");
    }

    public static int[] sapXepTang(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tam = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tam;
                }
            }
        }
        return a;
    }

    public static int[][] sapXepMaTran(int a[][]) {
        
        int rownum = a.length;
        int colnum = a[0].length;
        for (int j = 0; j < colnum; j++) {
            int tam[] = new int[rownum];
            for (int i = 0; i < rownum; i++) {
                tam[i] = a[i][j];
            }
            sapXepTang(tam);
            for (int i = 0; i < rownum; i++) {
                a[i][j] = tam[i];
            }

        }
        return a;
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
    public static void hienThiSoNguyenTo(int a[][])
    {
        int tam [][] = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
                if(kiemTraNguyenToFor(a[i][j]))
                {
                    tam[i][j] = a[i][j];
                }
                else
                    tam[i][j] = 0;
            }
        }
        xuatMaTran(tam);
    }
    public static void main(String[] args) {
        int tam[][] = nhapMaTran();

        System.out.println("Ma trận vừa nhập là: ");
        xuatMaTran(tam);

        // timGiaTriLonNhat(tam);

        // hienThiSoDoiXung(tam);
        System.out.println("Ma Trận sau khi sắp xếp tăng theo cột là: ");
        xuatMaTran(sapXepMaTran(tam));
       
        System.out.println("Các phần tử là số nguyên tố trong ma trận là: ");
        hienThiSoNguyenTo(tam);
        sc.close();
    }
}
