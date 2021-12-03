package teamGuru01;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		/*) Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.
		 * Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, 
		 * herhangi bir sayý Mükemmel Sayý olarak bilinir. (Replit - For_while 7)
		 * 6,28,496,8128 mukemmel sayilara ornektir.
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println(" 'Mukemmel sayi' olup olmadigini kontrol etmek istediginiz sayiyi giriniz");
		int sayi=scan.nextInt();
		int bolenlerToplami=0;
		
		for (int i = 1; i < sayi; i++) {
			if (sayi%i==0) {
				bolenlerToplami+=i;
			}
		}
		
		if (sayi==bolenlerToplami) {
			System.out.println(" mukemmel sayidir");
		}else {
			System.out.println(" mukemmel sayi degildir");
		}
		scan.close();
		
		
		
		
		
	}

}
