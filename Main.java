package examan2014;

public class Main {
	 public static void main(String[] args) {
		 	Personne p1 = new Personne("maram", 20, 170);
	        Personne p2 = new Personne("ahmed", 10, 140);

	        ConditionAge c1 = new ConditionAge(15);

	        Attraction a1 = new Attraction("Train", 5, c1);

	        ParcAttraction parc = new ParcAttraction("Carthage Land", 10);

	        parc.ajouteAttraction(a1);

	        a1.utilise(p1);
	        a1.utilise(p2);

	        parc.affiche();

	        System.out.println("Recette totale : " + parc.getRecette());
	    }
	 }


