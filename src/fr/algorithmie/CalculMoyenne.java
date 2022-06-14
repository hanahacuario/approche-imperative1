package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] tableau = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Quelle est la moyenne des éléments du tableau ?
		// on defini la variable moyenne et la variable somme
		int somme = 0;
		float moyenne = 0.0f;
		
		// Calculer la somme de tous les elements avec une boucle
		for ( int i = 0; i<tableau.length; i++) {
			somme += tableau[i];
		}
		
		// calculer la moyenne a partir du resultat de la somme divise par les elements du tableau
		
		moyenne = somme / tableau.length;
		
		// imprimer: le resultat de la somme, total de elements et de la moyenne
		System.out.println("La somme totale des elements est: " + somme);
		System.out.println("Le total des elements du tableau: " + tableau.length);
		System.out.println("La moyenne des éléments du tableau est: " + moyenne);
		
	}

}
