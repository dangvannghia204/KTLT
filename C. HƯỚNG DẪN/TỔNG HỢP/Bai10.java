public class Bai10 {
    /* Bài 10. Viết chương trình sắp xếp mảng các số nguyên theo chiều giảm dần giá trị các phần 
tử. */
public static int[] sapXepMangGiam(int a[]) {
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

  public static void hienThiMang(int a[]) {
    for (int i = 0; i < a.length; i++) {
      System.out.print("\t" + a[i]);
    }
  }

  public static void main(String[] args) {
    int a[] = {-4, 5, 7, 10, 9, -3};
    System.out.println("\nMảng ban đầu: ");
    hienThiMang(a);
    System.out.println("\nMảng sắp xếp giảm: ");
    hienThiMang(sapXepMangGiam(a));
  }
}
