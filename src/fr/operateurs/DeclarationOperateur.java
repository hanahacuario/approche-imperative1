package fr.operateurs;

public class DeclarationOperateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TESTEZ LES OPERATEURS && ET ||
		// Exécutez le code suivant :
		
		int a = 10;
		int b = 20;
		boolean testEt = a>0 && b <10;
		
		// Utilisez l’instruction System.out.println pour afficher la valeur de la variable testEt.
		System.out.println(testEt);
		
		// Ajoutez maintenant la ligne de code suivante :
		
		boolean testOu = a>0 || b<10;
		
		//
		System.out.println(testOu);
		// Utilisez l’instruction System.out.println pour afficher la valeur de la variable testOu.
		
		// TESTEZ LES OPERATEURS COMBINES
		
		// Ajoutez la ligne suivante :
		a = a + 1;
		// Affichez la valeur de a.

		System.out.println(a);
		
		// Ajoutez la ligne suivante :
		a++;
		// Affichez la valeur de a.
		
		System.out.println(a);
		
		// Ajoutez la ligne suivante :
		a+=1;
		// Affichez la valeur de a.
		System.out.println(a);
		
		// TESTEZ L’OPERATEUR TERNAIRE
		// Ajoutez la ligne suivante :
		
		String c = a>0 ? "a est plus gand que 0" : "a est inferieur a 0";
		
		// Affichez la valeur de c.
		
		System.out.println(c);
		
		
	}	

}
