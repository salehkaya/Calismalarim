package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraydenTekrarliSayilariSilme {

	public static void main(String[] args) {
		/*
		 * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
		 * sayilardan olusan bir array haline getiren bir program yaziniz.
		 *
		 * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1,} OUTPUT : [1,2,3,4,5,6,7,8,9]
		 */

		int arr[] = { 1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1, 9, 9, 9, 9 };
		List<Integer> list = new ArrayList<>();

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				list.add(arr[i]);
			}
		}

		list.add(arr[arr.length - 1]);
		System.out.println(list);
	}

}
