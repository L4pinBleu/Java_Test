/** Program of Test. 
* @author Nicolas Mor
* @author nicolas.mor@edu.univ-fcomte.fr
* @version 1.0 30/01/2018
*/

/* Name of file */
public class Test_Java{

/* Function/Types Declaration */

/**
* Retourne le plus grand des arguments
* entre a et b de type double.
*
* @param a un double
* @param b un double
* @return Vrai si a>b
*/
public static boolean plusGrandouble(double a,double b){
	if (a>b)return true;
	else return false;
}

/** 
* Remplie un tableau de boolean avec équiprobabilité
* d'un tableau de boolean passer en parametre.
*
* @param tab un tableau de boolean
*/
public static void initTableauBoolD1(boolean [] tab){
	int i;
	for (i = 0 ; i < tab.length ; i++ ){
		tab[i] = (Math.random()<0.5);
	}
}


/* Main of file */
	public static void main(String[] args) {
		//Variables locales
		final int TAILLE = 100;
		boolean [] tab = new boolean [TAILLE];
		int i; 
		//Execution du programme
		initTableauBoolD1(tab);
		for (i = 0 ; i < tab.length ; i++){
			System.out.println((i+1) + " : " + tab[i]);
		}

	}
}