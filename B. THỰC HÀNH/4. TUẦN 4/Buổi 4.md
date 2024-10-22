<h1>NỘI DUNG & HƯỚNG DẪN</h1>
<h2>A. CƠ BẢN</h2>
<h3>Bài 4.1. Khai báo và khởi tạo mảng int arr[] = {3, 5, 8, 10, 14, 25}. Hãy viết chương trình hiển thị các phần tử của mảng arr.</h3>
public class Buoi4 {

	public static void bai4_1() {
		int arr[] = {3, 5, 8, 10, 14, 25};
		int cs=0;
		System.out.printf("Phần tử thứ nhất arr[%d] = " + arr[cs], cs++);
		System.out.printf("\nPhần tử thứ hai arr[%d] = " + arr[cs], cs++);
		System.out.printf("\nPhần tử thứ ba arr[%d] = " + arr[cs], cs++);
		System.out.printf("\nPhần tử thứ tư arr[%d] = " + arr[cs], cs++);
		System.out.printf("\nPhần tử thứ năm arr[%d] = " + arr[cs], cs++);
		System.out.printf("\nPhần tử thứ sáu arr[%d] = " + arr[cs], cs++);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai4_1();
	}
 
}
<h3>Bài 4.2. Khai báo và khởi tạo mảng String nguHanh[] = {“kim”, “mộc”, “thủy”, “hỏa”, “thổ”}. Hãy viết chương trình hiển thị các phần tử của mảng nguHanh.</h3>
public class Buoi4 {

	public static void bai4_2() {
		String nguHanh[] = { "kim", "mộc", "thủy", "hỏa", "thổ" };
		int cs = 0;
		System.out.printf("Phần tử thứ nhất nguHanh[%d] = " + nguHanh[cs], cs++);
		System.out.printf("\nPhần tử thứ hai nguHanh[%d] = " + nguHanh[cs], cs++);
		System.out.printf("\nPhần tử thứ ba nguHanh[%d] = " + nguHanh[cs], cs++);
		System.out.printf("\nPhần tử thứ tư nguHanh[%d] = " + nguHanh[cs], cs++);
		System.out.printf("\nPhần tử thứ năm nguHanh[%d] = " + nguHanh[cs], cs++);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai4_2();
	}
}
<h3>Bài 4.3. Khai báo và khởi tạo mảng int arr1[][] = new int[2][3]. Hãy viết chương trình hiển thị các phần tử của mảng arr1.</h3>
<table>
	<tr>	
	<td>arr1</td>
	<td>0</td>
	<td>1</td>
	<td>2</td>
	</tr>
	<tr>	
	<td>0</td>
	<td>arr1[0][0]</td>
	<td>arr1[0][1]</td>
	<td>arr1[0][2]</td>
	</tr>
 	<tr>	
	<td>1</td>
	<td>arr1[1][0]</td>
	<td>arr1[1][1]</td>
	<td>arr1[1][2]</td>
	</tr>

</table>
public class Buoi4 {

	public static void bai4_3() {
		int arr1[][] = new int[2][3];
		int i = 0, j = 0;// Khai báo chỉ số để duyệt qua mảng
		System.out.printf("Phần tử thứ nhất arr1[%d][%d]", i, j);
		System.out.printf("\nPhần tử thứ hai arr1[%d][%d]", i, j = j + 1);
		System.out.printf("\nPhần tử thứ ba arr1[%d][%d]", i, j = j + 1);
		System.out.printf("\nPhần tử thứ tư arr1[%d][%d]", i = i + 1, j = 0);
		System.out.printf("\nPhần tử thứ năm arr1[%d][%d]", i, j = j + 1);
		System.out.printf("\nPhần tử thứ sáu arr1[%d][%d]", i, j = j + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai4_3();
	}
}
 
<h3>Bài 4.4. Khai báo và khởi tạo mảng int arr2[][] = {{1,2,3},{4,5,6},{7}}. Hãy viết chương trình hiển thị các phần tử của mảng arr2.</h3>
<table>
	<tr>	
	<td>arr2</td>
	<td>0</td>
	<td>1</td>
	<td>2</td>
	</tr>
	<tr>	
	<td>0</td>
	<td>1</td>
	<td>2</td>
	<td>3</td>
	</tr>
 	<tr>	
	<td>1</td>
	<td>4</td>
	<td>5</td>
	<td>6</td>
	</tr>
  	<tr>	
	<td>2</td>
	<td>7</td>
	<td></td>
	<td></td>
	</tr>
</table>

public class Buoi4 {

	public static void bai4_4() {
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
		int i = 0, j = 0;
		System.out.printf("Phần tử thứ nhất arr2[%d][%d] = %d", i, j, arr2[i][j]);
		System.out.printf("\nPhần tử thứ hai arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
		System.out.printf("\nPhần tử thứ ba arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
		System.out.printf("\nPhần tử thứ tư arr2[%d][%d] = %d", i = i + 1, j = 0, arr2[i][j]);
		System.out.printf("\nPhần tử thứ năm arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
		System.out.printf("\nPhần tử thứ sáu arr2[%d][%d] = %d", i, j = j + 1, arr2[i][j]);
		System.out.printf("\nPhần tử thứ bảy arr2[%d][%d] = %d", i = i + 1, j = 0, arr2[i][j]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai4_4();
	}
}

<h2>B. NÂNG CAO</h2>
<H3>Hãy code 4 bài tập nêu ở trên sử dụng thông qua vòng lặp (tham khảo nội dung nêu ở Chương 6 của tuần 8 từ slide 20).</h3>
<H3>Hãy viết chương trình hiển thị các giá trị từ 1 đến n (với n nhập từ bàn phím, n là số nguyên. Ví dụ: nhập từ bàn phím số 5 thì hiển thị kết quả là: 1 2 3 4 5).</h3>
<h1>-----HẾT-----<h1>


