package yiyecekOtomati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OtomatDepo {

	static String urun = "";
	static double fiyat;
	static double toplamTutar;
	static double para;
	
	static Scanner scan = new Scanner(System.in);

	static List<String> alinanUrunler = new ArrayList<>(
			Arrays.asList("Patos Cips", "Cubuk Kraker", "Form", "Gong", "Albeni", "Kit Kat", "Metro", "Cokonat",
					"Kutu Cola", "Ice Tea", "Su", "Maden Suyu (Sade)", "Maden Suyu (Meyveli)", "Browni", "Pop Kek"));
	static List<Double> urunFiyat = new ArrayList<>(
			Arrays.asList(5.75, 3.25, 4.75, 5.00, 4.25, 3.50, 6.00, 5.25, 6.50, 4.75, 2.00, 4.00, 5.00, 4.50, 2.50));

	public OtomatDepo(int urunKodu, double para) {
		this.para = para;
		this.urun += " " + alinanUrunler.get(urunKodu);
		this.fiyat = urunFiyat.get(urunKodu);
		int flag=0;
		do{
			
			if (this.para >= urunFiyat.get(urunKodu)) {
				this.toplamTutar += urunFiyat.get(urunKodu);
				flag++;
			} else if (this.para < urunFiyat.get(urunKodu)) {
				System.out.println(" Eksik Para Lutfen para ekleyiniz");
				this.para += scan.nextDouble();
			}

		} while (flag==0);


	}

	public void alinanurun() {

		System.out.println(" Urun : " + this.urun + "\n Toplam Fiyat : " + this.toplamTutar);
	}

	public OtomatDepo() {

	}

}
