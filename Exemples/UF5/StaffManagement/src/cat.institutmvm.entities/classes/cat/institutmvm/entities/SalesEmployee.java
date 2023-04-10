package cat.institutmvm.entities;

import java.time.LocalDate;

public class SalesEmployee extends Employee{
    //<editor-fold defaultstate="collapsed" desc="Atributs (Estat)">
    private double commission;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, double monthlySalary, int payments, double commission) {
        //------------->[]SalesEmployee :>Inicializar su estado
        super(code, firstname, lastname, birthDate, hireDate, monthlySalary, payments);
        this.setCommission(commission);
    }

    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, double monthlySalary, double commission) {
        this(code, firstname, lastname, birthDate, hireDate, monthlySalary, DEFAULT_PAYMENTS, commission);
    }
    
    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate, double monthlySalary, int payments, double commission) {
        this(code, firstname, lastname, birthDate, LocalDate.now(), monthlySalary, payments, commission);
    }
    
    public SalesEmployee(String code, String firstname, String lastname, LocalDate birthDate, double monthlySalary, double commission) {
        this(code, firstname, lastname, birthDate, LocalDate.now(), monthlySalary, DEFAULT_PAYMENTS, commission);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getCommission() {
        return this.commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Overrides: Sobreescriptura de mètodes">
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + this.getCommission();
    }

    @Override
    public String toString() {
        var sb = new StringBuilder(super.toString());
        sb.append(String.format(">Commission:     %.2f € %n", this.getCommission()));
        return sb.toString();
    }
    
    //</editor-fold>
    
    //</editor-fold>
}
