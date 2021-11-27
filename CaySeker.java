package teamGuru01;

import java.util.Scanner;

public class C03_CaySeker {

	public static void main(String[] args) {
		// Kullanýcýya günde ne kadar çay içtiðini ve ne kadar þeker kullandýðýný sorun.
		// Yýlda kaç kg þeker kullandýðýný hesaplayýn ve yazdýrýn.
		//	1 þeker = 1.7 gr
		//	Örnek Çýktý:
		//	Yýlda 12.41 kg þeker kullanýyor.
		

		
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
