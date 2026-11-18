package examan2014;

public class Attraction {
	  	private String nom;
	    private double cout;
	    private ConditionAge condition;
	    private int nbPersonnes;
	    private double recette;

	    public Attraction(String nom, double cout, ConditionAge condition) {
	        this.nom = nom;
	        this.cout = cout;
	        this.condition = condition;
	        this.nbPersonnes = 0;
	        this.recette = 0;
	    }
	    public void affiche() {
	        System.out.println("Nom :" + nom);
	        System.out.println("Cout :" + cout);
	        System.out.println("Nombre de personnes :" + nbPersonnes);
	        System.out.println("Recette :" + recette);
	    }
	    public String getNom() {
	        return nom;
	    }

	    public double getRecette() {
	        return recette;
	    }

	    public ConditionAge getCondition() {
	        return condition;
	    }
	    public void utilise(Personne p) {
	    	if (condition.accesPossible(p)) {
	            nbPersonnes++;
	            recette = recette + cout;
	        } else {
	            System.out.println("Acces interdit !");
	        }
	    	
	    }

}
