public class Unicode {
	public static void main(String[] args) {
		//Выведите в цикле символы кодировки Unicode в диапазоне
		//[9398, 10178]. Если выводятся кракозябры, то [33, 126]
		// for (int i = 9398; i < 10178; i++) {
  //           char ch = (char) i;
  //           String tempOct = Integer.toOctalString(i);
  //           String tempHex = Integer.toHexString(i);
  //           System.out.printf("%03d %3s %5s %4s%n", i, ch, tempOct, tempHex);
		for(int i = 9398; i<10178; i++) {
			System.out.println((char)i);
		}
	}
}
		