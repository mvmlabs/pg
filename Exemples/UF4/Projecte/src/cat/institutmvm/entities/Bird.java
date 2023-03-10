package cat.institutmvm.entities;

/**
 *
 * @author raquel
 */
public class Bird extends Animal implements Pet{
    private boolean hasWings;

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }
    
    public Bird(String breed, int legs, boolean hasWings) {
        this.setBreed(breed);
        this.setLegs(legs);
        this.setHasWings(hasWings);
        
    } 
    
    @Override
    public void sleep() {
        System.out.println("Zzzzzz");
    }

    @Override
    public double move(int step) {
        return (step/2)*0.33;
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("******* Dades de l'ocell *******");
        sb.append("\n");
        sb.append("Raça: ");
        sb.append(this.getBreed());
        sb.append("\n");
        sb.append("Nombre de potes: ");
        sb.append(this.getLegs());
        sb.append("\n");
        sb.append("Té ales: ");
        sb.append((this.isHasWings())? "Sí" : "No");
        return sb.toString();
    }
}
