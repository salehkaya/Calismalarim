package _08_While_DoWhile;

import java.util.Scanner;

public class IndexiTekSayiOlanlariYazdir {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz
		Scanner scan = new Scanner(System.in);
		System.out.print("bir metin giriniz : ");
		String str = scan.nextLine();
		int index = 0;
		do {
			if (index % 2 == 1) {
				System.out.print(str.charAt(index) + " ");
			}
			index++;
		} while (index < str.length());
scan.close();
	}

}
