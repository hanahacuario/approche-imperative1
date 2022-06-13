package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarez un tableau d’entiers contenant tous les chiffres suivants : 8, -7, 12, 1, -2, 14, 17, 9
		
		int [] entiers = { 8, -7, 12, 1, -2, 14, 17, 9 };
		
		// Affichez l’élément du tableau d’index 0 du tableau
		
		System.out.println("l’élément du tableau d’index 0 est : " + entiers[0]);
		
		System.out.println("-------------------------");
		
		// Affichez la longueur du tableau
		
		System.out.println("la longueur du tableau est : " + entiers.length);
		System.out.println("-------------------------");
		
		// Affichez l’entier positionné au dernier index du tableau
		
		System.out.println("l'élément positionné au dernier index du tableau est : " + entiers[entiers.length - 1]);
		
		System.out.println("-------------------------");

		// Affichez l’entier d’index 10. Pourquoi cela échoue ? Affichez un commentaire dans votre code pour l’expliquer.
		
		System.out.println("l’élément du tableau d’index 10 est : " + entiers[10]);
		
		// Erreur: L'Index 10 is out of bounds for length 8 at fr.tableaux.ExerciceDeclarationTab.main
		
	}

}
