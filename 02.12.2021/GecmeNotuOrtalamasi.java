package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GecmeNotuOrtalamasi {
	public static void main(String[] args) {
		// Bir ogretmenden girmek istedigi kadar notu aliniz, ve
		// ortalamayi gecen ogrenci sayisini bulunuz.

		List<Integer> not = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println(" sinava giren ogrenci sayisini giriniz");
		int sinavaGirenOgrenciSayisi = scan.nextInt();
		int gelenNot = 0;
		int toplamNot = 0;
		int count = 0;
		int notOrtalamasi = 0;

		for (int i = 0; i < sinavaGirenOgrenciSayisi; i++) {
			System.out.println((i + 1) + ". ogrencinin notunu giriniz");
			gelenNot = scan.nextInt();
			not.add(gelenNot);
			toplamNot += gelenNot;

		}
		notOrtalamasi = (toplamNot / sinavaGirenOgrenciSayisi);

		for (int i = 0; i < not.size(); i++) {

			if (not.get(i) > notOrtalamasi) {
				count++;
			}
		}

		System.out.println(" Sinava giren ogrenci sayisi : " + sinavaGirenOgrenciSayisi + "\n Ortalama gecme notu : "
				+ notOrtalamasi + "\n Ortalamayi gecen ogrenci sayisi : " + count);
	}
}
