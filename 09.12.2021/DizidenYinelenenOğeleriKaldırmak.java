package deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DizidenYinelenenOðeleriKaldýrmak {

	public static void main(String[] args) {
		// Write a Java program to remove duplicate elements from an array.
		// Bir diziden yinelenen öðeleri kaldýrmak için bir Java programý yazýn .

		int arr[] = { 2, 1, 5, 6, 7, 8, 4, 3, 2, 1, 5, 9, 6, 4, 1, 5, 8, 9, 3, 6, 4, }; // test datasi olusturduk.
		System.out.println("\t\ttest datamiz");
		System.out.println(Arrays.toString(arr));
		int tekrarsizArr[] = new int[arr.length]; // tekrarli sayilari sildikten sonra atacagimiz array olusturduk
		List<Integer> list = new ArrayList<>(); // 2. cozum icin list olusturduk

		Arrays.sort(arr); // Array'deki elemanlari siraladik
		System.out.println("\t\ttest datasi sortlandi");
		System.out.println(Arrays.toString(arr)); // kor bile bir goreyim demis :)

		int count = 0; // trick olarak kabul edilebilir. tekrarsizArr indexini kontrol etmek icin
						// olusturuldu
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) { // eger arr[i] kendisinden sonra gelen elemana esit degilse
				tekrarsizArr[count] = arr[i]; // tekrarsizArr'nin count indexine arr[i] atadik.
				count++; // bir sonraki indexe atama yapabimek icin dongu icinde arttirma yaptik
				list.add(arr[i]); // 2. cozum icin liste atama yaptik
			}
		}
		System.out.println(" \t\tson eleman assign edilmedi");
		System.out.println(Arrays.toString(tekrarsizArr));
		tekrarsizArr[count] = arr[arr.length - 1]; // trick:
		list.add(arr[arr.length - 1]);
		System.out.println("\t\tAssign islemi sonrasi tekrarsizArr");
		System.out.println(Arrays.toString(tekrarsizArr)); // array lenght degismedigi icin bu sonucu gorduk.

		System.out.println("\t\t tekrarsizArr For ile yazdirildi");
		for (int i = 0; i < count+1; i++) { // for icinde sadece count'a kadar olan elemanlari yazdirdik
			System.out.print(tekrarsizArr[i] + " ");
		}

		System.out.println("\n\t\t 2. cozum list ile sonuc");
		System.out.println(list); // 2. cozum yazdirildi.

	}
}
