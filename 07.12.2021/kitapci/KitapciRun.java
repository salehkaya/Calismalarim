package kitapci;

import java.util.Scanner;

public class KitapciRun {
	static String KullaniciAdi = "aslikaya";
	static String Sifrem = "12345";

	public static void main(String[] args) {
		/*
		 * * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no
		 * olsun program baslayinca menu isminde bir method calissin 1-kitap ekle
		 * 2-numara ile kitap goruntule 3-bilgi ile kitap goruntule 4-numara ile kitap
		 * sil 5-tum kitaplari listele 6-cikis
		 ************************************
		 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
		 * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
		 * olmali yani bir list'te tutmamiz gerek 2-kitap numarasi 1000'den
		 * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
		 * count=1000; menu isminde bir method olusturmaliyim, 3-kitap ekle diye bir
		 * method olusturmliyim,bu method farkli bir classda 4-kullanicidn kitap adi
		 * yazar adi ve fiyat bilgileri istenmeli
		 */
		Scanner scan = new Scanner(System.in);
		String ad = "";
		String sifre = "";
		int count = 1;

		while (count < 4) {
			System.out.println("     -> ASRE KITABEVI <-\n         HOSGELDINIZ");
			System.out.println(" Lutfen Kullanici Adinizi Giriniz");
			ad = scan.nextLine();
			System.out.println(" Lutfen Kullanici Sifrenizi Giriniz");
			sifre = scan.nextLine();

			if (KullaniciAdi.equals(ad) && Sifrem.equals(sifre)) {
				System.out.println(" *** Sisteme Girisiniz Onaylandi ***");
				anamenu();
				break;

			} else {
				System.out.println(" !!! Sisteme Girisiniz Basarisiz !!!\n       Lutfen Tekrar Deneyin");
				System.out.println("  Kalan Kakkiniz : *!> " + (3 - count) + " <!*");
				System.out.println("");
				count++;
			}

			if (count == 4) {
				System.out.println(" Kullanici Adi veya Sifrenizi '3' defa Yanlis Girdiniz\nSisteme Erisiminiz Engellendi");
				cikis();
			}
		}
	}

	public static void anamenu() {

		Scanner scan = new Scanner(System.in);
		int islemNo = 0;

		do {
			System.out.println(
					" lutfen Islem Numaranizi Giriniz\n\n 1 --->  Kitap Ekle\n\n 2 --->  Numara Ile Kitap Goruntule"
							+ "\n\n 3 --->  Bilgi Ile Kitap Goruntule\n\n 4 --->  Numara Ile Kitap Sil\n\n 5 --->  Tum Kitaplari Listele\n"
							+ "\n 6 --->  CIKIS");
			islemNo = scan.nextInt();

			switch (islemNo) {
			case 1:
				KitapciDepo.kitapEkle();
				break;
			case 2:
				KitapciDepo.numaraIleKitapGoruntule();
				break;
			case 3:
				KitapciDepo.bilgiIleKitapGoruntule();
				break;
			case 4:
				KitapciDepo.numaraIleKitapSil();
				break;
			case 5:
				KitapciDepo.tumKitaplariListele();
				break;
			case 6:
				cikis();
				break;

			default:
				System.out.println(" Lutfen! Gecerli Bir Islem Nuarasi Giriniz ");
				break;
			}

		} while (islemNo != 6);
scan.close();
	}

	private static void cikis() {
		System.out.println("");
		System.out.println(" Iyi Gunler :)");

	}

}
