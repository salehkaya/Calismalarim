package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
	/*
	 * Bir bakkalin 7 gunluk tum kazanclarini gunluk olarak gosteren bir program
	 * yaziniz. Ayrica bakkalin bu hafta ortalama kazandigi miktari gosteren bir
	 * method yaziniz. Ayrica bakkalin hangi gunler ortalamanin ustune kazandigini
	 * gosteren bir method yaziniz. Ayrica bakkalin hangi gunler ortalamanin altinda
	 * kazandigini gosteren bir method yaziniz.
	 *
	 * 1. Adim : Gunleri iceren bir tane ArrayList olusturun. (gunler) 2. Adim :
	 * Gunluk kazanclari ekleyecegimiz bir tane ArrayList olusturun.
	 * (gunlukKazanclar) 3. Adim : While dongusu ile kullanicidan 7 gunluk
	 * kazanclari tekek teker alip gunlukKazanclar ArrayList'e ekle. 4. Adim :
	 * getOrtalamaKazanc() adli method ile ortalama kazanci alin. 5. Adim :
	 * getOrtalamaninUstundeKazancGunleri() adli method olusturun. for dongusu ile
	 * tum gunleri ortalama kazanc ile karsilastir ortalama kazanctan yuksekse o
	 * gunleri return yap. 6. Adim : getOrtalamaninAltindaKazancGunleri() adli
	 * method olusturun. for dongusu ile tum gunleri ortalama kazanc ile karsilastir
	 * ortalama kazanctan asagiysa o gunleri return yap.
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> gunler = new ArrayList<>(
					Arrays.asList("Pazar", "Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi"));
		List<Double> gunlukKazanclar = new ArrayList<>();
		
		int count = 0;
		while (count < 7) {
			System.out.println(" "+gunler.get(count) + " gununun kazancini giriniz");
			gunlukKazanclar.add(scan.nextDouble());
			count++;
		}
		
		System.out.println(gunlukKazanclar.size());
		System.out.println("Gunluk ortalama kazanc \n" + getOrtalamaKazanc(gunlukKazanclar));
		System.out.println(" Ortalamanin uzerinde kazanilan gunler \n "
				+ getOrtalamaninUstundeKazancGunleri(gunlukKazanclar, getOrtalamaKazanc(gunlukKazanclar), gunler));
		System.out.println(" Ortalamanin altinda kazanilan gunler \n"
				+ getOrtalamaninAltindaKazancGunleri(gunlukKazanclar, getOrtalamaKazanc(gunlukKazanclar), gunler));
		System.out.println(" Ortalama kazanca esit kazanilan gunler\n "
				+ getOrtalamayaEsitGunleri(gunlukKazanclar, getOrtalamaKazanc(gunlukKazanclar), gunler));

	}

	private static List<String> getOrtalamayaEsitGunleri(List<Double> gunlukKazanclar, double ortalamaKazanc,
			List<String> gunler) {
		List<String> OrtalamayaEsitGunler = new ArrayList<>();
		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if (gunlukKazanclar.get(i) == ortalamaKazanc) {
				OrtalamayaEsitGunler.add(gunler.get(i));
			}
		}
		return OrtalamayaEsitGunler;
	}

	private static List<String> getOrtalamaninAltindaKazancGunleri(List<Double> gunlukKazanclar, double ortalamaKazanc,
			List<String> gunler) {
		List<String> ortalamaAltiGunler = new ArrayList<>();
		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if (gunlukKazanclar.get(i) < ortalamaKazanc) {
				ortalamaAltiGunler.add(gunler.get(i));
			}
		}
		return ortalamaAltiGunler;
	}

	private static List<String> getOrtalamaninUstundeKazancGunleri(List<Double> gunlukKazanclar, double ortalamaKazanc,
			List<String> gunler) {
		List<String> ortalamaUstuGunler = new ArrayList<>();
		for (int i = 0; i < gunlukKazanclar.size(); i++) {
			if (gunlukKazanclar.get(i) > ortalamaKazanc) {
				ortalamaUstuGunler.add(gunler.get(i));
			}
		}
		return ortalamaUstuGunler;
	}

	private static double getOrtalamaKazanc(List<Double> gunlukKazanclar) {
		int toplamKazanc = 0;
		int ortalamaKazanc = 0;
		for (int i = 0; i < 7; i++) {
			toplamKazanc += gunlukKazanclar.get(i);
		}
		ortalamaKazanc = toplamKazanc / 7;

		return ortalamaKazanc;
	}
}