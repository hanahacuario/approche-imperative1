package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] tableau = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Rechercher le plus grand élément du tableau
		//Intialisation variable max avec la valeur contenue a l'index 0 dans le tableau
		int max = tableau[0];
		
		// On boucle a partir de l'index 0
		for (int i = 0; i < tableau.length; i++) {
			if(tableau[i] > max) {
				max = tableau[i];
			}
		}
		
		System.out.println("le plus grand élément du tableau est: " + max);
		
		
		
		
	}

}
