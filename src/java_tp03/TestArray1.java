/**
 * 
 */
package java_tp03;

import java.util.Arrays;

/**
 * @author ETY0009
 *
 */
public class TestArray1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Exercice 1
		
		// création du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// boucle affiche le tableau à l'endroit
		System.out.println("point 1");
		for(int item : array) {
			
			System.out.println(item);
			
		}
		
		// boucle affiche le tableau à l'envers
		System.out.println("\npoint 2");
		for(int i = array.length-1; i >=0; i--) {
			
			System.out.println(array[i]);
			
		}
		
		// boucle pour afficher que les entiers supérieurs à 3
		System.out.println("\npoint 3");
		for(int item : array) {
			
			if(item > 3)
				System.out.println(item);
			
		}
		
		// boucle affiche que les entiers pairs
		System.out.println("\npoint 4");
		for(int item : array) {
			
			if(item%2 == 0)
				System.out.println(item);
			
		}
		
		// afficher le plus grand element du tableau
		System.out.println("\npoint 5");
		Arrays.sort(array);
		System.out.println(array[array.length-1]);
		
		// afficher le plus grand element du tableau
		System.out.println("\npoint 6");
		Arrays.sort(array);
		System.out.println(array[0]);
		
	}

}
