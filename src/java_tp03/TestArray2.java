package java_tp03;

import java.util.Arrays;
import java.util.OptionalDouble;

public class TestArray2 {

	public static void main(String[] args) {
		
		int[] array= {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		// moyenne des éléments du tableau
		System.out.println("Moyenne");	
		OptionalDouble average = Arrays.stream(array).average();
		System.out.println(average);	
		
		// index dans le tableau de l'entier 15
		System.out.println("\nindex de l'entier 15");
		for(int i = 0; i <= array.length-1; i++) {
			
			if(array[i] == 15) {
				System.out.println(i);
			}
		}
		
		// trouver nombre entiers en doublon dans le tableau
		System.out.println("\nDoublons");
		int doublon;
		int index = 0;
		int tab2[] = new int[array.length];
		
		for(int item : array) {
			
			doublon = 0;
				
			for(int i=0; i <= array.length-1; i++) {
					
				if(item == array[i]) {
						
					doublon += 1;
				}
			}
			
			if(doublon > 1) {
				
				tab2[index] = doublon;
				
				index += 1;
			}
				
		}
	}

}
