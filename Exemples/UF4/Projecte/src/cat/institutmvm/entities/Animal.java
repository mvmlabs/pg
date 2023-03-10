package cat.institutmvm.entities;

/**
 *
 * @author raquel
 */
public abstract class Animal {
    private String breed;
    private int legs;
    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public abstract void sleep();
}
