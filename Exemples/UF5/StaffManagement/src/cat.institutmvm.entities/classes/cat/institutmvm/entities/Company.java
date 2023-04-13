package cat.institutmvm.entities;

public class Company {
    private String companyName;
    private Employee empl;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Company(String companyName, Employee empl) {
        this.setCompanyName(companyName);
        this.setEmpl(empl);
    }

    public Employee getEmpl() {
        return this.empl;
    }

    public void setEmpl(Employee empl) {
        this.empl = empl;
    }

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
    
    
}
