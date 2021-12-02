package _10_List;

public class SimetrikSayi {

	public static void main(String[] args) {
		/*
		 * ayna check sorusu: input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 }; output :
		 * verilen array simetriktir
		 */

		int arr[] = { 1, 2, 3, 4, 4, 3, 2, 1 };   // test datasi uzerinden calisildi.Dinamik bir yapi olusturuldu.
		int flag = 0;

		for (int i = 0; i < (arr.length) / 2; i++) {
			if (arr[i] == arr[arr.length - 1 - i]) {
				flag++;
			}
		}
		if (flag == (arr.length) / 2) {
			System.out.println(" girilen sayi simetriktir");
		} else {
			System.out.println(" girilen sayi simetrik degildir");
		}

	}

}
