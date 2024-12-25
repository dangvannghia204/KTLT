public class Bai6 {
    /* Bài 6. Viết chương trình tính S = 4! + 5! + 7! + 9! */
    public static long giaiThua(int n)
    {
        long gt = 1;
        if(n==0)
        {
            gt = 0;
        }
        else{
            for(int i=1; i<=n;i++)
            {
                gt *=i;
            }
        }
        return gt;
    }
    public static void tongGiaiThua()
    {
        long tong = 0;
        tong = giaiThua(4) + giaiThua(5) + giaiThua(7) + giaiThua(9);
        System.out.printf("\nTổng giai thừa của %d, %d, %d và %d là %d",4,5,7,9,tong);
    }
    public static void main(String[] args)
    {
        System.out.printf("\nKết quả của %d giai thừa là %d",4,giaiThua(4));
        System.out.printf("\nKết quả của %d giai thừa là %d",5,giaiThua(5));
        System.out.printf("\nKết quả của %d giai thừa là %d",7,giaiThua(7));
        System.out.printf("\nKết quả của %d giai thừa là %d",9,giaiThua(9));
        tongGiaiThua();
    }
}
