package cat.institutmvm.ui;

import cat.institutmvm.entities.Employee;
import cat.institutmvm.entities.SalesEmployee;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Employee empleat  = new Employee("E001", "Miquel", "Garcia", 
            LocalDate.of(1980, Month.APRIL, 23), 
            LocalDate.of(2003, Month.OCTOBER, 3), 1800, 14);
        System.out.println(empleat.toString());
        
        SalesEmployee empleatVendes  = new SalesEmployee("SE001", "Anna", "Marcos", 
            LocalDate.of(1996, Month.APRIL, 15), 
            LocalDate.of(2008, Month.MAY, 3), 1800, 14);
        System.out.println(empleatVendes.toString());
        
        System.out.println("*********************************************************************");
        
        Employee[] aEmployees = {
            new Employee("E001", "Miquel", "Garcia",
                    LocalDate.of(1980, Month.OCTOBER, 23),
                    LocalDate.of(2003, Month.OCTOBER, 3), 
                    1800, 14),
            new Employee("E002", "Maria", "Sanchez", 
                    LocalDate.of(1985, Month.MARCH, 13), 
                    LocalDate.of(2002, Month.JANUARY, 13),
                    1900),
            new Employee("E003", "Agustin", "de Lucia", 
                    LocalDate.of(1995, Month.MARCH, 13), 
                    1600, 12),
            new Employee("E004", "Adrián", "Chamorro", 
                    LocalDate.of(1998, Month.NOVEMBER, 13), 
                    1700)
        };
               
        Arrays.sort(aEmployees);
               
        System.out.println(Arrays.toString(aEmployees));     
        System.out.println("*********************************************************************");
        
        ArrayList<Employee> empleats = new ArrayList<>();
        empleats.add(new Employee("E001", "Miquel", "Garcia",LocalDate.of(1980, Month.OCTOBER, 23),LocalDate.of(2003, Month.OCTOBER, 3), 1800, 14));
        empleats.add(new Employee("E002", "Maria", "Sanchez", LocalDate.of(1985, Month.MARCH, 13), LocalDate.of(2002, Month.JANUARY, 13), 1900));
        empleats.add(new Employee("E003", "Agustin", "de Lucia", LocalDate.of(1995, Month.MARCH, 13), 1600, 12));
        empleats.add(new Employee("E004", "Adrián", "Chamorro", LocalDate.of(1998, Month.NOVEMBER, 13), 1700));
        Collections.sort(empleats); //helper per a col·leccions
        System.out.println(empleats.toString());
        
    }
}
