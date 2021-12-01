package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KarelerininToplami {

	public static void main(String[] args) {
		/*
		 * Bir integer list olusturunuz ve bu listedeki tum sayilarin karesinin
		 * toplamini bulunuz. Sonucu ekrana yazdiriniz.
		 */

		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int sayi = 0;
		int karelerToplami = 0;
		do {
			System.out.println(" lutfen sayinizi giriniz\n Cikis icin '0' basiniz");
			sayi = scan.nextInt();
			list.add(sayi);
			karelerToplami += sayi * sayi;
		} while (!(sayi == 0));

		list.remove(list.size() - 1);

		System.out.println(" girilen sayilar : " + list + " \nKarelerinin toplami : " + karelerToplami);

	}
}
