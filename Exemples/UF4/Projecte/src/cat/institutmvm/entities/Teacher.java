package cat.institutmvm.entities;

/**
 *
 * @author reychy
 */
public class Teacher extends Person{
    public String specialization;
    
    public Teacher(String name, String surname, String specialization){
        super(name, surname);
        this.setSpecialization(specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void learn() {
        System.out.println("Competència digital");
    }
    
}
