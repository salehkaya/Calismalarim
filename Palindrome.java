package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		// Kullanicidan bir String isteyin. Kullanicinin girdigi
		// String'in palindrome olup olmadigini kontrol eden bir program yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Palindrome olup olmadigini kontrol etmek istediginiz cumleyi giriniz");
		String str = scan.nextLine();
		String tersStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			tersStr += str.charAt(i);

		}
		System.out.println(tersStr);
		if (str.equalsIgnoreCase(tersStr)) {
			System.out.println("Girdiginiz " + str + " Palindrome'dir");
		} else {
			System.out.println("Girdiginiz " + str + " Palindrome degildir");
		}
		scan.close();

	}

}
