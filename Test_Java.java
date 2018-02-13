/** Program of Test.
* @author Nicolas Mor
* @author nicolas.mor@edu.univ-fcomte.fr
* @version 1.0 30/01/2018
* @version 1.1 31/01/2018
*/

/* Name of file */
class Test_Java {

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

private static class coordPoint {
	double x = 0,
  y = 0,
  z = 0;
}

    /* -------------------------------------------------------------------------------------- */
//Tableau

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
		int [][] tab = new int [50][50];
		initTableauD2(tab);
		Fonc_Tab.affichageTab(tab);
	}
}
