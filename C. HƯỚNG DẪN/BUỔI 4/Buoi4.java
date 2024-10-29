package buoi4;
import java.util.Scanner;
public class Buoi4 {
    public static void bai4_1() {
        int arr[] = { 3, 5, 8, 10, 14, 25 };
        System.out.print("\nDanh sách phần tử của mảng arr là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\narr[%d] = %d", i, arr[i]);
        }
    }

    public static void bai4_2() {
        String nguHanh[] = { "kim", "mộc", "thủy", "hỏa", "thổ" };
        System.out.print("\nDanh sách phần tử của mảng nguHanh là: ");
        for (int i = 0; i < nguHanh.length; i++) {
            System.out.printf("\nnguHanh[%d] = %s", i, nguHanh[i]);
        }
    }
    public static void bai4_3()
    {
        int arr1[][] = new int[2][3];
        System.out.println("\nDanh sách phần tử của mảng arr1 là: ");
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
                System.out.printf("arr1[%d][%d]",i,j);
            }
            System.out.println();
        }
    }
    public static void bai4_4()
    {
        int arr2[][] = {{1,2,3},{4,5,6},{7}};
        System.out.println("\nDanh sách phần tử của mảng arr2 là: ");
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=0; j<arr2[i].length; j++)
            {
                System.out.printf("arr2[%d][%d] = %d\t",i,j, arr2[i][j]);
            }
            System.out.println();
        }
    }
    public static void bai4_2NC(int n)
    {
        System.out.printf("\nDanh sách các phần tử từ 1 đến n = %d là: ", n);
        for(int i = 1; i <= n; i++)
        {
            System.out.print("\t" + i);
        }
    }
    public static void bai4_3NC(int n)
    {
        System.out.printf("\nDanh sách các phần tử lẻ nhỏ hơn hoặc bằng n = %d là: ", n);
        for(int i = 1; i <= n; i++)
        {
            if(i%2!=0)
            {
                System.out.print("\t" + i);
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.print("\nNhập giá trị: ");
        num = sc.nextInt();
        bai4_1();
        bai4_2();
        bai4_3();
        bai4_4();
        bai4_2NC(num);
        bai4_3NC(num);
    }
}
