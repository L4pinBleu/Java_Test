/** Program of Test. 
* @author Nicolas Mor
* @author nicolas.mor@edu.univ-fcomte.fr
* @version 1.0 30/01/2018
* @version 1.1 31/01/2018
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
public static boolean plusGranDouble(double a,double b){
	if (a>b)return true;
	else return false;
}

/**
* Retourne le plus grand des arguments
* entre a et b de type int.
*
* @param a un int
* @param b un int
* @return Vrai si a>b
*/
public static boolean plusGrandInt(int a,int b){
	if (a>b)return true;
	else return false;
}

/**
* Retourne le plus grand des arguments
* entre a et b de type float.
*
* @param a un float
* @param b un float
* @return Vrai si a>b
*/
public static boolean plusGrandFloat(float a,float b){
	if (a>b)return true;
	else return false;
}

/** 
* Remplie un tableau de boolean de dimention 1 avec équiprobabilité
* d'un tableau de boolean passer en parametre.
*
* @param tab un tableau de boolean de dimmention 1
*/
public static void initTableauBoolD1(boolean [] tab){
	int i;
	for (i = 0 ; i < tab.length ; i++ ){
		tab[i] = (Math.random()<0.5);
	}
}

/** 
* Remplie un tableau de boolean de dimention 2 avec équiprobabilité
* d'un tableau de boolean passer en parametre.
*
* @param tab un tableau de boolean de dimention 2
*/
public static void initTableauBoolD2(boolean [][] tab) {
	int i,j;
	for (i = 0 ; i < tab.length ; i++ ){
		for (j = 0 ; j < tab.length ; j++){
			tab[i][j] = (Math.random()<0.5);
		}
	}
}

/** 
* Remplie un tableau de int de dimention 1 avec équiprobabilité
* d'un tableau de int passer en parametre.
*
* @param tab un tableau de int de dimmention 1
*/
public static void initTableauIntD1(int [] tab){
	int i;
	for (i = 0 ; i < tab.length ; i++ ){
		tab[i] = ((int)Math.random());
	}
}

/** 
* Remplie un tableau de int de dimention 2 avec équiprobabilité
* d'un tableau de int passer en parametre.
*
* @param tab un tableau de int de dimention 2
*/
public static void initTableauIntD2(int [][] tab) {
	int i,j;
	for (i = 0 ; i < tab.length ; i++ ){
		for (j = 0 ; j < tab.length ; j++){
			tab[i][j] = ((int)Math.random());
		}
	}
}

/** 
* Remplie un tableau de double de dimention 1 avec équiprobabilité
* d'un tableau de double passer en parametre.
*
* @param tab un tableau de double de dimmention 1
*/
public static void initTableauDoubleD1(double [] tab){
	int i;
	for (i = 0 ; i < tab.length ; i++ ){
		tab[i] = (Math.random());
	}
}

/** 
* Remplie un tableau de double de dimention 2 avec équiprobabilité
* d'un tableau de double passer en parametre.
*
* @param tab un tableau de double de dimention 2
*/
public static void initTableauDoubleD2(double [][] tab) {
	int i,j;
	for (i = 0 ; i < tab.length ; i++ ){
		for (j = 0 ; j < tab.length ; j++){
			tab[i][j] = (Math.random());
		}
	}
}

/** 
* Affichage d'un tableau a 1 dimention de double
*
* @param tab : Un tableau a une dimention
*/
public static void affichageTableauDoubleD1(double [] tab){
	double i; 
	for (i = 0.0 ; i < tab.length ; i++){
		System.out.println((i+1.0) + " : " + tab[i]);
	}
}

/** 
* Affichage d'un tableau a 2 dimention de double
*
* @param tab : Un tableau a deux dimention
*/
public static void affichageTableauDoubleD2(double [] tab){
	double i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++)
		System.out.println((i+1) + " : " + tab[i]);
	}
}

/** 
* Affichage d'un tableau a 1 dimention de int
*
* @param tab : Un tableau a une dimention
*/
public static void affichageTableauIntD1(int [] tab){
	int i; 
	for (i = 0 ; i < tab.length ; i++){
		System.out.println((i+1) + " : " + tab[i]);
	}
}

/** 
* Affichage d'un tableau a 2 dimention de int
*
* @param tab : Un tableau a deux dimention
*/
public static void affichageTableauIntD2(int [] tab){
	int i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++){
		System.out.print(tab[j] + " ");
		System.out.println((i+1) + " : " + tab[i]);
		}
	}
}

/** 
* Affichage d'un tableau a 1 dimention de float
*
* @param tab : Un tableau a une dimention
*/
public static void affichageTableauFloatD1(float [] tab){
	float i; 
	for (i = 0 ; i < tab.length ; i++){
		System.out.println((i+1) + " : " + tab[i]);
	}
}

/** 
* Affichage d'un tableau a 2 dimention de float
*
* @param tab : Un tableau a deux dimention
*/
public static void affichageTableauFloatD2(float [] tab){
	float i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++){
		System.out.print(tab[j] + " ");
		System.out.println((i+1) + " : " + tab[i]);
		}
	}
}

/** 
* Affichage d'un tableau a 1 dimention de boolean
*
* @param tab : Un tableau a deux dimention
*/
public static void affichageTableauFloatD1(boolean [] tab){
	boolean i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++){
		System.out.println((i+1) + " : " + tab[i]);
		}
	}
}

/** 
* Affichage d'un tableau a 2 dimention de boolean
*
* @param tab : Un tableau a deux dimention
*/
public static void affichageTableauFloatD2(boolean [] tab){
	boolean i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++){
		System.out.print(tab[j] + " ");
		System.out.println((i+1) + " : " + tab[i]);
		}
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