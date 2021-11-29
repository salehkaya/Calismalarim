package teamGuru3;

public class telefonNumarasi {

	public static void main(String[] args) {
		/*
		 * Harflerden oluşan bir telefon numarasını sadece rakamlardan oluşan bir
		 * telefon numarasına çeviren bir program oluşturun.
		 * 
		 * Sayı Harf 0 Yok 1 Yok 2 ABC 3 DEF 4 GHI 5 JKL 6 MNO 7 PQRS 8 TÜV 9 WXYZ
		 * Örnekler: textToNum("123-647-EYES") ➞ "123-647-3937"
		 * textToNum("(325)444-TEST") ➞ "(325)444-8378" textToNum("653-TRY-THIS") ➞
		 * "653-879-8447" textToNum("435-224-7613") ➞ "435-224-7613" Notlar: Tüm
		 * girişler, sayılar ve büyük harfler kullanılarak XXX-XXX-XXXX veya biçiminde
		 * uygun bir telefon numarasını temsil eden bir dize olarak biçimlendirilecektir
		 * (XXX)XXX-XXXX.
		 * 
		 */

		String textNo[][] = { { "A", "3", "3" }, { "R", "f", "k" }, { "t", "5", "9", "z" } };    // test data'si uzerinde
																								 // calisildi..
		int sayac = 0;

		for (int i = 0; i < textNo.length; i++) {
			for (int j = 0; j < textNo[i].length; j++) {

				if (textNo[i][j].equalsIgnoreCase("a") || textNo[i][j].equalsIgnoreCase("b") || textNo[i][j].equalsIgnoreCase("c")) {
					textNo[i][j] = "2";
				}
				if (textNo[i][j].equalsIgnoreCase("d") || textNo[i][j].equalsIgnoreCase("e") || textNo[i][j].equalsIgnoreCase("f")) {
					textNo[i][j] = "3";
				}
				if (textNo[i][j].equalsIgnoreCase("g") || textNo[i][j].equalsIgnoreCase("h") || textNo[i][j].equalsIgnoreCase("i")) {
					textNo[i][j] = "4";
				}
				if (textNo[i][j].equalsIgnoreCase("j") || textNo[i][j].equalsIgnoreCase("k") || textNo[i][j].equalsIgnoreCase("l")) {
					textNo[i][j] = "5";
				}
				if (textNo[i][j].equalsIgnoreCase("m") || textNo[i][j].equalsIgnoreCase("n") || textNo[i][j].equalsIgnoreCase("o")) {
					textNo[i][j] = "6";
				}
				if (textNo[i][j].equalsIgnoreCase("p") || textNo[i][j].equalsIgnoreCase("q") || textNo[i][j].equalsIgnoreCase("r")
						|| textNo[i][j].equalsIgnoreCase("s")) {
					textNo[i][j] = "7";
				}
				if (textNo[i][j].equalsIgnoreCase("t") || textNo[i][j].equalsIgnoreCase("u") || textNo[i][j].equalsIgnoreCase("v")) {
					textNo[i][j] = "8";
				}
				if (textNo[i][j].equalsIgnoreCase("w") || textNo[i][j].equalsIgnoreCase("x") || textNo[i][j].equalsIgnoreCase("y")
						|| textNo[i][j].equalsIgnoreCase("z")) {
					textNo[i][j] = "9";
				}
				sayac++;
			}
			sayac++;
		}

		String textNo1[] = new String[sayac];
		int count = 0;
		for (int i = 0; i < textNo.length; i++) {
			for (int j = 0; j < textNo[i].length; j++) {

				textNo1[count] = textNo[i][j];
				count++;
			}
		}

		System.out.print(" (" + (textNo1[0] + textNo1[1] + textNo1[2]) + ") " + textNo1[3] + textNo1[4] + textNo1[5]
				+ "-" + textNo1[6] + textNo1[7] + textNo1[8] + textNo1[9]);

	}
}
