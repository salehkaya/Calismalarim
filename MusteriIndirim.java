package teamGuru01;

import java.util.Scanner;

public class C02_MusteriIndirim {

	public static void main(String[] args) {
	 //  Kullan�c�dan ald��� �r�n�n adedini ve liste fiyat�n� alin, kullan�c�ya
	 //  -m��teri kart� olup olmad���n� sorun,
	 //-M��teri kart� varsa ve 10 �r�nden fazla al�rsa %20, yoksa %15 indirim yap�n. 
	 //-M��teri kart� yoksa ve 10 �r�nden fazla al�rsa %15, 10 �r�nden az al�rsa %10 indirim yap�n. 

		
		Scanner scan=new Scanner (System.in);
		System.out.print("     ******HOSGELDINIZ******     \nAlmis oldugunuz urun adedini giriniz : ");
		int urun=scan.nextInt();
		System.out.print("Almis oldugunuz urunun liste fiyatini giriniz : ");
		double fiyat= scan.nextDouble();
		System.out.print("Musteri kartiniz var mi?\nVarsa '1' giriniz : ");
		char secim= scan.next().charAt(0);
		
		if (secim=='1') {
			if (urun<=10) {
				System.out.println("Toplam borcunuz $"+((urun*fiyat)-((urun*fiyat)/100)*15));
			} else if (urun>10) {
				System.out.println("Toplam borcunuz $"+((urun*fiyat)-((urun*fiyat)/100)*20));
			}
		} else if (urun<=10) {
			System.out.println("Toplam borcunuz $"+((urun*fiyat)-((urun*fiyat)/100)*10));
		} else if (urun>10) {
			System.out.println("Toplam borcunuz $"+((urun*fiyat)-((urun*fiyat)/100)*15));
		} 
		
		scan.close();
		
		
		
		
	}

}
