package examan2014;

public class ParcAttraction {
		private String nom;
	    private Attraction[] lesAttractions;
	    private int nb_attraction;
	    private int taille;

	    public ParcAttraction(String nom, int taille) {
	        this.nom = nom;
	        this.taille = taille;
	        lesAttractions = new Attraction[taille];
	        nb_attraction = 0;
	    }

	    public void ajouteAttraction(Attraction a) {

	        if (nb_attraction < taille) {
	            lesAttractions[nb_attraction] = a;
	            nb_attraction++;
	        } else {
	            System.out.println("Parc complet");
	        }
	    }

	    public float getRecette() {

	        float somme = 0;

	        for (int i = 0; i < nb_attraction; i++) {
	            somme += lesAttractions[i].getRecette();
	        }

	        return somme;
	    }

	    public void affiche() {

	        System.out.println("Nom du parc :" + nom);

	        for (int i = 0; i < nb_attraction; i++) {

	            System.out.println("Attraction :"
	                    + lesAttractions[i].getNom());

	            System.out.println("Age minimum :"
	                    + lesAttractions[i].getCondition().getAgeMin());

	            System.out.println("Recette :"
	                    + lesAttractions[i].getRecette());
	        }
	    }

}
