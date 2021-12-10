package deneme;

import java.util.Arrays;
import java.util.Scanner;

public class KullanicidanAlinanVerilerleArraydenElemanSilme {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz veriler ile bir array olusturun ve Daha sonra
		 * kullaniciya elemani silmek istedigini sorun ve array den kaldirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println(" Kac Sayi Girmek Istiyorsunuz");
		int uzunluk = scan.nextInt();

		int arr[] = new int[uzunluk];

		for (int i = 0; i < uzunluk ; i++) {
			System.out.println((i + 1) + ". sayiyi " + " giriniz");
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("=================================");
		System.out.println("Silmek istediginiz sayiyi giriniz ");
		int silinecekSayi = scan.nextInt();
		int silinecekSayiIndex = Arrays.binarySearch(arr, silinecekSayi);

		int count = 0;

		int yeniArr[] = new int[arr.length - 1];

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == arr[silinecekSayiIndex]) {
				continue;
			}
			yeniArr[count] = arr[j];
			count++;
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(yeniArr));
scan.close();
	}
}
