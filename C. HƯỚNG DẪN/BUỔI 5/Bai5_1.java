package buoi6;

import java.util.Scanner;

public class Bai5_1 {
    // sử dụng toán tử 3 ngôi - Ternary
    public static int timGiaTriLonNhat(int a, int b) {
        return a > b ? a : b;
    }

    public static int timGiaTriNhoNhat(int a, int b) {
        return a < b ? a : b;
    }

    // Sử dụng phương pháp so sánh
    public static int timGiaTriLonNhatSoSanh(int a, int b) {
        int max = a;
        if (max < b)
            max = b;
        return max;
    }
    public static int timGiaTriNhoNhatSoSanh(int a, int b) {
        int min = a;
        if (min > b)
            min = b;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Tạo thể hiện của lớp Scanner để nhập liệu từ bàn phím
        int num1, num2;
        System.out.print("Nhập số thứ nhất: ");
        num1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        num2 = sc.nextInt();
        System.out.printf("\nGiá trị lớn nhất của hai số %d và %d là %d", num1, num2, timGiaTriLonNhat(num1, num2));
        System.out.printf("\nGiá trị nhỏ nhất của hai số %d và %d là %d", num1, num2, timGiaTriNhoNhat(num1, num2));
        System.out.printf("\nGiá trị lớn nhất của hai số %d và %d là %d", num1, num2, timGiaTriLonNhatSoSanh(num1, num2));
        System.out.printf("\nGiá trị nhỏ nhất của hai số %d và %d là %d", num1, num2, timGiaTriNhoNhatSoSanh(num1, num2));
    }

}
