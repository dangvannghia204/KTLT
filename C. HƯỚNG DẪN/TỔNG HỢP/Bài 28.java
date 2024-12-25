public class Bai28 {
    /**
	 * Viết chương trình thực hiện nhập một xâu ký tự. Tìm từ dài nhất trong xâu và
	 * vị trí. (Nếu có nhiều từ cùng độ dài thì chọn từ đầu tiên tìm thấy).
	 */
	public static String tuDaiNhat(String str) {
		String tam[] = str.split("\\s+");
		String word = tam[0];
		for (int i = 1; i < tam.length; i++) {
			if (word.length() < tam[i].length())
				word = tam[i];
		}
		return word;
	}

	public static int viTriTuDaiNhat(String str) {
		int vt = -1;
		String tamString = "";
		String word = "";
		int tam = 0, max = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 32 && str.charAt(i) != 92) {
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
		System.out.printf("Chiều dài từ dài nhất trong chuỗi là %d", max);
		System.out.printf("\nTừ dài nhất trong chuỗi bắt đầu tại vị trí %d", vt);
		System.out.printf("\nTừ dài nhất trong chuỗi đã cho là %s", word);
		return vt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "languages Xin chào mọi người hello everybody goodjob apartment languages abc";
		viTriTuDaiNhat(str);
//		System.out.print("Từ dài nhất trong chuỗi là: " + tuDaiNhat(str));
//		System.out.print("\nTừ dài nhất trong chuỗi bắt đầu tại vị trí " + viTriTuDaiNhat(str));
	}
}
