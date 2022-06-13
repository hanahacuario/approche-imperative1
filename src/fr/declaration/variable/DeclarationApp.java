package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//déclarez une variable de chacun des types suivants avec un littéral différent de 0 pour les chiffres
		
		byte a = 12; //Les variables de type byte stockent de petits nombres entiers entre -128 et +127. Occupe 1 octet en mémoire
		
		short b = -10537; //Les variables de type short stockent des nombres entiers entre -32 768 et +32 767. Occupe 2 octets en mémoire.
		
		int c = 678907; // Les variables de type int stockent des nombres entiers entre -2,1 milliards et +2,1 milliards.Occupe 4 octets en mémoire.
		
		long d = 67000000L; // Les variables de type long stockent des nombres entiers entre -9,22.1018 et 9,22.1018 .Occupe 8 octets en mémoire.
		
		float e = 3.14F; // Les variables de type float stockent des nombres réels entre -3,4.1038 et 3,4.1038.Occupe 4 octets en mémoire
		
		double f = 1.9; //Les variables de type double stockent des nombres réels entre -1,79.10308 et 1,79.10308. Occupe 8 octets en mémoire
		
		char g = 'g'; 
		
		boolean h = true; //Sert à stocker une information qui est soit vraie soit fausse.
		
		//AFFICHAGE DE LA VALEUR D’UNE VARIABLE
		//En Java pour afficher un résultat on utilise System.out.println(...) et on met entre parenthèses ce qu’on veut afficher :
			//- une variable
			//- directement un littéral.
		
		String text = "Je vais reussir!";
		
		System.out.println("Variable de type byte est: a = " + a);
		
		System.out.println("Variable de type short est: b = " + b);
		
		System.out.println("Variable de type int est: c = " + c);
		
		System.out.println("Variable de type long est: d = " + d);
				
		System.out.println("Variable de type float est: e = " + e);
		
		System.out.println("Variable de type double est: f = " + f);
		
		System.out.println("Variable de type chart est: g = " + g);
		
		System.out.println("Variable de type boolean est: h = " + h);
		
		System.out.println("Variable de type string est: text = " + text);
		
		//Retour à la ligne dans une chaine de caractère
		//Déclarer la variable suivante :
		
		System.out.println("-------------------------");
		
		String randomString = "Voici le résultat d’un calcul : 1+5=6";
		
		//Utilisez la méthode System.out.println(...) pour afficher randomString.
		
		System.out.println(randomString);
		
		//Modifiez la chaine de caractères afin de mettre un saut de ligne après le caractère « : ».

		String randomString1 = "Voici le résultat d’un calcul :\n1+5=6";
		
		System.out.println(randomString1);
		
	}

}
