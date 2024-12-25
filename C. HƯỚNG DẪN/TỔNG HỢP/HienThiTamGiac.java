public class Buoi10 {
    //Tam giác sao vuông
    public static void tamGiacSao(int n)
    {
        System.out.println("\n");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Tam giác sao vuông ngược
    public static void tamGiacSaoNguoc(int n)
    {
        System.out.println("\n");
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Hiển thị tam giác sao cân
    public static void tamGiacSaoCan(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Hiển thị tam giác sao cân ngược
    public static void tamGiacSaoCanNguoc(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Hiển thị tam giác số cân
    public static void tamGiacSoCan(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < (2 * i) / 2; k++) {
                System.out.print(k + " ");
            }
            for (int l = (2 * i) / 2; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    //Hiển thị tam giác số cân ngược
    public static void tamGiacSoCanNguoc(int n) {
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < (2 * i) / 2; k++) {
                System.out.print(k + " ");
            }
            for (int l = (2 * i) / 2; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Tam giác sao cân: ");
        tamGiacSaoCan(5);
        System.out.println("Tam giác sao cân ngược: ");
        tamGiacSaoCanNguoc(5);
        System.out.println("Tam giác số cân: ");
        tamGiacSoCan(5);
        System.out.println("Tam giác số cân ngược: ");
        tamGiacSoCanNguoc(5);
    }
}
