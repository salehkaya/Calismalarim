package teamGuru3;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// Java'da bir say�n�n palindrom olup olmad���n� kontrol etmek i�in bir Java
		// program� yaz�n?

		Scanner scan = new Scanner(System.in);
		System.out.println(" lutfen palindrome olup olmadigini kontrol etmek icin bir sayi giriniz");
		String sayi = scan.nextLine();
		String num = "";

		for (int i = sayi.length() - 1; i >= 0; i--) {
			num += sayi.charAt(i);

		}

		if (num.equalsIgnoreCase(sayi)) {
			System.out.println(sayi + " sayisi Palindrome'dur");
		} else if (num.equalsIgnoreCase(sayi)) {
			System.out.println(sayi + " sayisi Palindrome degildir");
		}
		scan.close();
	}
}
