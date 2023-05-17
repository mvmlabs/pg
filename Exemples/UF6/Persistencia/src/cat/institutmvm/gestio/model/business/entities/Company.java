package cat.institutmvm.gestio.model.business.entities;

public class Company {
    //<editor-fold defaultstate="collapsed" desc="Atributs/Estat">
    private String id;
    private String companyName;
    private Employee empl;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Comportament/Mètodes">
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
     public Company(String companyName, Employee empl) {
        this.setCompanyName(companyName);
        this.setEmpl(empl);
    }
   //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public Employee getEmpl() {
        return this.empl;
    }

    public void setEmpl(Employee empl) {
        this.empl = empl;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Overrides (sobreescriptura de mètodes)">
    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("----------------------------------------------------\n");
        sb.append("   C O M P A N Y                                    \n");
        sb.append("----------------------------------------------------\n");
        sb.append(String.format(">Company name:          %s %n", this.getCompanyName()));
        sb.append(String.format("%s %n", this.getEmpl()));
        return sb.toString();
    }
    //</editor-fold>
    
   //</editor-fold>   
}