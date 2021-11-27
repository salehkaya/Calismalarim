package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        
    	Scanner scan =new Scanner (System.in);
    	System.out.println(" Lutfen Armstrong olup olmadigini kontrol etmek istediginiz sayiyi giriniz ");
    	int sayi=scan.nextInt();
    	int num=sayi;
    	int rakam=0;
    	int rakamlarKupuToplami=0;
    	
    	
    	while (sayi!=0) {
			rakam=sayi%10;
			rakamlarKupuToplami+=rakam*rakam*rakam;
			sayi/=10;
		}
    	
    	if (num==rakamlarKupuToplami) {
			System.out.println(num+" Armstrong Sayidir");
		} else {
			System.out.println(num+" Armstrong Sayi degildir");
		}
    	
    	
}
}