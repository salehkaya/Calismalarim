package teamGuru01;

import java.util.Scanner;

public class C07_charDegiskeni {

	public static void main(String[] args) {
		/* Char de�i�ken yan�t�n�n de�erini test eden ve a�a��daki i�lemleri ger�ekle�tiren bir switch ifadesi yaz�n. 
		 * (Replit � If_Switch_Ternary_StringMethods 4)
	yan�t a ise,"Talebiniz i�leniyor" mesaj� yazd�r�l�r 
	yan�t b ise,"yine de ilgilendi�iniz i�in te�ekk�r ederiz" mesaj� yazd�r�l�r 
	yan�t c ise,"�zg�n�z, �u anda herhangi bir yard�m yok" mesaj� yazd�r�l�r. 
	ba�ka herhangi bir yan�t de�eri i�in,"Ge�ersiz giri�, l�tfen tekrar deneyin!" yazd�r�l�r.

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
