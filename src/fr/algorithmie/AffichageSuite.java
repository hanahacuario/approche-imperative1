package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
		String nombre = "les nombres de 1 à 10 inclus sont: ";
		System.out.println(nombre);
		System.out.println("-------------------------------------");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);	
			}
		System.out.println();
		
		//Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus	
		String pairs = "les nombres du 0 à 10 inclus sont: ";
		System.out.println(pairs);
		System.out.println("-------------------------------------");
		
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);	
			}
		System.out.println();
		
		// Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
		String impairs = "les nombres impairs entre 0 et 9 inclus sont: ";
		System.out.println(impairs);
		System.out.println("-------------------------------------");
		
		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i);	
			}
		System.out.println();
		
		// Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
		String nombreW = "les nombres du 0 à 10 inclus sont: ";
		System.out.println(nombreW);
		System.out.println("-------------------------------------");
		
		int i = 1; while (i <=10) {
			System.out.println(i++);			
			}
		
		System.out.println();
		
		// Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
		String pairsWhile = "les nombres pairs entre 0 et 10 inclus sont: ";
		System.out.println(pairsWhile);
		System.out.println("-------------------------------------");
		
		int a = 0; while (a <10) {a = a + 2;
			System.out.println(a);			
			}
		
		System.out.println();
		
		// Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
		String impairsWhile = "les nombres impairs entre 0 et 9 inclus sont: ";
		System.out.println(impairsWhile);
		System.out.println("-------------------------------------");
		
		int b = 1; while (b <9) {b = b + 2;
			System.out.println(b);			
			}
		
		System.out.println();
	}

}
