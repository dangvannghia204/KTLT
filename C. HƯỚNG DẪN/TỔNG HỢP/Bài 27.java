public class Bai27 {
    /**
	 * Bài 27. Số hoàn hảo là số bằng tổng các ước thực sự của nó. Ví dụ: 6 = 1+2+3.
	 * Viết chương trình kiểm tra số nguyên dương n nhập vào từ bàn phím có phải là
	 * số hoàn hảo không.
	 * 
	 * @param args
	 */
	public static boolean kiemTraSoHoanHao(int n) {
		int tong = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0)
				tong += i;
		}
		return tong == n;
	}
	public static void xuatUocSoHoanHao(int n)
	{
		int tong = 0;
		if(kiemTraSoHoanHao(n))
		{
			System.out.printf("\n%d là số hoàn hảo và các ước số của %d là: ", n,n);
			for(int i=1; i<=n; i++)
			{
				if(n%i==0)
				{
					System.out.print("\t" + i);
					tong +=i;
					if(tong==n)
						break;
				}
			}
		}
		else
			System.out.printf("\n%d không phải là số hoàn hảo",n);
	}
	public static void main(String[] args) {
		int n = 6;
		xuatUocSoHoanHao(n);
	}

}
