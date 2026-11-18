package examan2014;

public class ConditionAge implements ConditionAcces{

    private int AgeMin;

    public ConditionAge(int AgeMin) {
        this.AgeMin = AgeMin;
    }

    public boolean accesPossible(Personne p) {
        return p.getAge() > AgeMin;
    }
    public int getAgeMin() {
    	return AgeMin;
    }
    

	

}
