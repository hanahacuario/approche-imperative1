package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7,
		// -1, 17, 2, 3, 0, 14, -4} ;

		int[] tableau = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Créer un tableau arrayCopy et copier tous les éléments de array dans
		// arrayCopy mais dans l’ordre inverse.
		int[] arrayCopy = new int[tableau.length];
		for (int i = 0; i < arrayCopy.length; i++) {
			arrayCopy[i] = tableau[tableau.length - 1 - i];
		}

		// Afficher l’ensemble des éléments des 2 tableaux
		String nouveauTableau = "Valeurs tableau initial" + " \t| Valeurs arrayCopy" ;
		System.out.println(nouveauTableau);
		System.out.println("------------------------------------------------------");
		
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println( tableau[i] +"                      " + " \t| " + arrayCopy[i]);
		}

	}

}
