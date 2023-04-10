package cat.institutmvm.ui;

import cat.institutmvm.entities.Employee;
import cat.institutmvm.entities.SalesEmployee;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args){
        Employee empleat  = new Employee("E001", "Miquel", "Garcia", 
            LocalDate.of(1980, Month.OCTOBER, 23), 
            LocalDate.of(2003, Month.OCTOBER, 3), 1800, 14);
        System.out.println(empleat.toString());
        
        SalesEmployee empleatVendes  = new SalesEmployee("SE001", "Anna", "Marcos", 
            LocalDate.of(1996, Month.APRIL, 15), 
            LocalDate.of(2008, Month.MAY, 3), 1800, 14);
        System.out.println(empleatVendes.toString());
    }
}
