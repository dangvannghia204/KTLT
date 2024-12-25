import java.util.Scanner;

public class Bai2 {
    /* Bài 2. Viết chương trình nhập vào 3 số a, b, c. Kiểm tra 3 số được nhập vào có phải là 3 
cạnh tam giác? Nếu đúng là 3 cạnh tam giác, cho biết loại tam giác? */

    public static void kiemTraBaCanhTamGiac(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)// Là tam giác đều
            {
                System.out.printf("Ba giá trị %.1f, %.1f, %.1f tạo thành ba cạnh của tam giác đều!",a,b,c);
            } else// Không là tam giác đều
            {
                if (a == b || b == c || a == c)// Tam giác cân
                {
                    if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)// Tam giác vuông
                    {
                        System.out.printf("Ba giá trị %.1f, %.1f, %.1f tạo thành ba cạnh của tam giác vuông cân!",a,b,c);
                    } else {
                        System.out.printf("Ba giá trị %.1f, %.1f, %.1f tạo thành ba cạnh của tam cân!",a,b,c);
                    }
                } else// Tam giác không cân
                {
                    if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                        System.out.printf("Ba giá trị %.1f, %.1f, %.1f tạo thành ba cạnh của tam giác vuông!",a,b,c);
                    } else {
                        System.out.printf("Ba giá trị %.1f, %.1f, %.1f tạo thành ba cạnh của tam giác thường!",a,b,c);
                    }
                }
            }
        }
        else
            System.out.printf("Ba giá trị %.1f, %.1f, %.1f không phải là 3 cạnh của tam giác!",a,b,c);
    }

    // Hàm nhập số thực
    public static double nhapSoThuc() {
        Scanner sc = new Scanner(System.in);
        double tam = 0;
        while (true) {
            try {
                System.out.print("Nhập giá trị: ");
                tam = Double.parseDouble(sc.next());
                break;
            } catch (Exception ex) {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại");
            }
        }
        return tam;
    }

    public static void main(String[] args) {
        double a, b, c;
        System.out.print("\nCạnh thứ nhất - ");
        a = nhapSoThuc();
        System.out.print("Cạnh thứ hai - ");
        b = nhapSoThuc();
        System.out.print("Cạnh thứ ba - ");
        c = nhapSoThuc();
        kiemTraBaCanhTamGiac(a, b, c);
    }

}
