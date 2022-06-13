package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Affichez tous les nombres de 1 à 10
		for (int i = 1; i <= 10; i++) {System.out.println("Affichage des numeros de 1-10 sont: " + i);
		System.out.println("------");
		}

		// Affichez 20 fois votre nom et votre prénom
		for (int i=1; i<=20; i++) {System.out.println("Mon nom est Ana " + i);
		System.out.println("------------------");
		}
		
		// Affichez les éléments pairs de 2 à 100
		for (int i = 2; i <= 100; i = i + 2) {System.out.println("Affichage des numeros paires de 2-100 sont: " + i);
		System.out.println("------------------------------------------------");
		}
		
		// Affichez les éléments impairs de 1 à 99
		for (int i = 1; i <= 100; i = i + 2) {System.out.println("Affichage des numeros impaires de 1-99 sont: " + i);
		System.out.println("------------------------------------------------");
		}
		
	}

}
