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
    //Une "chose" à faire donc pas besoin de { }
//Même chose
    return a > b;
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
    return a > b;
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
    return a > b;
}
/* -------------------------------------------------------------------------------------- */
//Type Agrege

static class coordPoint {
	double x = 0,
  y = 0,
  z = 0;
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
		tab[i] = ( (int) (Math.random( ) * (higher - lower)) +lower ); //Tire un nombre aleatoire entre lower et higher
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
		tab[i] = ( Math.random( ) * (higher - lower) +lower );
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
			tab[i][j] = ( Math.random( ) * (higher - lower) +lower );
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
		tab[i].x = ( Math.random() *(50-25) ) +25;
		tab[i].y = ( Math.random() *(50-25) ) +25;
		tab[i].z = ( Math.random() *(50-25) ) +25;

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
			tab[i][j].x = ( Math.random() *(50-25) ) +25;
			tab[i][j].y = ( Math.random() *(50-25) ) +25;
			tab[i][j].z = ( Math.random() *(50-25) ) +25;
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
/**
* Tri d'un tableau a une dimention
*
* @param tab : Tableau d entier
* @return tabt : Un tableau triée (croissant)
*/
public static int [] triTableauD1 (int [] tab){
/* Initialisation des variables */
	int [] tabt = new int [tab.length];
	int i, j, compteur = 0;
	/* Boucle de parcours de tableau */
	for (j = 0 ; j < tab.length ; j++){ //Parcours du tableau retour
		for (i = 0 ; i < tab.length ; i++){ //Parcours du tableau d'entrée
			/* Quand j = 0 */
			if (j == 0) {
				if (tab[i] > tabt[j]){
					tabt[j] = tab[i]; //Ajout au tableau triée de la valeur
					compteur = 0; //Ajout d'une nouvelle valeur donc réinitialisation
				}
				if (tab[i] == tabt[j]){
					compteur += 1; //Même valeur donc on compte +1
					tabt[j] = tab[i]; //Puis ajout de la valeur
				}
			}
			/* Quand j > 1 */
			if  (j >= 1){
				if ( (tab[i] > tabt[j])&& (tab[i] < tabt[j-1]) ){
					tabt[j] = tab[i];
					compteur = 0;
				}
				if (tab[i] == tabt[j]){
					compteur += 1;
					tabt[j] = tab[i];
				}
			}
		}
		/* Vérifie si compteur et bien supérieur à 1 */
		if (compteur > 1){
			/* Ajout n fois le nombre de fois le nombre */
			for (compteur = compteur-1 ; compteur > 0 ; compteur--){
				if (j < tab.length-2){
					tabt[j+1] = tabt[j];
					j+=1; //Incrémentation de 1 pour ne pas dépaser le tableau
				}
			}
		}
	}
	return tabt; //Retourne le tableau : ATTENTION ERREUR QUAND O UNIQUE !
}

/**
* Inverse les valeurs d'un tableau
*
* @param tab : Un Tableau d'entier a une dimention
* @return tabr : Un Tableau d'entier a une dimention
*/
public static int [] invTableauD1(int [] tab) {
	/*  Initialisation des variables */
	int i;
	int [] tabr = new int [tab.length];
	for (i = 0 ; i < tab.length ; i++){
		tabr[(tab.length-1)-i] = tab[i];
	}
	return tabr;
}

/* Main of file */
	public static void main(String[] args) {
		int [] tab = new int [50];
		initTableauD1(tab);
		affichageTableauD1(tab);
	}
}
