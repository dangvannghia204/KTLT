package buoi6;
import java.util.Scanner;
public class Buoi6 {
    public static void bai61_1()
    {
        String hoTen = "Nguyễn Văn An";
        String ngaySinh = "20/10/2006";
        String diemTongKet = "5.5";
        String tuoi = "18";
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.parseFloat(diemTongKet));
        System.out.println("Tuổi: " + Integer.parseInt(tuoi));
        System.out.println("-----HẾT-----");
    }

    public static void bai61_2() {
        String hoTen = "Nguyễn Văn An";
        String ngaySinh = "20/10/2006";
        Float diemTongKet = 5.5f;
        int tuoi = 18;
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.toString(diemTongKet));
        System.out.println("Tuổi: " + Integer.toString(tuoi));
        System.out.println("-----HẾT-----");
    }
    public static void bai62_1()
    {
        String hoTen;
        String ngaySinh;
        String diemTongKet;
        String tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập điểm: ");
        diemTongKet = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextLine();
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.parseFloat(diemTongKet));
        System.out.println("Tuổi: " + Integer.parseInt(tuoi));
        System.out.println("-----HẾT-----");
    }
    public static void bai62_2()
    {
        String hoTen;
        String ngaySinh;
        float diemTongKet;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập điểm: ");
        diemTongKet = sc.nextFloat();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm tổng kết: " + Float.toString(diemTongKet));
        System.out.println("Tuổi: " + Integer.toString(tuoi));
        System.out.println("-----HẾT-----");
    }
    public static void main(String[] args) {
        //bai61_1();
        //bai61_2();
        //bai62_1();
        bai62_2();
    }
}
