package buoi7;

import java.util.Scanner;

public class DemoWhile {
    public static void hienThiGiaTri(int n) {
        System.out.print("Danh sách các phần tử là: ");
        int i = 1;
        while (i <= n) {
            System.out.print(i + "\t");
            i++;
        }
    }
    public static float nhapDiem()
    {
        float diem = 0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try {
                System.out.print("\nNhập điểm số: ");
                diem = Float.parseFloat(sc.nextLine());
                if(diem >=0 && diem <= 10)
                    break;
                else
                {
                    System.out.print("\nĐiểm không hợp lệ, giá trị phải nằm trong khoảng từ 0-10 !!!");
                }
            } catch (Exception ex) {
                // TODO: handle exception
                System.out.println("Dữ liệu không hợp lệ, điểm phải nằm trong khoảng từ 0-10 !!!");
            }
        }
        return diem;
    }
    public static int nhapSoNguyen()
    {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try {
                System.out.print("\nNhập giá trị: ");
                n = Integer.parseInt(sc.nextLine());
                break;
                
            } catch (Exception ex) {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
            }
        }
        return n;
    }
    public static int nhapTuoi()
    {
        int tuoi = 0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try {
                System.out.print("\nNhập giá trị: ");
                tuoi = Integer.parseInt(sc.nextLine());
                if(tuoi>=0 && tuoi<= 150)
                 break;
                else
                {
                    System.out.print("\nTuổi không hợp lệ, giá trị phải nằm trong khoảng từ 0-150 !!!");
                }
                
            } catch (Exception ex) {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
            }
        }
        return tuoi;
    }
    public static void main(String[] args) {
        
        //hienThiGiaTri(nhapSoNguyen());
        nhapTuoi();
    }
}
