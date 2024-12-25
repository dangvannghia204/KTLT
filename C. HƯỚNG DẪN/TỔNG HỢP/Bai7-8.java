import java.util.Scanner;

public class Bai7_8 {
    	/**
	 * Tìm UCLN và BCNN, USCLN của 2 số nguyên dương a và b là một số k lớn nhất, sao
	 * cho a và b đều chia hết cho k. BSCNN của 2 số nguyên dương a và b là một số h
	 * nhỏ nhất, sao cho h chia hết cho cả a và b.
	 * 
	 * @param args USCLN(a,b) = (a*b)/BSCNN(a,b)
	 */
	// Tìm ước số chung lớn nhất
	public static int USCLN(int num1, int num2) {
		int uscln;
		while (num2 != 0) {
			uscln = num1 % num2;
			num1 = num2;
			num2 = uscln;
		}
		return num1;
	}
	//Viết không sử dụng biến tạm
	public static int timUSCLN(int num1, int num2)
	{
		while(num2!=0)
		{
			if(num1>num2)
			{
				num1 = num1 - num2;
			}
			else
				num2 = num2 - num1;
		}
		return num1;
	}
	//Tìm bội số chung nhỏ nhất
	public static int timBSCNN(int num1, int num2)
	{
		return (num1*num2)/timUSCLN(num1, num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số thứ 1: ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số thứ 2: ");
		num2 = Integer.parseInt(sc.nextLine());
		sc.close();
		System.out.printf("Ước chung lớn nhất của '%d' và '%d' là %d", num1, num2, USCLN(num1, num2));
		System.out.printf("\nBội số chung nhỏ nhất của '%d' và '%d' là %d", num1, num2,
				(num1 * num2) / USCLN(num1, num2));
	}
}
