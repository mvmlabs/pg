package cat.institutmvm.entities;

/**
 *
 * @author reychy
 */
public class Student extends Person{
    public String cicle;
    
    public Student(String name, String surname, String cicle){
        super(name, surname);
        this.setCicle(cicle);
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }
    
    public void learn(){
        System.out.println("CFGS");
    }
}
