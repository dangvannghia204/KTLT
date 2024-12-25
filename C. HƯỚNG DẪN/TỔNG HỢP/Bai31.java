import java.util.Scanner;

public class Bai31 {
    /*
     * Bài 31. Viết chương trình kiểm tra xâu nhập vào từ bàn phím có phải là
     * Palindrome không.
     * Chuỗi ký tự được gọi là Palindrome khi thực hiện đảo ngược các ký tự của
     * chuỗi thì nhận
     * được kết quả là chuỗi ban đầu. Ví dụ: “Madam” là Palindrome. (Không phân biệt
     * chữ hoa
     * chữ thường).
     */
    public static void nhapChuoi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập vào một chuỗi ký tự: ");
        String chuoi = sc.nextLine();
        sc.close();

        if (kiemTraChuoiDoiXung(chuoi)) {
            System.out.println("\"" + chuoi + "\" là chuỗi đối xứng");
        } else {
            System.out.println("\"" + chuoi + "\" không phải là chuỗi đối xứng");
        }
    }

    public static boolean kiemTraChuoiDoiXung(String str) {
        //\s+ thay thế tất cả các khoảng trắng bằng ""
        String chuoiTam = str.replaceAll("\\s+", "").toLowerCase();
        int chieuDai = chuoiTam.length();
        for (int i = 0; i < chieuDai / 2; i++) {
            if (chuoiTam.charAt(i) != chuoiTam.charAt(chieuDai - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        nhapChuoi();
    }
}

