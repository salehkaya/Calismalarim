package teamGuru4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinifBoyOrtalamasi {

	public static void main(String[] args) {
		/*
		 * Bir sýnýftaki tüm öðrencilerin ortalama boylarýný hesaplayan bir program
		 * yazýn. Bir sýnýftaki öðrenci sayýsý ve boylarý kullanýcý tarafýndan girilir.
		 */

		Scanner scan = new Scanner(System.in);
		List<Double> boy = new ArrayList<>();
		System.out.println(" Siniftaki ogrenci sayisini giriniz");
		int ogrenciSayisi = scan.nextInt();
		double boyToplam = 0;
		double gelenBoy = 0;
		
		for (int i = 1; i <= ogrenciSayisi; i++) {
			System.out.println((i) + " . ogrencinin boyunu giriniz");
			gelenBoy = scan.nextDouble();
			boy.add((double) gelenBoy);
			boyToplam += gelenBoy;

		}

		System.out.println(" sinifin mevcudu : " + ogrenciSayisi + "\n boy ortalamasi : " + boyToplam / ogrenciSayisi);
	scan.close();
	}

}
