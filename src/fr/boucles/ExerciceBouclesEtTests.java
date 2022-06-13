package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Afficher l’ensemble des éléments du tableau grâce à une boucle
		System.out.println("Elements du tableau sont: ");
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + ", ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		System.out.println("Elements du tableau dans l’ordre inverse sont: ");
		for (int i = array.length-1; i>=0; i--) {
		System.out.print(array[i] + ", ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		// Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		System.out.println("Elements du tableau supérieurs à 3 sont: ");
		for (int i = 0; i < array.length; i++) {
			if(array[i]>3) {
		System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		// Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println("Elements du tableau pairs sont: ");
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
		System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		// Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
		
		System.out.println("les valeurs du tableau avec des index pairs sont: ");
		for (int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
		System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		
		// Combiner une boucle et un test de manière à n’afficher que les entiers impairs

		System.out.println("Elements du tableau impairs sont: ");
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 1) {
		System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
	}

}
