package teamGuru01;

import java.util.Scanner;

public class C07_charDegiskeni {

	public static void main(String[] args) {
		/* Char deðiþken yanýtýnýn deðerini test eden ve aþaðýdaki iþlemleri gerçekleþtiren bir switch ifadesi yazýn. 
		 * (Replit – If_Switch_Ternary_StringMethods 4)
	yanýt a ise,"Talebiniz iþleniyor" mesajý yazdýrýlýr 
	yanýt b ise,"yine de ilgilendiðiniz için teþekkür ederiz" mesajý yazdýrýlýr 
	yanýt c ise,"Üzgünüz, þu anda herhangi bir yardým yok" mesajý yazdýrýlýr. 
	baþka herhangi bir yanýt deðeri için,"Geçersiz giriþ, lütfen tekrar deneyin!" yazdýrýlýr.

		 */
	
	
	Scanner scan=new Scanner (System.in);
	System.out.println("Musteriye vermek istediginiz cevabi giriniz\nTalebiniz isleniyor : 'A'"
			+ "\nYine de ilgilendiginiz icin tesekkurler : 'B'"
			+ "\nUzgunum suan herhangi bir yardim yok : 'C' harfini giriniz");
	
	char tercih=scan.next().toUpperCase().charAt(0);
	
		switch (tercih) {
		case 'A':
			System.out.println("Talebiniz isleniyor");
			break;
		case 'B':
			System.out.println("Yine de ilgilendiginiz icin tesekkurler :/");
			break;
		case 'C':
			System.out.println("Uzgunum suan herhangi bir yardim yok :( ");
			break;
		default:
			System.out.println(" YANLIS BIR TERCIH YAPTINIZ!! LUTFEN TEKRAR DENEYIN");
			break;
		}
	
	scan.close();
	
	
	}

}
