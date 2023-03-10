package cat.institutmvm.entities;

/**
 *
 * @author raquel
 */
public class Student extends Person {
    private String ccff;
    public static int count;
    
    public String getCCFF(){
        return this.ccff;
    }
    
    public void setCCFF(String ccff){
        this.ccff = ccff;
    }
    
    public Student(String name, String surname, String ccff){
        super(name, surname);
        this.setCCFF(ccff);
        count++;
    }
    
    @Override
    public String breathe(){
        return "Estic respirant!!!";
    }
    
    public String getFullname(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.getName());
        sb.append(" ");
        sb.append(this.getSurname());
        sb.append(" hola");
        return sb.toString();
    }
}
