package cat.institutmvm.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Employee implements Comparable<Employee>{
    //<editor-fold defaultstate="collapsed" desc="Atributs (Estat)">
    private String code;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private double monthlySalary;
    private int payments;
    
    public static final int DEFAULT_PAYMENTS = 14;
    public static final double DEFAULT_SALARY = 1_800;
    private static int counter = 0;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Mètodes (Comportament)">
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">

    public Employee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, double monthlySalary, int payments) {
        //----------->[]code:null | firstname:null | lastname:null | birthDate:null | hireDate:null | monthlySalary:0  | payments:0
        counter++;
        this.setCode(code);
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setBirthDate(birthDate);
        this.setHireDate(hireDate);
        this.setMonthlySalary(monthlySalary);
        this.setPayments(payments);
    }
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, double monthlySalary) {
        //----------->[]code:null | firstname:null | lastname:null | birthDate:null | hireDate:null | monthlySalary:0  | payments:0
        this(code, firstname, lastname, birthDate, hireDate, monthlySalary, DEFAULT_PAYMENTS);
    }
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate, double monthlySalary, int payments) {
        //----------->[]code:null | firstname:null | lastname:null | birthDate:null | hireDate:null | monthlySalary:0  | payments:0
        this(code, firstname, lastname, birthDate, LocalDate.now(), monthlySalary, payments);
    }
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate,double monthlySalary) {
        //----------->[]code:null | firstname:null | lastname:null | birthDate:null | hireDate:null | monthlySalary:0  | payments:0
        this(code, firstname, lastname, birthDate, LocalDate.now(), monthlySalary, DEFAULT_PAYMENTS);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
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
    
    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    public LocalDate getHireDate() {
        return hireDate;
    }
    
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    
    public double getMonthlySalary() {
        return monthlySalary;
    }
    
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    public int getPayments() {
        return payments;
    }
    
    public void setPayments(int payments) {
        this.payments = payments;
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes (Comportament)">
    
    public String getFullName() {
        return String.format("%s %s", this.getFirstname(), this.getLastname());
    }
    
    public String getReverseName() {
        return String.format("%s, %s", this.getLastname(), this.getFirstname());
    }
    
    public int getAge() {
        var period = Period.between(this.getBirthDate(), LocalDate.now());
        return period.getYears();
    }
    
    public long getSeniority() {
        return ChronoUnit.DAYS.between(this.getHireDate(), LocalDate.now());
    }
    
    public double getAnnualSalary() {
        return this.getMonthlySalary() * this.getPayments();
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Overrides: Sobreescriptura de mètodes">
    @Override    
    public String toString() {
        var sb = new StringBuilder();
        sb.append("----------------------------------------------------\n");
        sb.append("   E M P L O Y E E                                  \n");
        sb.append("----------------------------------------------------\n");
        sb.append(String.format(">Code:          %s %n", this.getCode()));
        sb.append(String.format(">Firstname:     %s %n", this.getFirstname()));
        sb.append(String.format(">Lastname:      %s %n", this.getLastname()));
        sb.append(String.format(">FullName:      %s %n", this.getFullName()));
        sb.append(String.format(">ReverseName:   %s %n", this.getReverseName()));
        sb.append(String.format(">Age:           %d years %n", this.getAge()));
        sb.append(String.format(">Seniority:     %d days %n", this.getSeniority()));
        sb.append(String.format(">AnnualSalary:  %.2f € %n", this.getAnnualSalary()));
        return sb.toString();
    }
     @Override
    public int compareTo(Employee e) {
        return this.getLastname().compareToIgnoreCase(e.getLastname());
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes estàtics">
    public static int getCounter() {
        return counter;
    }
    //</editor-fold>  
    //</editor-fold>   
}
