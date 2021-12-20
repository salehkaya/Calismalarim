package _08_While_DoWhile;

import java.util.Scanner;

public class TabanVeUsSayilari {

    public static void main(String[] args) {
        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //ilk girilen  sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen taban giriniz");
        int taban=scan.nextInt();
        System.out.println("Lutfen us kuvveti giriniz");
        int us= scan.nextInt();
        
        int count=us;
        int sonuc=1;
        
      /*  while (count!=0) {
			
        	sonuc*=taban;
        	count--;
        	
		}
        System.out.println(sonuc);
     */   
        
        do {
        	sonuc*=taban;
        	count--;
        	
        	
		} while (count!=0);
        
        System.out.println(sonuc);
        
       scan.close(); 
        
    }


}
