package javaProjects.JavaMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaMarket {

	static List<String> urun = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma",
			"Muz", "Cilek", "Kavun", "Uzum", "Limon"));
	static List<Double> fiyat = new ArrayList<>(
			Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
	static List<String> alinanUrun = new ArrayList<>();
	static List<Double> alinankg = new ArrayList<>();
	static List<Double> alinanUrunTutari = new ArrayList<>();
	static double ToplamTutar;
	static int urunKodu;
	static double kg;
	static double urunTutari;

	public static void main(String[] args) {

		/*
		 * Basarili Market alis-veris programi.
		 *
		 * 1. Adim: urunler ve fiyatlari iceren listeleri olusturunuz. No urun Fiyat
		 * ==== ======= ========= 00 Domates 2.10 TL 01 Patates 3.20 TL 02 Biber 1.50 TL
		 * 03 Sogan 2.30 TL 04 Havuc 3.10 TL 05 Elma 1.20 TL 06 Muz 1.90 TL 07 cilek
		 * 6.10 TL 08 Kavun 4.30 TL 09 uzum 2.70 TL 10 Limon 0.50 TL
		 * 
		 * 2. Adim: Kullanicinin urun nosuna gore listeden urun secmesini isteyiniz. 3.
		 * Adim: Kac kg satin almak istedigini sorunuz. 4. Adim: Alinacak bu urunu
		 * sepete ekleyiniz ve Sepeti yazdiriniz. 5. Baska bir urun alip almak
		 * istemedigini sorunuz. 6. Eger devam etmek istiyorsa yeniden urun secme
		 * kismina yonlendiriniz. 7. Eger bitirmek istiyorsa odemeyi kontrol edip para
		 * ustu hesaplayarak programi bitirinzi.
		 */
		anamenu();
		
	}

	public static void sepet() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < alinanUrun.size(); i++) {
			System.out.println("urun : " + alinanUrun.get(i) + "-> kg : " + alinankg.get(i) + "-> Alinan urun Tutari : "
					+ alinanUrunTutari.get(i) + " $");
		}

		System.out.println("");
		System.out.println(" Toplam odemeniz gereken Tutar: " + ToplamTutar + " $");
		System.out.println("");

		boolean cikilsinMi = false;
		while (!cikilsinMi) {

			System.out.println(" Kasa icin     ---> 1" + "\n Ana Menu icin ---> 2" + "\n     GIRINIZ");
			int tercih = scan.nextInt();

			switch (tercih) {
			case 1:
				kasa();
				cikilsinMi = true;
				break;
			case 2:
				anamenu();
				cikilsinMi = true;
				break;

			default:
				System.out.println(" hatali giris");
				break;
			}
		}

	}

	private static void kasa() {
		double odenenpara = 0;
		double paraustu = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(" odemeniz gereken tutar :" + ToplamTutar);
		System.out.println(" odeme miktarinizi giriniz ");
		odenenpara += scan.nextDouble();
		if (ToplamTutar > odenenpara) {
			double eksikpara = ToplamTutar - odenenpara;
			System.out.println(" eksik odeme yaptiniz lutfen " + eksikpara + " $ daha odeme yapiniz");
			System.out.println(" eklemek istediginiz tutari giriniz ");
			double eklenenpara = scan.nextDouble();
			odenenpara += eklenenpara;
			if (ToplamTutar > odenenpara) {
				 eksikpara = ToplamTutar - odenenpara;
				System.out.println(" eksik odeme yaptiniz lutfen " + eksikpara + " $ daha odeme yapiniz");
				System.out.println(" eklemek istediginiz tutari giriniz ");
				eklenenpara = scan.nextDouble();
				odenenpara += eklenenpara;
			} else if (odenenpara > ToplamTutar) {
				paraustu = odenenpara - ToplamTutar;
				System.out.println("odemeniz alinmistir tesekkur ederiz \n para ustunuzu aliniz : " + paraustu + " $");
			}else {
				System.out.println(" odemeniz alinmistir tesekkur ederiz");
			}
			
		} else if (odenenpara > ToplamTutar) {
			paraustu = odenenpara - ToplamTutar;
			System.out.println("odemeniz alinmistir tesekkur ederiz \n para ustunuzu aliniz : " + paraustu + " $");
		} else {
			System.out.println(" odemeniz alinmistir tesekkur ederiz");
		}
		System.out.println("");
		System.out.println(" IYI GUNLER DILER YINE BEKLERIZ :)");
		
	}

	private static double anamenu() {
		Scanner scan = new Scanner(System.in);
		int alinanurunindex = 0;
		System.out.println("*/ JAVA SANAL MARKET'E HOSGELDINIZ /*");
		System.out.println(" No       Urun 	        	  Fiyat  \n"
						 + "====     =======	 	=========\n"
						 + "100	 Domates   	 	 2.10 TL\n"
						 + "101	 Patates   	 	 3.20 TL\n"
						 + "102	 Biber     	 	 1.50 TL\n"
						 + "103	 Sogan                   2.30 TL\n"
						 + "104	 Havuc     	   	 3.10 TL\n"
						 + "105	 Elma      	   	 1.20 TL\n"
						 + "106	 Muz     	 	 1.90 TL\n"
						 + "107	 Cilek 	 		 6.10 TL\n"
						 + "108	 Kavun                   4.30 TL\n"
						 + "109	 Uzum      	 	 2.70 TL\n"
						 + "110	 Limon     	 	 0.50 TL");
	
		System.out.println("");
		System.out.println(" Lutfen Almak Istediginiz Urunun Urun Kodunu Giriniz");
		urunKodu = scan.nextInt();
		alinanurunindex = urunKodu - 100;
		alinanUrun.add(urun.get(alinanurunindex));
		switch (urunKodu) {
		case 100:
			domates();
			break;
		case 101:
			Patates();
			break;
		case 102:
			Biber();
			break;
		case 103:
			Sogan();
			break;
		case 104:
			Havuc();
			break;
		case 105:
			Elma();
			break;
		case 106:
			Muz();
			break;
		case 107:
			Cilek();
			break;
		case 108:
			Kavun();
			break;
		case 109:
			Uzum();
			break;
		case 110:
			Limon();
			break;

		default:
			System.out.println(" lutfen gecerli bir urun kodu giriniz");
			break;
		}
		return urunKodu;

	}

	public static void domates() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg Domates almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(0) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg domates sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Patates() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg Patates almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(1) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg patates sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Biber() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg Biber almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(2) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg biber sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Sogan() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg sogan almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(3) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg sogan sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Havuc() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg havuc almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(4) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg havuc sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Elma() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg elma almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(5) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg elma sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Muz() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg muz almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(6) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg muz sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Cilek() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg cilek almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(7) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg cilek sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Kavun() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg kavun almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(8) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg kavun sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Uzum() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg uzum almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(9) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg uzum sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}

	private static void Limon() {
		int tercih = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg limon almak istiyorsunuz?");
		kg = scan.nextInt();
		alinankg.add(kg);
		urunTutari = fiyat.get(10) * kg;
		alinanUrunTutari.add(urunTutari);
		ToplamTutar += urunTutari;
		System.out.println(kg + " kg limon sepetinize eklendi" + "\n Alisverise devam etmek icin ---> 1"
				+ "\n Sepetinizi gormek icin      ---> 2" + "\n Kasa       ---> 3" + "\n         GIRINIZ");
		tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			anamenu();
			break;
		case 2:
			sepet();
			break;
		case 3:
			kasa();
			break;

		default:
			System.out.println(" hatali giris");
			break;
		}

	}
}
