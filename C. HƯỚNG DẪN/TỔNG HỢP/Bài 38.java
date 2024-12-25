import java.util.Scanner;

public class Bai38 {
    // Bài 38. Viết chương trình nhập vào mảng A gồm n phần tử, các phần tử là những
    // số nguyên lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím.
    // a. Tìm phần tử lớn thứ 2 cùng với chỉ số.
    // b. Sắp xếp mảng theo thứ tự giảm dần.
    // c. Nhập số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo thứ tự sắp xếp
    // giảm dần của mảng A.
    public static final Scanner sc = new Scanner(System.in);
    public static int[] nhapMang() {
        int n; // số phần tử của mảng
        while (true) {
            try {
                System.out.print("Nhập số phần tử: ");
                n = Integer.parseInt(sc.nextLine());
                if (n > 0)
                    break;
                else
                    System.out.println("Giá trị không hợp, hãy nhập lại!");
            } catch (Exception e) {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
            }
        }
        int tam[] = new int[n];
        for (int i = 0; i < tam.length; i++) {
            while (true) {
                try {
                    System.out.print("Nhập giá trị: ");
                    tam[i] = Integer.parseInt(sc.nextLine());
                    if (tam[i] > 0 && tam[i] < 100)
                        break;
                    else
                        System.out.println("Giá trị không hợp lệ, hãy nhập lại!");
                } catch (Exception e) {
                    System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
                }
            }
        }
        return tam;
    }

    public static void xuatMang(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print("\t" + a[i]);
    }

    // Câu 1.
    public static void timGiaTriLonThuHai(int a[]) {
        if (a.length < 2)
            System.out.println("Không đủ phần tử để tìm phần tử lớn thứ 2 trong mảng!");
        int max = 0, secondMax = 0, indexMax = 0, indexSecondMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
                indexSecondMax = indexMax;
                indexMax = i;
            } 
        }
        if (secondMax == 0) {
            System.out.println("Không có phần tử lớn thứ 2 trong mảng!");
        } else {
            System.out.println("Phần tử lớn thứ 2 trong mảng là " + secondMax + " và xuất hiện tại vị trí " + indexSecondMax);
        }
    }

    // Câu 2.
    public static int[] sapXepGiam(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int tam = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tam;
                }
            }
        }
        return a;
    }

    // Câu 3.
    public static int nhapSoNguyen()
    {
                //Nhập num
                while(true)
                {
                    try {
                        System.out.print("\nNhập giá trị: ");
                        int num = Integer.parseInt(sc.nextLine());
                        if (num > 0 && num < 100)
                            return num;
                        else
                            System.out.println("Giá trị không hợp lệ, hãy nhập lại!");
                    } catch (Exception e) {
                        System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
                    }
                }
    }
    public static int[] chenPhanTu(int a[], int num) {
        int tam[] = new int[a.length + 1];
        System.arraycopy(a, 0, tam, 0, a.length);
        // Tìm vị trí để chèn num
        int vt = 0;
        for (int i = 0; i < tam.length; i++) {
            if (tam[i] > num) {
                vt = i + 1;
            } else
                break;
        }
        // Dịch phần tử để chèn num
        for (int i = tam.length - 1; i > vt; i--) {
            tam[i] = tam[i - 1];
        }
        tam[vt] = num;
        return tam;
    }
    public static void main(String[] args) {

        //int tam[] = nhapMang(), num;
/*               
        System.out.print("Mảng vừa nhập là: ");
        xuatMang(tam);

        System.out.print("\nMảng sau khi sắp xếp giảm là: ");
        int a[] = sapXepGiam(tam);
        xuatMang(a);
        
        num = nhapSoNguyen();

        int x[] = chenPhanTu(a, num);
        System.out.printf("Mảng sau khi chèn phần tử %d là: ", num);
        xuatMang(x);
        sc.close(); */
        // System.out.println(x.length);
        // xuatMang(x);

        /*
         * System.out.print("\nMảng sau khi chèn phần tử là: ");
         * int arr[] = chenPhanTu(a, num);
         * xuatMang(arr);
         */
        // System.out.println("\n" + .length);

         int a[] = {5,7,5,5,6,7,8};
         timGiaTriLonThuHai(a);
    }
}
