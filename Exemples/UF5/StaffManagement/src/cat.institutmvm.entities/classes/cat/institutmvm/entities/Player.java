package cat.institutmvm.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Player  {

    //<editor-fold defaultstate="collapsed" desc="Atributs (Estat)">
    private String firstname;
    private String lastname;
    private double height;
    private int weight;
    private int salary;
    private LocalDate birthDate;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes (Comportament)">
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Player(String firstname, String lastname, double height, int weight, int salary, LocalDate birthDate) {    
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setHeight(height);
        this.setWeight(weight);
        this.setSalary(salary);
        this.setBirthDate(birthDate);
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0.0) {
            throw new IllegalArgumentException("El valor de altura no puede ser negativo");
        }
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (height <= 0) {
            throw new IllegalArgumentException("El valor de peso no puede ser negativo");
        }
        this.weight = weight;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("El valor de salario no puede ser negativo");
        }
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null) {
            throw new NullPointerException("Es obligatorio indicar la fecha de nacimiento");
        }
        this.birthDate = birthDate;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="API pública">
    public int getAge() {
        return Period.between(this.getBirthDate(), LocalDate.now()).getYears();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Overrides: Sobreescriptura de mètodes">
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("------------------------------%n"));
        sb.append(String.format("   J U G A D O R %n"));
        sb.append(String.format("------------------------------%n"));
        sb.append(String.format("- Nom: %s %n", this.getFirstname()));
        sb.append(String.format("- Cognoms: %s %n", this.getLastname()));
        sb.append(String.format("- Salari: %d %n", this.getSalary()));
        sb.append(String.format("- Alçada: %.2f m %n", this.getHeight()));
        sb.append(String.format("- Pes: %d Kg %n", this.getWeight()));
        sb.append(String.format("- Data de naixement: %s %n", DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this.getBirthDate())));
        sb.append(String.format("- Edat: %d %n", this.getAge()));
        
        return sb.toString();
    }
    //</editor-fold>
    
    //</editor-fold>

}
