package cat.institutmvm.entities;

/**
 *
 * @author Raquel
 * @version 1.0 
 */
public abstract class Person {
    private String name, surname;
    public static int cont;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public Person(String name, String surname){
        this.setName(name);
        this.setSurname(surname);
        cont++;
    } 
    
    public abstract void learn();
    
    public String toText(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.getName());
        sb.append(" i ");
        sb.append(this.getSurname());
        return sb.toString();
    }
}
