package sayiTahminOyunu;

import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Sayi Tahmin Oyununa Hosgeldin\n Nick Name Giriniz ");  // kullanicidan oyun icinde kullanmak icin bir nickname girmesini istedik
		String nickName = scan.nextLine();
		int count=0;		// yanlis tahmin sayisini kontol edebilmek icin count olusturduk.
		int tahmin=0;		// kullanici tahminlerini tutabilmek icin bir veriable olusturduk
		int sayi=(int)(Math.random()*100);	// method kullanarrak 1-100 arasi random bir sayi uretiyoruz
		while (count<5) {
			System.out.println((count+1)+". Tahmininizi giriniz");
			tahmin=scan.nextInt();
			if (tahmin==sayi) {   // eger uretilen sayi ile kullanici tahmini esitse 
				System.out.println("<|> TEBRIKLER <|> \n"+nickName +" Dogru Tahmin");
				break;
			} else if (tahmin<sayi) {  // kullanicini tahmini sayidan kucukse 
				System.out.println(" Tuh! Bu Sefer OLmadi :( Tahminini biraz Yukseltmeyi dene ");
				count++;  // yanlis tahminde count bir artiyor
				continue;	// yanlis tahminde dongunun devam etmesi icin continue keywordu kullaniyoruz
			}else {				// kullanicini tahmini sayidan buyukse
				System.out.println(" Tuh! Bu Sefer OLmadi :( Tahminini biraz Kuculterek Tekrar dene ");
				count++;	// yanlis tahminde count bir artiyor
				continue;	// yanlis tahminde dongunun devam etmesi icin continue keywordu kullaniyoruz
			} 
			
		}
			if (count>=5) {		// eger count 5 olmus ve dogru tahmin edilememisse oyun biter
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
						+ " \nUZGUNUM KAYBETTIN "+nickName+" :(\n\tBulman Gereken Sayi :"+sayi+" di");
			} else {
				System.out.println((count)+". Seferde Dogru Tahmin Ettiniz.\nPuaniniz : "+(4-(count+1))*20);
			}
		
		scan.close();
		
	}

}
