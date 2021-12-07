package kitapci;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class KitapciDepo {
	static List<String> kitapIsmi = new ArrayList<>();
	static List<String> yazarIsmi = new ArrayList<>();
	static List<String> kitapFiyat = new ArrayList<>();
	static List<Integer> kitapNo = new ArrayList<>();
	static int  count = 1000;
	public static void kitapEkle() {
		
		int tercih = 0;
		
	
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println(" Eklemek Istediginiz Kitabin Ismini Giriniz");
			kitapIsmi.add(scan.nextLine());
			
			System.out.println(" Eklemek Istediginiz Kitabin Yazarini Giriniz");
			yazarIsmi.add(scan.nextLine());
			
			System.out.println(" Eklemek Istediginiz Kitabin Fiyatini Giriniz");
			kitapFiyat.add(scan.nextLine());
			
			kitapNo.add(count);
			count++;
			System.out.println(
					" Kitap Eklemeye Devam Etmek Istiyorsaniz -- 1\n Ana Menuye Donmek istiyorsaniz -- 2\n     GIRINIZ   ");
			tercih = scan.nextInt();
				 
		} while (tercih != 2);
		
		System.out.println(kitapIsmi);
		System.out.println(yazarIsmi);
		System.out.println(kitapNo);
		System.out.println(kitapFiyat);
		System.out.println("");
	
		KitapciRun.anamenu();
	}

	public static void numaraIleKitapGoruntule() {
		Scanner scan = new Scanner(System.in);
		int kitapSiraNo = 0;
		int kitapIndex;
		int tercih = 0;
		do {

			System.out.println(" Lutfen Goruntulemek Istediginiz Kitabin Sira Numarasini Giriniz");
			kitapSiraNo = scan.nextInt();
			if (kitapSiraNo < 1000) {
				System.out.println(
						" Kitap Sira Numaralari 1000'den baslamaktadir\n Lutfen Gecerli Bir Kitap Sira No giriniz");
			} else {
				kitapIndex = (kitapSiraNo - 1000);
				System.out.println(" Aranan Kitabin Adi    : " + kitapIsmi.get(kitapIndex));
				System.out.println(" Aranan Kitabin Yazari : " + yazarIsmi.get(kitapIndex));
				System.out.println(" Aranan Kitabin Fiyati : " + kitapFiyat.get(kitapIndex));
			}
			System.out.println("");
			System.out.println(" Baska Arama Yapmak Icin --->  1\n    Ana Menu --->  2\n    GIRINIZ");
			tercih = scan.nextInt();
			if (!(tercih == 1) || (!(tercih == 2))) {
				System.out.println(" Lutfen Gecerli Bir Kod Giriniz ");
			}

		} while (tercih != 2);
		System.out.println("");
		KitapciRun.anamenu();
scan.close();
	}

	public static void bilgiIleKitapGoruntule() {
		Scanner scan = new Scanner(System.in);
		String kitap = "";
		String yazar = "";
		int tercih = 0;
		int yazarIndex = 0;
		System.out.println(
				" Yazar Adi Ile Arama Yapmak Icin ---> 1\n Kitap Adi Ile Arama Yapmak Icin ---> 2\n        GIRINIZ");
		tercih = scan.nextInt();
		if (tercih < 1 || tercih > 2) {
			tercih = 3;
		}

		switch (tercih) {
		case 1:
			yazarAdiIleArama();
			break;
		case 2:
			kitapAdiIleArama();
			break;
		case 3:
			System.out.println(" Lutfen Gecerli Bir Kod Giriniz");
			break;
 
		}
	scan.close();
	}

	private static void kitapAdiIleArama() {
		Scanner scan = new Scanner(System.in);
		String kitap = "";
		int kitapIndex = 0;
		int tercih = 0;
		do {

			System.out.println(" Arama Yapmak Istediginiz Kitap Ismini Giriniz");
			kitap = scan.nextLine();
			kitapIndex = kitapIsmi.indexOf(kitap);
			System.out.println(" Aranan Kitabin Sira Numarasi    : " + kitapNo.get(kitapIndex));
			System.out.println(" Aranan Kitabin Yazari           : " + yazarIsmi.get(kitapIndex));
			System.out.println(" Aranan Kitabin Fiyati           : " + kitapFiyat.get(kitapIndex));
			System.out.println("");
			System.out.println(" Baska Arama Yapmak Icin  --->  1\n Ana Menu   --->  2\n   GIRINIZ ");
			tercih = scan.nextInt();

		} while (tercih == 1);
	scan.close();
		KitapciRun.anamenu();
	}

	private static void yazarAdiIleArama() {
		Scanner scan = new Scanner(System.in);
		String yazar = "";
		int yazarIndex = 0;
		int tercih = 0;
		do {

			System.out.println(" Arama Yapmak Istediginiz Yazar Ismini Giriniz");
			yazar = scan.nextLine();
			yazarIndex = kitapIsmi.indexOf(yazar);
			System.out.println(" Aranan Kitabin Sira Numarasi    : " + kitapNo.get(yazarIndex));
			System.out.println(" Aranan Kitabin Adi              : " + kitapIsmi.get(yazarIndex));
			System.out.println(" Aranan Kitabin Fiyati           : " + kitapFiyat.get(yazarIndex));
			System.out.println("");
			System.out.println(" Baska Arama Yapmak Icin  --->  1\n Ana Menu   --->  2\n   GIRINIZ ");
			tercih = scan.nextInt();
			if (tercih < 1 || tercih > 2) {
				System.out.println(" Lutfen Gecerli Bir Kod Giriniz");
			}
		} while (tercih != 2);
	scan.close();
		KitapciRun.anamenu();

	}

	public static void numaraIleKitapSil() {
		Scanner scan = new Scanner(System.in);
		int kitapSiraNo = 0;
		int kitapIndex = 0;
		int tercih = 0;
		do {

			System.out.println(" Silmek Istediginiz Kitabin Sira Numarsini Giriniz ");
			kitapSiraNo = scan.nextInt();
			if (kitapSiraNo < 1000) {
				System.out.println(
						" Kitap Sira Numaralari 1000'den baslamaktadir\n Lutfen Gecerli Bir Kitap Sira No giriniz");
			} else {
				kitapIndex = (kitapSiraNo - 1000);
				System.out.println(" Silinen Kitabin Adi    : " + kitapIsmi.get(kitapIndex));
				System.out.println(" Silinen Kitabin Yazari : " + yazarIsmi.get(kitapIndex));
				System.out.println(" Silinen Kitabin Fiyati : " + kitapFiyat.get(kitapIndex));
			}
			kitapIsmi.set(kitapIndex, null);
			yazarIsmi.set(kitapIndex, null);
			kitapFiyat.set(kitapIndex, null);
			kitapNo.set(kitapIndex, null);

			System.out.println("");
			System.out.println(" Baska Kitap Silmek Icin --->  1\n    Ana Menu --->  2\n    GIRINIZ");
			tercih = scan.nextInt();
			if (!(tercih == 1) || (!(tercih == 2))) {
				System.out.println(" Lutfen Gecerli Bir Kod Giriniz ");
			}

		} while (tercih != 2);
		System.out.println("");
	scan.close();
		KitapciRun.anamenu();

	}

	public static void tumKitaplariListele() {
		Scanner scan = new Scanner(System.in);
		int tercih = 0;
		for (int i = 0; i < kitapIsmi.size(); i++) {
			System.out.println("Kitap No : " + kitapNo.get(i) + "     <*>     Kitap Ismi : " + kitapIsmi.get(i)
					+ "     <*>     Yazari : " + yazarIsmi.get(i) + "     <*>     Fiyati : " + kitapFiyat.get(i));
		}
		do {

			System.out.println(" ");
			System.out.println(" Ana Menu  --->  1");
			tercih = scan.nextInt();
			if (tercih == 1) {
				KitapciRun.anamenu();
			} else {
				System.out.println(" Ana Menu  --->  1");
			}
		} while (tercih != 1);
	scan.close();
	}

}
