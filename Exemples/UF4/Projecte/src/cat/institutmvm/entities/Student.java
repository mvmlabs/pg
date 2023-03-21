package cat.institutmvm.entities;

import cat.institutmvm.utils.MyMath;

/**
 *
 * @author raquel
 */
public class Student extends Person {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private String ccff;
    private int codiAlumne;
    public static int count;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String getCCFF(){
        return this.ccff;
    }
    
    public void setCCFF(String ccff){
        this.ccff = ccff;
    }
    
    public int getCodiAlumne(){
        return this.codiAlumne;
    }
    
    //</editor-fold>
    
    public int getCount(){
        return count;
    }
    
    public void setCodiAlumne(int codiAlumne){
        this.codiAlumne = codiAlumne;
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
    
    public int generateCodiAlumne(int maxCodi){
        return MyMath.nextInt(maxCodi);
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
