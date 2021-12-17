package tasKagitMakas;

import java.util.Scanner;

public class TasKagitMakas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" TAS - KAGIT - MAKAS OYUNUNA HOSGELDINIZ\n Rakibin : Pro Gamer\n\t BASARILAR :) ");
		System.out.println(" Nick Name GIRINIZ: ");
		String kullaniciAdi = scan.nextLine();
		String pcAdi = "Pro Gamer";

		int kullaniciTercih = 0;
		int pcTercih = 0;
		int kullaniciPuani = 0;
		int pcPuani = 0;
				System.out.println(kullaniciAdi+" VS "+pcAdi);
		while (true) {
					
			System.out.println("================================================================== "
					+ "  \nSECIMIZI GIRINIZ\n\t1 ---> TAS\n\t2 ---> KAGIT\n\t3 ---> MAKAS");
			kullaniciTercih = scan.nextInt();
			pcTercih = (int) (Math.random() * 3);
			if (kullaniciTercih == 1) {
				if (pcTercih == 1) {
					System.out.println(kullaniciAdi + " Tercihi : TAS\n" + pcAdi + " Tercihi : TAS\nSonuc: BERABERE");
					System.out.println(
							kullaniciAdi + " Puanin : " + kullaniciPuani + "\n" + pcAdi + " Puani: " + pcPuani);
				} else if (pcTercih == 2) {
					System.out.println(kullaniciAdi + " Tercihi : TAS\n" + pcAdi + " Tercihi : KAGIT\nSonuc: " + pcAdi
							+ "KAZANDI");
					pcPuani++;
					System.out.println(
							kullaniciAdi + " Puanin : " + kullaniciPuani + "\n" + pcAdi + " Puani: " + pcPuani);
				} else {
					System.out.println(kullaniciAdi + " Tercihi :TAS\n" + pcAdi + " Tercihi : MAKAS\nSonuc: "
							+ kullaniciAdi + " KAZANDI");
					kullaniciPuani++;
					System.out.println(
							kullaniciAdi + " Puanin : " + kullaniciPuani + "\n" + pcAdi + " Puani: " + pcPuani);
				}

			} else if (kullaniciTercih == 2) {
				if (pcTercih == 1) {
					System.out.println(kullaniciAdi + " Tercihi : KAGIT\n" + pcAdi + " Tercihi : TAS\nSonuc: "
							+ kullaniciAdi + " KAZANDI");
					kullaniciPuani++;
					System.out.println(
							kullaniciAdi + " Puanin : " + kullaniciPuani + "\n" + pcAdi + " Puani: " + pcPuani);
				} else if (pcTercih == 2) {
					System.out
							.println(kullaniciAdi + " Tercihi : KAGIT\n" + pcAdi + " tercihi : KAGIT\nSonuc: BERABERE");
					System.out
							.println(kullaniciAdi + " Puanin : " + kullaniciPuani + "\nBilgisayarin Puani: " + pcPuani);
				} else {
					System.out.println(kullaniciAdi + " Tercihi : KAGIT\n" + pcAdi + " tercihi : MAKAS\nSonuc: " + pcAdi
							+ " KAZANDI");
					pcPuani++;
					System.out.println(
							kullaniciAdi + " Puanin : " + kullaniciPuani + "\n" + pcAdi + " Puani: " + pcPuani);
				}

			} else if (kullaniciTercih == 3) {
				if (pcTercih == 1) {
					System.out.println(kullaniciAdi + " Tercihi : MAKAS\n" + pcAdi + " tercihi : TAS\nSonuc: " + pcAdi
							+ " KAZANDI");
					pcPuani++;
					System.out.println(
							kullaniciAdi + " Puanin : " + kullaniciPuani + "\n" + pcAdi + " Puani: " + pcPuani);
				} else if (pcTercih == 2) {
					System.out.println(kullaniciAdi + " Tercihi : MAKAS\n" + pcAdi + " tercihi : KAGIT\nSonuc: "
							+ kullaniciAdi + " KAZANDI");
					kullaniciPuani++;
					System.out.println(
							kullaniciAdi + " Puanin : " + kullaniciPuani + "\n" + pcAdi + " Puani: " + pcPuani);
				} else {
					System.out
							.println(kullaniciAdi + " Tercihi : MAKAS\nBilgisayarin tercihi : MAKAS\nSonuc: BERABERE");
					System.out
							.println(kullaniciAdi + " Puanin : " + kullaniciPuani + "\nBilgisayarin Puani: " + pcPuani);
				}

			} else {
				System.out.println(" Hatali giris lutfen tekrar deneyin");
				continue;
			}

			if (kullaniciPuani == 3) {
				System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
						+ "<|> TEBRIKLER <|>\nOYUNU " + kullaniciPuani + "-" + pcPuani + " " + kullaniciAdi
						+ " KAZANDI");
				break;
			} else if (pcPuani == 3) {
				System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
						+ "\n:( UZGUNUM :(\nOYUNU " + pcPuani + "-" + kullaniciPuani + " " + pcAdi + " KAZANDI\"");
				break;
			}

		}
		scan.close();
	}

}
