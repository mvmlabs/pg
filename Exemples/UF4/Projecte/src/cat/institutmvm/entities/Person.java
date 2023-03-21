package cat.institutmvm.entities;

/**
 *
 * @author raquel
 * @version 1.0
 */
public abstract class Person {
    //Atributs
    private String name, surname;
    public static int count;
    /**
     * 
     * @return name nom de la instància persona 
     */
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public Person(String name, String surname){
        this.setName(name);
        this.setSurname(surname);
        count++;
    }
    
    public Person(String surname){
        this("Ms",surname);
    }
    
    public Person(){
        this("Raquel", "Alamán");
    }
    
    public abstract String breathe();
    
}
