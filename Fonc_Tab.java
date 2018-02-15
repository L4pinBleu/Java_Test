/**
 * All Array function
 * @author Nicolas Mor
 * @author nicolas.mor@edu.univ-fcomte.fr
 * @version 1.0 30/01/2018
 * @version 1.1 31/01/2018
 */
class Fonc_Tab {
    /**
     * Affiche le contenu d'un tableau
     *
     * @param tab : Tableau a afficher
     */
    public static void affichageTab(int[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void affichageTab(int[][] tab) {
        int i, j;
        for (i = 0; i < tab.length; i++){
            for (j = 0; j < tab[0].length; j++)
                System.out.print(tab[i][j] + "  ");
            System.out.println("");
        }
    }

    public static void affichageTab(double[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) System.out.println(tab[i]);
    }

    public static void affichageTab(double[][] tab) {
        int i, j;
        for (i = 0; i < tab.length; i++){
            for (j = 0; j < tab[0].length; j++)
                System.out.print(tab[i][j] + "  ");
            System.out.println("");
        }
    }

    public static void affichageTab(float[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) System.out.println(tab[i]);
    }

    public static void affichageTab(float[][] tab) {
        int i, j;
        for (i = 0; i < tab.length; i++){
            for (j = 0; j < tab[0].length; j++)
                System.out.print(tab[i][j] + "  ");
            System.out.println("");
        }
    }

    public static void affichageTab(boolean[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) System.out.println(tab[i]);
    }

    public static void affichageTab(boolean [][] tab){
        int i, j;
        for (i = 0; i < tab.length; i++){
            for (j = 0; j < tab[0].length; j++)
                System.out.print(tab[i][j] + "  ");
            System.out.println("");
        }
    }


    /* ------------------------------------------------------------------------------------------------ */

    /**
     * Initialisation de tableau
     *
     * @param tab : Tableau a remplir
     * @param lower : Plus petite valeur possible
     * @param higher : Plus grande valeur possible (si bool alors Math.random > higher)
     */
    public static void initTab(int[] tab,double lower, double higher){
        int i;
        for (i = 0 ; i < tab.length ; i++ )
            tab[i] = (int)((Math.random()*(higher-lower))+lower);
    }

    public static void initTab(double[] tab,double lower, double higher){
        int i;
        for (i = 0 ; i < tab.length ; i++ )
            tab[i] = (Math.random()*(higher-lower))+lower;
    }

    public static void initTab(float[] tab,double lower, double higher){
        int i;
        for (i = 0 ; i < tab.length ; i++ )
            tab[i] = (float)((Math.random()*(higher-lower))+lower);
    }

    public static void initTab(boolean[] tab, double condition){
        int i,j;
        for (i = 0 ; i < tab.length ; i++ )
            tab[i]= (Math.random() > condition);
    }

    public static void initTab(int[][] tab,double lower, double higher){
        int i,j;
        for (i = 0 ; i < tab.length ; i++ )
            for (j = 0 ; j < tab[0].length ; j++)
                tab[i][j] = (int)((Math.random()*(higher-lower))+lower);
    }

    public static void initTab(double[][] tab,double lower, double higher){
        int i,j;
        for (i = 0 ; i < tab.length ; i++ )
            for (j = 0 ; j < tab[0].length ; j++)
                tab[i][j] = (Math.random() * (higher - lower)) + lower;
    }

    public static void initTab(float[][] tab,double lower, double higher){
        int i,j;
        for (i = 0 ; i < tab.length ; i++ )
            for (j = 0 ; j < tab[0].length ; j++)
                tab[i][j] = (float)((Math.random()*(higher-lower))+lower);
    }

    public static void initTab(boolean[][] tab, double condition){
        int i,j;
        for (i = 0 ; i < tab.length ; i++ )
            for (j = 0 ; j < tab[0].length ; j++)
                tab[i][j] = (Math.random() > condition);
    }

    /* ------------------------------------------------------------------------------------------------ */


    /*
      Tri Tableau TEST
     */

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

    /* ------------------------------------------------------------------------------------------------ */


    /*
      Inverse Valeur Tableau
     */

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

    /* ------------------------------------------------------------------------------------------------ */


    /*
      Algorithme de recherche (Notion de cours)
     */

    /*
      Algorithme de tri (Notion de cours)
     */


} //Fin de la classe

