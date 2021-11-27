package teamGuru01;

import java.util.Scanner;

public class C05_KrediKarti {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya Adý, Soyadý ve kredi kartý numaralarýný sorarak verilen formata
		 * ceviren java kodunu yaziniz. Input : John White 1234234534561478 Output :
		 * Name : J* W** CCN : ** ** **** 1478 * Ilk Harfler Buyuk harf ile
		 * baslamalidir.*
		 */

	Scanner scan = new Scanner(System.in);
	System.out.print("Lutfen ad soyad bilgilerinizi giriniz : ");
	String adSoyad = scan.nextLine().toLowerCase();
	 System.out.print("Lutfen Kredi kartinizin uzerindeki 16 haneli kart numarasini giriniz : ");
	 String kk=scan.nextLine().replaceAll("\\s", "");
	
	 
	 
	if (kk.length()==16) {
		isimduzenle(adSoyad);
		kkduzenle(kk);
	} else {
		System.out.println("LUTFEN KREDI KARTI NUMARANIZI 16 HANELI OLACAK SEKILDE GIRINIZ");
	}
	
	
	scan.close();	
		
		
	}
	     @SuppressWarnings("unused")
		private static void isimduzenle(String adSoyad) {
			int index = adSoyad.indexOf(" ");
			int index2 = adSoyad.lastIndexOf(" ");
			if (index==index2) {
				String ad = adSoyad.substring(0, index);
				//  String ad2 = adSoyad.substring(index + 1, index2);
				String soyad = adSoyad.substring(index2+1);
				String duzenlenmisAd = ad.toUpperCase().charAt(0) + ad.substring(1, index).replaceAll("\\w", "*");
				//	String duzenlenmisAd2 = ad2.toUpperCase().charAt(0) + ad2.substring(1).replaceAll("\\w", "*");
				String duzenlenmisSoyad =soyad.toUpperCase().charAt(0)+soyad.substring(1).replaceAll("\\w", "*");
				
				System.out.println((ad.toUpperCase().charAt(0) + ad.substring(1, index).replaceAll("\\w", "*")+
						soyad.toUpperCase().charAt(0)+soyad.substring(1).replaceAll("\\w", "*"))); 
			
			} else if (index!=index2) {
					String ad = adSoyad.substring(0, index);
					 String ad2 = adSoyad.substring(index + 1, index2);
					String soyad = adSoyad.substring(index2+1);
					String duzenlenmisAd = ad.toUpperCase().charAt(0) + ad.substring(1, index).replaceAll("\\w", "*");
					String duzenlenmisAd2 = ad2.toUpperCase().charAt(0) + ad2.substring(1).replaceAll("\\w", "*");
					String duzenlenmisSoyad =soyad.toUpperCase().charAt(0)+soyad.substring(1).replaceAll("\\w", "*");
					
					System.out.println(ad.toUpperCase().charAt(0) + ad.substring(1, index).replaceAll("\\w", "*")
							+ad2.toUpperCase().charAt(0) + ad2.substring(1).replaceAll("\\w", "*")
							+soyad.toUpperCase().charAt(0)+soyad.substring(1).replaceAll("\\w", "*"));
					
			} 
			
	}
		@SuppressWarnings("unused")
		private static void kkduzenle(String kk) {
			String duzenlenmiskk= kk.substring(1, 13).replaceAll("\\w", "*")+kk.substring(12);
			System.out.println((kk.substring(1, 13).replaceAll("\\w", "*")+kk.substring(12)));
		
	}}
		/*
		 * public class StringOrnek9 {
    public static void main(String[] args) {

    // string tanýmlanmasý							// bu method derste gormedik ama cok ise yarayabilir. ogrenmek gerek
    String myString = "Merhaba dunya";

    String[] words = myString.split(" ");
    }
}
		 */
		
	