package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AyyildizManav {
	static List<String> urunListesi = new ArrayList<>(
			Arrays.asList("Domates", "Patates", "Salatalik", "Mandalina", "Elma", "Nar"));
	static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(9.99, 7.50, 6.50, 7.00, 5.00, 8.50));
	static double toplamOdenecekTutar;
	static int secim = 0;

	public static void main(String[] args) {
		/*
		 * Basit bir 5 urunlu manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
		 * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
		 * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
		 * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
		 * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
		 * goster.
		 *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println(" *****AYYILDIZ MANAV'A HOSGELDINIZ*****\n Tarladan Sofraniza En Taze Urunler");
		System.out.println("");
		System.out.println(
				" lutfen urun kodunu giriniz\nDomates    <- 9.99 tl ->   '1'\nPatates    <- 7.50 tl ->   '2'\nSalatalik  <- 6.50 tl ->   '3'"
						+ "\nMandalina  <- 7.00 tl ->   '4'\nElma       <- 5.00 tl ->   '5'\nNar        <- 8.50 tl ->   '6'\nCikis yapmak icin ---->    '0'");
		secim = scan.nextInt();

		while (secim != 0) {

			switch (secim) {
			case 1:
				domates();
				break;
			case 2:
				patates();
				break;
			case 3:
				salatalik();
				break;
			case 4:
				mandalina();
				break;
			case 5:
				elma();
				break;
			case 6:
				nar();
				break;

			default:
				System.out.println(" Lutfen gecerli bir kod giriniz\n*IYI ALISVERISLER*");
				break;
			}

		}

		System.out.println(" Odemeniz gereken tutar :" + toplamOdenecekTutar);
		System.out.println(" ***BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDER YINE BEKLERIZ***");
	}

	private static int domates() {
		secim = 0;
		double urunKg = 0;
		double urunTutari = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg domates almak istiyorsunuz");
		urunKg = scan.nextInt();
		urunTutari = urunKg * urunFiyatlari.get(0);
		toplamOdenecekTutar += urunTutari;
		System.out.println(urunKg + " kg " + urunListesi.get(0) + " basariyla filenize eklendi\nToplam Odenecek Tutar : "
				+ toplamOdenecekTutar + "\n ***Alisverisinize Guvenle Devam Edebilirsiniz***");
		System.out.println(" ");
		System.out.println(
				" lutfen urun kodunu giriniz\nDomates    <- 9.99 tl ->   '1'\nPatates    <- 7.50 tl ->   '2'\nSalatalik  <- 6.50 tl ->   '3'"
						+ "\nMandalina  <- 7.00 tl ->   '4'\nElma       <- 5.00 tl ->   '5'\nNar        <- 8.50 tl ->   '6'\nCikis yapmak icin ---->    '0'");
		return secim = scan.nextInt();

	}

	private static int patates() {
		secim = 0;
		double urunKg = 0;
		double urunTutari = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg patates almak istiyorsunuz");
		urunKg = scan.nextInt();
		urunTutari = urunKg * urunFiyatlari.get(1);
		toplamOdenecekTutar += urunTutari;
		System.out.println(urunKg + " kg " + urunListesi.get(1) + " basariyla filenize eklendi\nToplam Odenecek Tutar : "
				+ toplamOdenecekTutar + "\n ***Alisverisinize Guvenle Devam Edebilirsiniz***");
		System.out.println(" ");
		System.out.println(
				" lutfen urun kodunu giriniz\nDomates    <- 9.99 tl ->   '1'\nPatates    <- 7.50 tl ->   '2'\nSalatalik  <- 6.50 tl ->   '3'"
						+ "\nMandalina  <- 7.00 tl ->   '4'\nElma       <- 5.00 tl ->   '5'\nNar        <- 8.50 tl ->   '6'\nCikis yapmak icin ---->    '0'");
		return secim = scan.nextInt();
	}

	private static int salatalik() {
		secim = 0;
		double urunKg = 0;
		double urunTutari = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg salatalik almak istiyorsunuz");
		urunKg = scan.nextInt();
		urunTutari = urunKg * urunFiyatlari.get(2);
		toplamOdenecekTutar += urunTutari;
		System.out.println(urunKg + " kg " + urunListesi.get(2) + " basariyla filenize eklendi\nToplam Odenecek Tutar : "
				+ toplamOdenecekTutar + "\n ***Alisverisinize Guvenle Devam Edebilirsiniz***");
		System.out.println(" ");
		System.out.println(
				" lutfen urun kodunu giriniz\nDomates    <- 9.99 tl ->   '1'\nPatates    <- 7.50 tl ->   '2'\nSalatalik  <- 6.50 tl ->   '3'"
						+ "\nMandalina  <- 7.00 tl ->   '4'\nElma       <- 5.00 tl ->   '5'\nNar        <- 8.50 tl ->   '6'\nCikis yapmak icin ---->    '0'");
		return secim = scan.nextInt();
	}

	private static int mandalina() {
		secim = 0;
		double urunKg = 0;
		double urunTutari = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg mandalina almak istiyorsunuz");
		urunKg = scan.nextInt();
		urunTutari = urunKg * urunFiyatlari.get(3);
		toplamOdenecekTutar += urunTutari;
		System.out.println(urunKg + " kg " + urunListesi.get(3) + " basariyla filenize eklendi\nToplam Odenecek Tutar : "
				+ toplamOdenecekTutar + "\n ***Alisverisinize Guvenle Devam Edebilirsiniz***");
		System.out.println(" ");
		System.out.println(
				" lutfen urun kodunu giriniz\nDomates    <- 9.99 tl ->   '1'\nPatates    <- 7.50 tl ->   '2'\nSalatalik  <- 6.50 tl ->   '3'"
						+ "\nMandalina  <- 7.00 tl ->   '4'\nElma       <- 5.00 tl ->   '5'\nNar        <- 8.50 tl ->   '6'\nCikis yapmak icin ---->    '0'");
		return secim = scan.nextInt();
	}

	private static int elma() {
		secim = 0;
		double urunKg = 0;
		double urunTutari = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg elma almak istiyorsunuz");
		urunKg = scan.nextInt();
		urunTutari = urunKg * urunFiyatlari.get(4);
		toplamOdenecekTutar += urunTutari;
		System.out.println(urunKg + " kg " + urunListesi.get(4) + " basariyla filenize eklendi\nToplam Odenecek Tutar : "
				+ toplamOdenecekTutar + "\n ***Alisverisinize Guvenle Devam Edebilirsiniz***");
		System.out.println(" ");
		System.out.println(
				" lutfen urun kodunu giriniz\nDomates    <- 9.99 tl ->   '1'\nPatates    <- 7.50 tl ->   '2'\nSalatalik  <- 6.50 tl ->   '3'"
						+ "\nMandalina  <- 7.00 tl ->   '4'\nElma       <- 5.00 tl ->   '5'\nNar        <- 8.50 tl ->   '6'\nCikis yapmak icin ---->    '0'");
		return secim = scan.nextInt();
	}

	private static int nar() {
		secim = 0;
		double urunKg = 0;
		double urunTutari = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac kg nar almak istiyorsunuz");
		urunKg = scan.nextInt();
		urunTutari = urunKg * urunFiyatlari.get(5);
		toplamOdenecekTutar += urunTutari;
		System.out.println(urunKg + " kg " + urunListesi.get(5) + " basariyla filenize eklendi\nToplam Odenecek Tutar : "
				+ toplamOdenecekTutar + "\n ***Alisverisinize Guvenle Devam Edebilirsiniz***");
		System.out.println(" ");
		System.out.println(
				" lutfen urun kodunu giriniz\nDomates    <- 9.99 tl ->   '1'\nPatates    <- 7.50 tl ->   '2'\nSalatalik  <- 6.50 tl ->   '3'"
						+ "\nMandalina  <- 7.00 tl ->   '4'\nElma       <- 5.00 tl ->   '5'\nNar        <- 8.50 tl ->   '6'\nCikis yapmak icin ---->    '0'");
		return secim = scan.nextInt();
		
	}
	
}
