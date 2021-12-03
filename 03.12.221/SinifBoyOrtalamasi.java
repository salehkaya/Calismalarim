package teamGuru4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinifBoyOrtalamasi {

	public static void main(String[] args) {
		/*
		 * Bir s�n�ftaki t�m ��rencilerin ortalama boylar�n� hesaplayan bir program
		 * yaz�n. Bir s�n�ftaki ��renci say�s� ve boylar� kullan�c� taraf�ndan girilir.
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
