public class Bai14 {
    /*
     * Bài 14. Viết chương trình có định nghĩa hàm tìm giá trị lớn nhất trong 3 số
     * nguyên cho
     * trước.
     */
    public static int timGiaTriLonNhatBaSo(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max)
            max = num2;
        if (num3 > max)
            max = num3;
        return max;
    }

    public static void main(String[] args) {
        int a = 3, b = 5, c = 8;
        System.out.printf("Giá trị lớn nhất của 3 số %d, %d, %d là %d ", a, b, c, timGiaTriLonNhatBaSo(a, b, c));
    }
}
