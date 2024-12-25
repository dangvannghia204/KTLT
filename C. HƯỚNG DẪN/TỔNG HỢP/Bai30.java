public class Bai30 {
    /*
     * Bài 30. Số đối xứng (Palindrome) là số nhận được khi thực hiện đảo ngược các
     * chữ số của nó cho kết quả bằng số ban đầu. Ví dụ: 121, 3553.Viết chương trình
     * kiểm tra số nguyên
     * dương n nhập vào từ bàn phím có phải là số đối xứng (Palindrome) không. Nếu
     * đúng thì
     * hiển hiện thông báo “Số vừa nhập là số đối xứng”, ngược lại hiển thị thông
     * báo “Số vừa nhập không phải là số đối xứng”.
     */
    public static boolean kiemTraSoDoiXung(int num) {
        int sBanDau = num, sDaoNguoc = 0;
        while (num != 0) {
            int tam = num % 10;
            sDaoNguoc = sDaoNguoc * 10 + tam;
            num /= 10;
        }
        return sBanDau == sDaoNguoc;
    }
    public static void xuatSoDoiXung(int n) {
        if (kiemTraSoDoiXung(n))
            System.out.printf("\n%d là số đối xứng!", n);
        else
            System.out.printf("\n%d không phải là số đối xứng!", n);
    }

    // (***) Nhập từ bàn phím số nguyên và hiển thị số đảo ngược
    public static void soDaoNguoc(int num) {
        System.out.printf("\nĐảo ngược của số %d là ", num);
        while (num != 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }
    public static void main(String[] args) {
        xuatSoDoiXung(1221);
        soDaoNguoc(123);

    }
}
