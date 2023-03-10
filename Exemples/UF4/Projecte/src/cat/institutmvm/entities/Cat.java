package cat.institutmvm.entities;

/**
 *
 * @author raquel
 */
public class Cat extends Animal implements Pet{

    @Override
    public void sleep() {
        System.out.println("Mimimimimi");
    }

    @Override
    public double move(int step) {
        return step*2;
    }

    public Cat(String breed, int legs) {
        this.setBreed(breed);
        this.setLegs(legs);
    }    
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("******* Dades del gat *******");
        sb.append("\n");
        sb.append("Raça: ");
        sb.append(this.getBreed());
        sb.append("\n");
        sb.append("Nombre de potes: ");
        sb.append(this.getLegs());
        return sb.toString();
    }
}
