/** Program of Test. 
* @author Nicolas Mor
* @author nicolas.mor@edu.univ-fcomte.fr
* @version 1.0 30/01/2018
* @version 1.1 31/01/2018
*/

/* Name of file */
public class Test_Java {

/* Function/Types Declaration */

/* -------------------------------------------------------------------------------------- */
//Fonction de calcul numérique

/**
* Retourne le plus grand des arguments
* entre a et b de type double.
*
* @param a un double
* @param b un double
* @return Vrai si a>b
*/
public static boolean plusGrand(double a,double b){
	if ( a > b ) return true;
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
public static boolean plusGrand(int a,int b){
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
public static boolean plusGrand(float a,float b){
	if (a>b)return true;
	else return false;
}

/* -------------------------------------------------------------------------------------- */
//Tableau

/** 
* Remplie un tableau de boolean de dimention 1 avec équiprobabilité
* d'un tableau de boolean passer en parametre.
*
* @param tab un tableau de boolean de dimmention 1
*/
public static void initTableauD1(boolean [] tab){
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
public static void initTableauD2(boolean [][] tab) {
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
public static void initTableauD1(int [] tab){
	int i , lower = 0, higher = 101; //Int entre 0 et 100 (101 exclus)
	for (i = 0 ; i < tab.length ; i++ ){
		tab[i] = ( ((int)Math.random() * (higher - lower)) + lower );
	}
}

/** 
* Remplie un tableau de int de dimention 2 avec équiprobabilité
* d'un tableau de int passer en parametre.
*
* @param tab un tableau de int de dimention 2
*/
public static void initTableauD2(int [][] tab) {
	int i,j, lower =0, higher =101; //Int entre 0 et 100 (101 exclus)
	for (i = 0 ; i < tab.length ; i++ ){
		for (j = 0 ; j < tab.length ; j++){
			tab[i][j] = ( (int) (Math.random( ) * (higher - lower)) +lower );
		}
	}
}

/** 
* Remplie un tableau de float de dimention 1 avec équiprobabilité
* d'un tableau de float passer en parametre.
*
* @param tab un tableau de float de dimmention 1
*/
public static void initTableauD1(float [] tab){
	int i, lower = 0, higher = 100;//Float entre 0 et 99.99...
	for (i = 0 ; i < tab.length ; i++ ){
		tab[i] = ( (float) (Math.random( ) * (higher - lower)) +lower );
	}
}

/** 
* Remplie un tableau de float de dimention 2 avec équiprobabilité
* d'un tableau de float passer en parametre.
*
* @param tab un tableau de float de dimention 2
*/
public static void initTableauD2(float [][] tab) {
	int i,j , lower = 0, higher = 100; //Float entre 0 et 99.99...
	for (i = 0 ; i < tab.length ; i++ ){
		for (j = 0 ; j < tab.length ; j++){
			tab[i][j] = ( (float) (Math.random( ) * (higher - lower)) +lower );
		}
	}
}

/** 
* Remplie un tableau de double de dimention 1 avec équiprobabilité
* d'un tableau de double passer en parametre.
*
* @param tab un tableau de double de dimmention 1
*/
public static void initTableauD1(double [] tab){
	int i, lower =0, higher = 100  ; //Double entre 0 et 99.99 ...
	for (i = 0 ; i < tab.length ; i++ ){
		tab[i] = ( (double) (Math.random( ) * (higher - lower)) +lower );
	}
}

/** 
* Remplie un tableau de double de dimention 2 avec équiprobabilité
* d'un tableau de double passer en parametre.
*
* @param tab un tableau de double de dimention 2
*/
public static void initTableauD2(double [][] tab) {
	int i,j, lower =0, higher = 100 ; //Double entre 0 et 99.99 ...
	for (i = 0 ; i < tab.length ; i++ ){
		for (j = 0 ; j < tab.length ; j++){
			tab[i][j] = ( (double) (Math.random( ) * (higher - lower)) +lower );
		}
	}
}

/** 
* Affichage d'un tableau a 1 dimention de double
*
* @param tab : Un tableau a une dimention
*/
public static void affichageTableauD1(double [] tab){
	int i; 
	for (i = 0 ; i < tab.length ; i++){
		System.out.println((i+1) + " : " + tab[i]);
	}
}

/** 
* Affichage d'un tableau a 2 dimention de double
*
* @param tab : Un tableau a deux dimention
*/
public static void affichageTableauD2(double [][] tab){
	int i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++)
		System.out.println("i = " + (i+1) + " //// j =  " + (j+1) + " : " + tab[i][j]);
	}
}

/** 
* Affichage d'un tableau a 1 dimention de int
*
* @param tab : Un tableau a une dimention
*/
public static void affichageTableauD1(int [] tab){
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
public static void affichageTableauD2(int [][] tab){
	int i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++){
		System.out.println("i = " + (i+1) + " //// j =  " + (j+1) + " : " + tab[i][j]);
		}
	}
}

/** 
* Affichage d'un tableau a 1 dimention de float
*
* @param tab : Un tableau a une dimention
*/
public static void affichageTableauD1(float [] tab){
	int i; 
	for (i = 0 ; i < tab.length ; i++){
		System.out.println((i+1) + " : " + tab[i]);
	}
}

/** 
* Affichage d'un tableau a 2 dimention de float
*
* @param tab : Un tableau a deux dimention
*/
public static void affichageTableauD2(float [][] tab){
	int i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++){
		System.out.print(tab[j] + " ");
		System.out.println("i = " + (i+1) + " //// j =  " + (j+1) + " : " + tab[i][j]);
		}
	}
}



/** 
* Affichage d'un tableau a 1 dimention de String
*
* @param tab : Un tableau a une dimention
*/
public static void affichageTableauD1(String [] tab){
	int i; 
	for (i = 0 ; i < tab.length ; i++){
		System.out.println((i+1.0) + " : " + tab[i]);
	}
}

/** 
* Affichage d'un tableau a 2 dimention de String
*
* @param tab : Un tableau a deux dimention
*/
public static void affichageTableauD2(String [][] tab){
	int i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++)
		System.out.println("i = " + (i+1) + " //// j =  " + (j+1) + " : " + tab[i][j]);
	}
}

/** 
* Affichage d'un tableau a 1 dimention de boolean
*
* @param tab : Un tableau a une dimention
*/
public static void affichageTableauD1(boolean [] tab){
	int i; 
	for (i = 0 ; i < tab.length ; i++){
		System.out.println((i+1.0) + " : " + tab[i]);
	}
}

/** 
* Affichage d'un tableau a 2 dimention de boolean
*
* @param tab : Un tableau a deux dimention
*/
public static void affichageTableauD2(boolean [][] tab){
	int i,j; 
	for (i = 0 ; i < tab.length ; i++){
		for (j = 0 ; j < tab.length ; j++)
		System.out.println("i = " + (i+1) + " //// j =  " + (j+1) + " : " + tab[i][j]);
	}
}



/* Main of file */
	public static void main(String[] args) {
		//Variables locales
		final int TAILLE = 2;
		int [][] tab = new int [TAILLE][TAILLE];  //Création tableau de boolean à une dimention
		int i;                                 //Initialisation de la variable
		//Execution du programme
		initTableauD2(tab);
		affichageTableauD2(tab);

	}
}