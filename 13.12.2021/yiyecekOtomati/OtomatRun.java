package yiyecekOtomati;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtomatRun {
	static Scanner scan = new Scanner(System.in);
	static double para = 0;
	static int urunKodu;

	public static void main(String[] args) {
		/*
		 * projemizin adý YIYECEK OTOMATI --15 adet ürün ve bu ürünlerin fiyatlarýný
		 * belirleyiniz. Bu ürünler ekranda listelensin --Ürün seçip, para miktarý
		 * giriniz --girdiðiniz para fazla ise üstünü versin, eksik ise ekleme yapmanýzý
		 * istesin --Ek ürün seçme seçeneði olsun, siz devam ettiðiniz sürece, para
		 * kontrolünü de yaparak iþlem yapmaya devam etsin... NOT: Otomat sadece 1 tl ,
		 * 5 tl, 10 tl, 20 tl miktarlarýný kabul etsin oop concepte ait öðrendiklerimizi
		 * kullanmaya çalýþalým... iyi çalýþmalar Kolay gelsin... 1- ne istedigini sor
		 * 2- fiyatini hesabla 3- parasini al 4- cikis
		 * 
		 */

		System.out.println("\t\t ==> HOSGELDINIZ <==");
		System.out.println("10 ---> Patos Cips ==> 5.75\n11 ---> Cubuk Kraker ==> 3.25\n12 ---> Form ==> 4.75\n"
				+ "13 ---> Gong ==> 5.00\n14 ---> Albeni ==> 4.25\n15 ---> Kit Kat ==> 3.50\n"
				+ "16 ---> Metro ==> 6.00\n17 ---> Cokonat ==> 5.25\n18 ---> Kutu Cola ==> 6.50\n"
				+ "19 ---> Ice Tea ==> 4.75\n20 ---> Su ==> 2.00\n21 ---> Maden Suyu (Sade) ==> 4.00\n"
				+ "22 ---> Maden Suyu (Meyveli) ==> 5.00\n23 ---> Browni ==> 4.50\n24 ---> Pop Kek ==> 2.50\n");
		System.out.println("Lutfen Odemenizi Giriniz");
		para = scan.nextDouble();

		anamenu();

	}

	private static void anamenu() {

		int tercih = 0;

		do {

			System.out.println("10 ---> Patos Cips ==> 5.75\n11 ---> Cubuk Kraker ==> 3.25\n12 ---> Form ==> 4.75\n"
					+ "13 ---> Gong ==> 5.00\n14 ---> Albeni ==> 4.25\n15 ---> Kit Kat ==> 3.50\n"
					+ "16 ---> Metro ==> 6.00\n17 ---> Cokonat ==> 5.25\n18 ---> Kutu Cola ==> 6.50\n"
					+ "19 ---> Ice Tea ==> 4.75\n20 ---> Su ==> 2.00\n21 ---> Maden Suyu (Sade) ==> 4.00\n"
					+ "22 ---> Maden Suyu (Meyveli) ==> 5.00\n23 ---> Browni ==> 4.50\n24 ---> Pop Kek ==> 2.50\n");

			System.out.println(" Almak Istediginiz Urunun Kodunu Giriniz");
			urunKodu = scan.nextInt() - 10;

			OtomatDepo satis = new OtomatDepo(urunKodu, para);

			System.out.println("===============================================\n Aldiginiz Urunler");
			satis.alinanurun();

			System.out.println("================================================\n Para Ustunuz :"
					+ (satis.para - satis.toplamTutar)+"tl" + ""
					+ "\n Baska Urun Eklemek Istiyor musunuz?\\nEvet --->1\\nHayir -->2");
			tercih = scan.nextInt();
			if (tercih == 2 && (satis.para- satis.toplamTutar) > 0) {
				System.out.println("\t\t Tesekkur Eder Yine Bekleriz\n\t\t\t" + (satis.para - satis.toplamTutar)
						+ "tl\n\t\t Para Ustunu Almayi UNUTMAYIN!");
			} else {
				System.out.println("\t\t Tesekkur Eder Yine Bekleriz");
			}
		} while (tercih == 1);

	}

}
