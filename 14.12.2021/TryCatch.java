package deneme3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	static int yas;

	public static void main(String[] args) {
		

		int count=0;

		
		while (count < 10000) {
			Scanner scan = new Scanner(System.in);
            System.out.print("Lütfen yaþýnýzý giriniz : ");
            try {
                yas = scan.nextInt();
                if (yas < 0) {
                    System.out.println("Lütfen pozitif  bir sayý giriniz ");
                } else if (yas <= 10) {
                    System.out.print("Facebook hesabi acmak icin cok gencsin");
                    count=10000;
                } else if ((yas <= 16)) {
                    System.out.println("Ehliyet almak icin cok gencsin");
                   count=10000;
                } else if ((yas <= 18)) {
                    System.out.println("Dövme yaptirmak icin cok gencsin");
                    count=10000;
                } else if ((yas <= 21)) {
                    System.out.println("Alkol icmek icin cok gencsin");
                    count=10000;
                } else {
                    System.out.println("istedigini yapabilirsin");
                   count =10000;
                }
            } catch (InputMismatchException e) {
                System.out.println("rakam girmelisiniz!");
                count++;
            }
            
		}
	//	scan.close();
}
}
