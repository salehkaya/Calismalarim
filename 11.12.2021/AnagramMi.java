package deneme;

import java.util.Scanner;

public class AnagramMi{

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf
		 * duyarliligi olmadan karakterleri ve karakter say�lar� ayn�ysa "Anagram"
		 * yazd�r�n, aksi takdirde konsolda "Anagram De�il" yazd�r�n. Ornek : "Pide"
		 * ve"ED�P" anagram ifadelerdir..
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println(" bir text giriniz");
		String str = scan.nextLine();
		System.out.println(" bir text daha giriniz");
		String str2 = scan.nextLine();
		String tersStr = "";
		String tersStr2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			tersStr += str.charAt(i);
		}
		for (int i = str2.length() - 1; i >= 0; i--) {
			tersStr2 += str2.charAt(i);
		}

		if (str.length() == str2.length()) {
			if (str.equalsIgnoreCase(str2) || str.equalsIgnoreCase(tersStr2) || str2.equalsIgnoreCase(tersStr)) {
				System.out.println("Girdiginiz text anagramdir");

			} else {
				System.out.println("Girdiginiz text anagram degildir");
			}

		} else {
			System.out.println("Girdiginiz text anagram degildir");
		}
scan.close();
	}

}
