import java.util.Scanner;

public class Bai33 {
    /* Bài 33. Viết chương trình thực hiện các thao tác sau đối với một chuỗi cho trước
a. Đếm số lượng từ ‘Java’ có trong chuỗi.
b. Lấy vị trí của từ ‘Java’ cuối cùng có trong chuỗi.
c. Thay thế từ ‘Java’ bằng từ ‘java’ trong chuỗi.
d. Đếm số lượng ký tự là số có trong chuỗi. */
    // Nhập chuỗi
    /**
     * @return str
     */
    public static final Scanner sc = new Scanner (System.in);
    public static String nhapChuoi() {
        String str = "";
        System.out.print("Nhập chuỗi: ");
        str = sc.nextLine();
        return str;
    }

    // Xuất chuỗi
    public static void xuatChuoi(String str[]) {
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i] + " ");
    }

    // //Hàm xuất chuỗi
    // public static void xuatChuoi(String str) {
    // System.out.println("Chuỗi ban đầu: " + str);
    // }
    // Xác định vị trí của từ trong chuỗi
    public static void xacDinhViTriCuaTuTrongChuoi(String str, String word) {
        int vt = -1;
        String tam[] = str.split("\\s+");
        System.out.printf("\nCác vị trí xuất hiện từ %s trong chuỗi là: ", word);
        for (int i = 0; i < tam.length; i++) {
            if (tam[i].toLowerCase().equals(word.toLowerCase())) {
                System.out.print("\t" + i);
                vt = i;
            }
        }
        if (vt == -1) {
            System.out.printf("Từ %s không tìm thấy trong chuỗi", word);
        }
    }

    // Đếm số từ của chuỗi vừa nhập
    public static int demSoTu(String str) {
        if (str == null || str.isEmpty())
            return 0;
        String tam[] = str.split("\\s+");
        return tam.length;
    }

    // Thay thế từ trong chuỗi
    public static void thayTheTuTrongChuoi(String str, String word) {
        String tam[] = str.split("\\s+");
        if (demTuTrongChuoi(str, word) != 0) {
            for (int i = 0; i < tam.length; i++) {
                if (tam[i].equalsIgnoreCase(word))
                    tam[i] = word;
            }
            System.out.printf("\nChuỗi sau khi thay thế từ '%s' là: ", word);
            xuatChuoi(tam);
        } else {
            System.out.printf("\nTừ '%s' không xuất hiện trong chuỗi đã cho\n", word);
        }
    }

    // Đếm số lần xuất hiện của một từ trong chuỗi
    public static int demTuTrongChuoi(String str, String word) {
        int dem = 0;
        String tam[] = str.split("\\s+");
        for (int i = 0; i < tam.length; i++) {
            if (tam[i].toLowerCase().equals(word.toLowerCase())) {
                dem += 1; //dem = dem + 1
            }
        }
        return dem;
    }

    // Đếm số lượng ký tự là số có trong chuỗi.
    public static void demKyTuSoTrongChuoi(String str) {
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                dem += 1;// dem = dem + 1;
        }
        System.out.print("\nSố lượng ký tự số trong chuỗi đã cho là: " + dem);
    }

    public static String tuDaiNhat(String str) {
        String tam[] = str.split("\\s+");// cắt ký tự trắng và ký tự \t và \n
        String word = tam[0];// Giả định phần tử đầu tiên là từ dài nhất
        for (int i = 1; i < tam.length; i++) {
            if (word.length() < tam[i].length()) {
                word = tam[i];
            }
        }
        return word;
    }

    public static int kichThuocTuDaiNhat(String str) {
        String tam[] = str.split("\\s+");
        String word = tam[0];
        for (int i = 1; i < tam.length; i++) {
            if (word.length() < tam[i].length()) {
                word = tam[i];
            }
        }
        return word.length();
    }

    public static int viTriTuDaiNhatDauTien(String str) {
        String tam[] = str.split("\\s+");
        String word = tam[0];
        int vt = 0;
        for (int i = 1; i < tam.length; i++) {
            if (word.length() < tam[i].length()) {
                word = tam[i];
                vt = i;
            }
        }
        return vt;
    }

    public static int viTriTuDaiNhatCuoiCung(String str) {
        String tam[] = str.split("\\s+");
        String word = tam[0];
        int vt = 0;
        for (int i = 1; i < tam.length; i++) {
            if (word.length() <= tam[i].length()) {
                word = tam[i];
                vt = i;
            }
        }
        return vt;
    }

    public static void thongTinTuDaiNhat(String str) {
        int vt = -1;
        String tamString = "";
        String word = "";
        int tam = 0, max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 32 && str.charAt(i) != 92) {// Ký tự trắng và \t và \n
                tam++;
                tamString += str.charAt(i);
                if (i == str.length() - 1 && tam > max) {
                    max = tam;
                    vt = i - max + 1;
                    word = tamString;
                }
            } else {
                if (tam > max) {
                    max = tam;
                    vt = i - max + 1;
                    word = tamString;
                }
                tamString = "";
                tam = 0;
            }
        }
        System.out.printf("\nChiều dài từ dài nhất trong chuỗi là %d", max);
        System.out.printf("\nTừ dài nhất trong chuỗi xuất hiện tại vị trí %d", vt);
        System.out.printf("\nTừ dài nhất trong chuỗi đã cho là %s", word);
        // return vt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tam = "Nghieng nghieng 123 cau ho 12345";
        String word = "";
        //String tam = nhapChuoi();
        System.out.print("Chuỗi vừa nhập: " + tam);
        System.out.print("\nTừ dài nhất trong chuỗi là: " + tuDaiNhat(tam));
        System.out.print("\nKích thước từ dài nhất trong chuỗi là: " + kichThuocTuDaiNhat(tam));
        System.out.print("\nVị trí từ dài nhất đầu tiên trong chuỗi là: " + viTriTuDaiNhatDauTien(tam));
        System.out.print("\nVị trí từ dài nhất cuối cùng trong chuỗi là: " + viTriTuDaiNhatCuoiCung(tam));
        System.out.print("\nNhập từ cần tìm: ");
        word = sc.nextLine();
        System.out.printf("Số lần xuất hiện của từ '%s' trong chuỗi ban đầu: %d\n",word,demTuTrongChuoi(tam, word));
        demKyTuSoTrongChuoi(tam);
        thayTheTuTrongChuoi(tam, word);
        xacDinhViTriCuaTuTrongChuoi(tam, word);
        
        // System.out.print("\nChiều dài chuỗi vừa nhập: " + demSoTu(str));
        // System.out.print("\nNhập từ cần tìm: ");
        // word = sc.nextLine();

        // );
        // if (xacDinhViTriCuaTuTrongChuoi(str, word) >= 0) {
        // System.out.printf("Vị trí của từ '%s' cuối cùng trong chuỗi là: %d", word,
        // xacDinhViTriCuaTuTrongChuoi(str, word));
        // } else {
        // System.out.printf("Từ '%s' không xuất hiện trong chuỗi đã cho", word);
        // }
        // System.out.print("\nNhập từ cần thay thế: ");
        // word = sc.nextLine();
        // thayTheTuTrongChuoi(str, word);
        //
        // // System.out.println("Từ dài nhất là: " + tuDaiNhat(str));
        //
    }
}
