package teamGuru3;

import java.util.Arrays;
import java.util.Scanner;

public class fizzBuzz {

	public static void main(String[] args) {
		/*
		 * Soru 4) Bağımsız değişken ve getiri olarak bir sayı alır bir işlev oluşturun
		 * "Fizz", "Buzz" ya da "FizzBuzz". Sayı 3'ün katıysa çıktı olmalıdır "Fizz".
		 * Verilen sayı 5'in katı ise çıktı olmalıdır "Buzz". Verilen sayı hem 3 hem de
		 * 5'in katıysa, çıktı olmalıdır "FizzBuzz". Sayı 3 veya 5'in katı değilse,
		 * aşağıdaki örneklerde gösterildiği gibi sayı kendi başına çıkarılmalıdır.
		 * Çıktı, 3 veya 5'in katı olmasa bile her zaman bir dize olmalıdır. (Mülakat
		 * Sorusu)
		 * 
		 * Örnekler: fizzBuzz(3) ➞ "Fizz" fizzBuzz(5) ➞ "Buzz" fizzBuzz(15) ➞ "FizzBuzz"
		 * fizzBuzz(4) ➞ "4" Notlar: Bir şeyleri nasıl hecelediğin ve büyük harfleri
		 * nereye koyduğun konusunda kesin olmaya çalış.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println(" kac elemanli bir dize olusturmak istiyorsunuz");
		int lenght = scan.nextInt();

		int arr[] = new int[lenght];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(" lutfen " + (i + 1) + ". sayiyi giriniz");
			arr[i] = scan.nextInt();

			if (arr[i] % 5 == 0 && arr[i] % 3 == 0) {
				System.out.println("***FizzBuzz***");
			} else if (arr[i] % 5 == 0) {
				System.out.println("***Buzz***");
			} else if (arr[i] % 3 == 0) {
				System.out.println("***Fizzz***");
			}
			if (arr[i] % 3 != 0 && arr[i] % 5 != 0 && (arr[i] % 5 != 0 && arr[i] % 3 != 0)) {
				System.out.println((arr[i]));
			}

		}
		scan.close();
	}

}
