package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7,
		// -1, 17, 2, 3, 0, 14, -4} ;
		int[] tableau = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Combiner une boucle et un test de manière à n’afficher que les entiers
		// supérieurs à 3

		String titreSuperieur3 = "Valeurs entiers supérieurs à 3:";
		System.out.println(titreSuperieur3);
		System.out.println("-------------------------------");
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] > 3) {
				System.out.println(tableau[i]);
			}
		}
		// Saut de ligne
		System.out.println();
		// Combiner une boucle et un test de manière à n’afficher que les entiers pairs

		String titrePairs = "Valeurs entiers pairs:";
		System.out.println(titrePairs);
		System.out.println("------------------------");
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] % 2 == 0) {
				System.out.println(tableau[i]);
			}
		}
		// Saut de ligne
		System.out.println();

		// Combiner une boucle et un test de manière à n’afficher que les valeurs
		// correspondant aux index pairs
		String titreIndexPairs = "Valeurs correspondant aux index pairs:";
		System.out.println(titreIndexPairs);
		System.out.println("--------------------------------------");

		for (int i = 0; i < tableau.length; i++) {
			if (i % 2 == 0) {
				System.out.println(tableau[i]);
			}
		}
		// Combiner une boucle et un test de manière à n’afficher que les entiers
		// impairs
		// correspondant aux index pairs
		String titreEntiersImpairs = "Valeurs correspondant aux entiers impairs:";
		System.out.println(titreEntiersImpairs);
		System.out.println("------------------------------------------");
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] % 2 == 1) {
				System.out.println(tableau[i]);
			}
		}

	}
}
