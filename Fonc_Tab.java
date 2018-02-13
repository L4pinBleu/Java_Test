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
        for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab.length; j++) System.out.println(tab[i][j]);
        }
    }

    public static void affichageTab(double[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) System.out.println(tab[i]);
    }

    public static void affichageTab(double[][] tab) {
        int i, j;
        for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab.length; j++) System.out.println(tab[i][j]);
        }
    }

    public static void affichageTab(float[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) System.out.println(tab[i]);
    }

    public static void affichageTab(float[][] tab) {
        int i, j;
        for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab.length; j++) System.out.println(tab[i][j]);
        }
    }

    public static void affichageTab(boolean[] tab) {
        int i;
        for (i = 0; i < tab.length; i++) System.out.println(tab[i]);
    }

    public static void affichageTab(boolean [][] tab){
        int i,j;
        for (i = 0 ; i < tab.length ; i++){
            for (j = 0 ; j < tab.length; j++) System.out.println(tab[i][j]);
        }
    }

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

    public static void initTab(boolean[] tab,double lower, double higher){
        int i;
        for (i = 0 ; i < tab.length ; i++ )
            tab[i] = (Math.random()>higher);
    }

    public static void initTab(int[][] tab,double lower, double higher){
        int i,j;
        for (i = 0 ; i < tab.length ; i++ )
            for (j = 0 ; j < tab.length ; j++)
                tab[i][j] = (int)((Math.random()*(higher-lower))+lower);
    }

    public static void initTab(double[][] tab,double lower, double higher){
        int i,j;
        for (i = 0 ; i < tab.length ; i++ )
            for (j = 0 ; j < tab.length ; j++)
                tab[i][j] = (Math.random() * (higher - lower)) + lower;
    }

    public static void initTab(float[][] tab,double lower, double higher){
        int i,j;
        for (i = 0 ; i < tab.length ; i++ )
            for (j = 0 ; j < tab.length ; j++)
                tab[i][j] = (float)((Math.random()*(higher-lower))+lower);
    }

    public static void initTab(boolean[][] tab,double lower, double higher){
        int i,j;
        for (i = 0 ; i < tab.length ; i++ )
            for (j = 0 ; j < tab.length ; j++)
                tab[i][j] = (Math.random()>lower);
    }

    /*
      Tri Tableau
     */

    /*
      Inverse Valeur Tableau
     */

    /*
      Algorithme de recherche (Notion de cours)
     */

    /*
      Algorithme de tri (Notion de cours)
     */


} //Fin de la classe

