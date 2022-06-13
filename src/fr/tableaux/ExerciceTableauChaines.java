package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Déclarez un tableau de chaines de caractères contenant 5 noms de villes au choix.
		
		String[] villes = {"Aruba", "Jamaica", "Bermuda", "Bahamas", "Key Largo"};
		
		// Affichez les 5 éléments du tableau

		System.out.println("la premier ville du tableau est: " + villes[0]);
		System.out.println("-------------------------");
		System.out.println("la deuxieme ville du tableau est: " + villes[1]);
		System.out.println("-------------------------");
		System.out.println("la troisieme ville du tableau est: " + villes[2]);
		System.out.println("-------------------------");
		System.out.println("la quatrieme ville du tableau est: " + villes[3]);
		System.out.println("-------------------------");
		System.out.println("la cinquieme ville du tableau est: " + villes[4]);
		System.out.println("-------------------------");
		
		// Affichez la longueur du tableau
		System.out.println("la longueur du tableau est: " + villes.length);
		System.out.println("-------------------------");
		
		// Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
		villes[3] = "Reims";
		
		// Affichez les 5 éléments du tableau après modification
		System.out.println("la premier ville du tableau est: " + villes[0]);
		System.out.println("-------------------------");
		System.out.println("la deuxieme ville du tableau est: " + villes[1]);
		System.out.println("-------------------------");
		System.out.println("la troisieme ville du tableau est: " + villes[2]);
		System.out.println("-------------------------");
		System.out.println("la quatrieme ville du tableau est: " + villes[3]);
		System.out.println("-------------------------");
		System.out.println("la cinquieme ville du tableau est: " + villes[4]);
		System.out.println("-------------------------");
	}

}
