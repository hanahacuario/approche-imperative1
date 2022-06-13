package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] tableauArray = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Déclaration d'une variable stockant la longueur du tableau (facultatif)
				int longtab = tableauArray.length;
		
		// Afficher l’ensemble des éléments du tableau grâce à une boucle
		String arrayText = "l’ensemble des éléments du tableau: ";
		System.out.println(arrayText);
		System.out.println("-------------------------------------");		
		for (int i = 0; i < longtab; i++) {
			System.out.println(tableauArray[i]);
		}
		System.out.println();
		
		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		String tableauInverse = "l’ensemble des éléments du tableau dans l’ordre inverse sont: ";
		System.out.println(tableauInverse);
		System.out.println("-------------------------------------");		
		for (int i = longtab - 1; i >= 0;i--) {
			System.out.println(tableauArray[i]);
		}

		
	}

}
