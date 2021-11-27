package teamGuru01;

import java.util.Scanner;

public class C02_MusteriIndirim {

	public static void main(String[] args) {
	 //  Kullanýcýdan aldýðý ürünün adedini ve liste fiyatýný alin, kullanýcýya
	 //  -müþteri kartý olup olmadýðýný sorun,
	 //-Müþteri kartý varsa ve 10 üründen fazla alýrsa %20, yoksa %15 indirim yapýn. 
	 //-Müþteri kartý yoksa ve 10 üründen fazla alýrsa %15, 10 üründen az alýrsa %10 indirim yapýn. 

		
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
