package teamGuru01;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		/*) Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
		 * Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, 
		 * herhangi bir say� M�kemmel Say� olarak bilinir. (Replit - For_while 7)
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
