import java.util.Scanner;

public class Bai22 {
    /* Bài 22. Viết chương trình liệt kê tất cả các xâu nhị phân độ dài n. */
    public static String xauBanDau(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += '0';
        }
        return str;
    }

    public static String nuaXauDau(String str, int n) {
        String kq;
        char[] kt = str.toCharArray();
        int len = n - 1;
        for (int i = len; i >= 0; i--) {
            if (String.valueOf(kt[i]).compareTo("1") == 0) {
                kt[i] = '0';
            } else {
                kt[i] = '1';
                break;
            }
        }
        kq = String.valueOf(kt);
        return kq;
    }

    public static String nuaXauCuoi(String str, int n) {
        String kq;
        char[] kt = str.toCharArray();
        int len = n - 1;
        for (int i = len; i >= 0; i--) {
            if (String.valueOf(kt[i]).compareTo("1") == 0) {
                kt[i] = '0';
            } else {
                kt[i] = '1';
            }
        }
        kq = String.valueOf(kt);
        return kq;
    }

    public static long soLuongXau(int n) {
        long kq = 1;
        for (int i = 0; i < n; i++) {
            kq *= 2;
        }
        return kq;
    }

    private static void xauNhiPhan(int n) {
        long sl = soLuongXau(n);
        int len = (int) sl / 2, j = 0;
        String kq1[] = new String[len], kq2[] = new String[len], kqtemp[] = new String[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                kq1[i] = xauBanDau(n);
            } else {
                kq1[i] = nuaXauDau(kq1[i - 1], n);
            }
            kqtemp[i] = kq1[i];// kqtemp là mảng tạm lưu trữ tất cả phần tử của mảng kq1
        }
        for (int k = len - 1; k >= 0; k--) {
            kq2[j] = nuaXauCuoi(kqtemp[k], n);
            j++;
        }
        for (int i = 0; i < len; i++) {
            if (i % 4 == 0) {
                System.out.print("\n");
            }
            System.out.print(kq1[i] + "\t");
        }
        for (int i = 0; i < len; i++) {
            if (i % 4 == 0) {
                System.out.print("\n");
            }
            System.out.print(kq2[i] + "\t");
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước xâu nhị phân: ");
        n = sc.nextInt();
        System.out.print("Tổng số xâu nhị phân có độ dài " + n + " bit là: " + soLuongXau(n) + " xâu");
        System.out.print("\nKết quả: ");
        xauNhiPhan(n);
    }
}
