package teamGuru01;

import java.util.Scanner;

public class C03_CaySeker {

	public static void main(String[] args) {
		// Kullan�c�ya g�nde ne kadar �ay i�ti�ini ve ne kadar �eker kulland���n� sorun.
		// Y�lda ka� kg �eker kulland���n� hesaplay�n ve yazd�r�n.
		//	1 �eker = 1.7 gr
		//	�rnek ��kt�:
		//	Y�lda 12.41 kg �eker kullan�yor.
		

		
		Scanner scan=new Scanner (System.in);
		System.out.println(" Cayinizda seker kullaniyor musunuz?\nCevabinizi EVET yada HAYIR olarak giriniz");
		String cevap=scan.next().toUpperCase();
		if (cevap.contains("EVET")) {
			System.out.println("Bir gunde kac bardak cay iciyorsunuz");
			int cay=scan.nextInt();
			System.out.println("Bir bardak cay icin kac seker kullaniyorsunuz");
			int seker=scan.nextInt();
			double sonuc= (((1.7*seker)*cay)*365);
			double yildakg= sonuc/1000;
			
			System.out.println(" Bir yilda ortalama "+ yildakg+ "kg seker tuketiyorsunuz"); 
			
		} else if (cevap.contains("HAYIR")) {
			System.out.println("****TEBRIKLER****\n=>SAGLIKLI GELECEK ICIN SIFIR SEKER<= ");
		} else {
			System.out.println("yanlis cevap girdiniz lutfen tekrar deneyin");
		}
		scan.close();
		
		
		
	}

}
