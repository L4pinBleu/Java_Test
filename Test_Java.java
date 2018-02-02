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
	if ( a > b ) return true; //Une "chose" à faire donc pas besoin de { }
	else return false; //Même chose
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
//Type Agrege

static class coordPoint {
	double x = 0, y = 0, z = 0;
};

/* -------------------------------------------------------------------------------------- */
//Tableau

/** 
* Remplie un tableau de boolean de dimention 1 avec équiprobabilité
* d'un tableau de boolean passer en parametre.
*
* @param tab un tableau de boolean de dimmention 1
*/
public static void initTableauD1(boolean [] tab){
	int i; //Initialisation de la variable obligatoire ici
	for ( i = 0 ; i < tab.length ; i++ ){
		tab[i] = (Math.random()<0.5); //Affecte true si condition est validée
	}
}

/** 
* Remplie un tableau de boolean de dimention 2 avec équiprobabilité
* d'un tableau de boolean.
*
* @param tab un tableau de boolean de dimention 2
*/
public static void initTableauD2(boolean [][] tab) {
	int i,j;
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ ){
			tab[i][j] = (Math.random()<0.5);
		}
	}
}

/** 
* Remplie un tableau de int de dimention 1 avec equiprobabilite
* d'un tableau de int passer en parametre.
*
* @param tab un tableau de int de dimmention 1
*/
public static void initTableauD1(int [] tab){
	int i , lower = 0, higher = 101; //Int entre 0 et 100 (101 exclus)
	for ( i = 0 ; i < tab.length ; i++ ){
		tab[i] = ( ((int)Math.random() * (higher - lower)) + lower ); //Tire un nombre aleatoire entre lower et higher
	}
}

/** 
* Remplie un tableau de int de dimention 2 avec equiprobabilite
* d'un tableau de int passer en parametre.
*
* @param tab un tableau de int de dimention 2
*/
public static void initTableauD2(int [][] tab) {
	int i,j, lower = 0, higher = 101; //Int entre 0 et 100 (101 exclus)
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ ){
			tab[i][j] = ( (int) (Math.random( ) * (higher - lower)) +lower );
		}
	}
}

/** 
* Remplie un tableau de float de dimention 1 avec equiprobabilite
* d'un tableau de float passer en parametre.
*
* @param tab un tableau de float de dimmention 1
*/
public static void initTableauD1(float [] tab){
	int i, lower = 0, higher = 100;//Float entre 0 et 99.99...
	for ( i = 0 ; i < tab.length ; i++ ){
		tab[i] = ( (float) (Math.random( ) * (higher - lower)) +lower );
	}
}

/** 
* Remplie un tableau de float de dimention 2 avec equiprobabilite
* d'un tableau de float passer en parametre.
*
* @param tab un tableau de float de dimention 2
*/
public static void initTableauD2(float [][] tab) {
	int i,j , lower = 0, higher = 100; //Float entre 0 et 99.99...
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ ){
			tab[i][j] = ( (float) (Math.random( ) * (higher - lower)) +lower );
		}
	}
}

/** 
* Remplie un tableau de double de dimention 1 avec equiprobabilite
* d'un tableau de double passer en parametre.
*
* @param tab un tableau de double de dimmention 1
*/
public static void initTableauD1(double [] tab){
	int i, lower =0, higher = 100  ; //Double entre 0 et 99.99 ...
	for ( i = 0 ; i < tab.length ; i++ ){
		tab[i] = ( (double) (Math.random( ) * (higher - lower)) +lower );
	}
}

/** 
* Remplie un tableau de double de dimention 2 avec equiprobabilite
* d'un tableau de double passer en parametre.
*
* @param tab un tableau de double de dimention 2
*/
public static void initTableauD2(double [][] tab) {
	int i,j, lower =0, higher = 100 ; //Double entre 0 et 99.99 ...
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ ){
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
	for ( i = 0 ; i < tab.length ; i++ ){
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
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ )
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
	for ( i = 0 ; i < tab.length ; i++ ){
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
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ ){
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
	for ( i = 0 ; i < tab.length ; i++ ){
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
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ ){
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
	for ( i = 0 ; i < tab.length ; i++ ){
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
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ )
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
	for ( i = 0 ; i < tab.length ; i++ ){
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
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ )
		System.out.println("i = " + (i+1) + " //// j =  " + (j+1) + " : " + tab[i][j]);
	}
}

/** 
* Initialisation d'un tableau de Type Agrege de coordonee a une dimention
*
* @param tab : Tableau de type agreger
*/

public static void initTableauD1 (coordPoint [] tab){
	int i;
	for ( i = 0 ; i < tab.length ; i++ ){
		
		tab[i] = new coordPoint();
		tab[i].x = ( (double)Math.random()*(50-25) ) +25;
		tab[i].y = ( (double)Math.random()*(50-25) ) +25;
		tab[i].z = ( (double)Math.random()*(50-25) ) +25;

	}
}

/** 
* Initialisation d'un tableau de Type Agrege de coordonée a deux dimention
*
* @param tab : Tableau de type agreger
*/

public static void initTableauD2 (coordPoint [][] tab){
	int i,j;
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ ){
			tab[i][j] = new coordPoint();
			tab[i][j].x = ( (double)Math.random()*(50-25) ) +25;
			tab[i][j].y = ( (double)Math.random()*(50-25) ) +25;
			tab[i][j].z = ( (double)Math.random()*(50-25) ) +25;
		}
	}
}

/** 
* Affichage d'un tableau de Type agreger de coordonée a une dimention
*
* @param tab : Tableau de type agreger
*/

public static void affichageTableauD1 (coordPoint [] tab){
	int i; 
	for ( i = 0 ; i < tab.length ; i++ ){
		System.out.println((i+1) + " : " + "x = " + tab[i].x + " " + "y = " + " "  + tab[i].y + " z = " + " " + tab[i].z);
	}
}

/** 
* Affichage d'un tableau de Type agreger de coordonée a deux dimentions
*
* @param tab : Tableau de type agreger
*/

public static void affichageTableauD2 (coordPoint [][] tab){
	int i,j; 
	for ( i = 0 ; i < tab.length ; i++ ){
		for ( j = 0 ; j < tab.length ; j++ ){
			System.out.println((i+1) + " // "  + (j+1) + " : "+ "x = " + tab[i][j].x + " " + "y = " + " "  + tab[i][j].y + " z = " + " " + tab[i][j].z);
		}
	}
}

/* Main of file */
	public static void main(String[] args) {
		//Variables locales
		final int TAILLE = 50;
		int [][] tab = new int [TAILLE][TAILLE];  //Creation tableau de boolean à une dimention
		int i;                                 //Initialisation de la variable
		//Execution du programme
		initTableauD2(tab);
		affichageTableauD2(tab);
		coordPoint point = new coordPoint(); //Declaration d'un type agrege
		point.x = 5.0; //Dans type agrege variable x de type double prend la valeur 5.0
		point.y = 4.0;
		point.z = 8.0;
		System.out.println("x : " + point.x);
		System.out.println("y : " + point.y);
		System.out.println("z : " + point.z);
		System.out.println("------------------------------------------------");
		coordPoint [][] tabg = new coordPoint [TAILLE][TAILLE];
		initTableauD2(tabg);
		affichageTableauD2(tabg);
	}
}
