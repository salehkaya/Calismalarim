package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsalSayi {

	/*
	 * 100 den kucuk asal sayilari yazdiran bir program yaziniz
	 */
	public static void main(String[] args) {

		List<Integer> asal = new ArrayList<>(Arrays.asList(2, 3, 5));
		for (int i = 5; i < 100; i++) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				continue;
			} else if (i % i == 0) {
				asal.add(i);
			}

		}

		System.out.println(asal);

	}

}
