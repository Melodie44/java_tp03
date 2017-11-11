package java_tp03;

import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {
		
		int[] array= {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		// Trier le tableau dans l'ordre ascendant
		System.out.println("Trier tableau ascendant");
		Arrays.sort(array);
		for(int item : array) {
			System.out.println(item);
		}
		
	}

}
