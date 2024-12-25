public class Bai3 {
    /* Bài 3. Viết chương trình tính tổng các số chẵn từ 2 đến N (nguyên dương, nhập từ bàn 
phím). */

    public static void main(String[] args)
    {
        int [] demo = {1,2,3,4,5,6,7,8,9};
        System.out.print("Hiển thị kết quả với break: ");
        for (int i : demo) {
            if(i>=5)
            {
                break;
            }
            System.out.print(i + "\t");
        }
        System.out.print("\nHiển thị kết quả với continue: ");
        for (int i : demo) {
            if(i>=5)
            {
                continue;
            }
            System.out.print(i + "\t");
        }
        System.out.print("\nHiển thị kết quả với for: ");
        for(int i=0; i<demo.length; i++)
        {
            if(demo[i]%2 != 0)
            {
                continue;
            }
            System.out.print(demo[i] + "\t");
        }
    }
}
