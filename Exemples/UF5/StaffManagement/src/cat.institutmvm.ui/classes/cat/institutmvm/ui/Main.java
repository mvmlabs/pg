package cat.institutmvm.ui;

import cat.institutmvm.entities.BasicLoveCalculator;
import cat.institutmvm.entities.Company;
import cat.institutmvm.entities.Employee;
import cat.institutmvm.entities.Employee.Gender;
import cat.institutmvm.entities.RandomLoveCalculator;
import cat.institutmvm.entities.SalesEmployee;
import cat.institutmvm.contracts.LoveCalculator;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Employee empleat  = new Employee("E001", "Miquel", "Garcia",Gender.MALE, 
            LocalDate.of(1980, Month.APRIL, 23), 
            LocalDate.of(2003, Month.OCTOBER, 3), 1800, 14);
        System.out.println(empleat.toString());
        
        SalesEmployee empleatVendes  = new SalesEmployee("SE001", "Anna", "Marcos", Gender.MALE,
            LocalDate.of(1996, Month.APRIL, 15), 
            LocalDate.of(2008, Month.MAY, 3), 1800, 14);
        System.out.println(empleatVendes.toString());
        
        System.out.println("*********************************************************************");
        
        Employee[] aEmployees = {
            new Employee("E001", "Miquel", "Garcia",Gender.MALE,
                    LocalDate.of(1980, Month.OCTOBER, 23),
                    LocalDate.of(2003, Month.OCTOBER, 3), 
                    1800, 14),
            new Employee("E002", "Maria", "Sanchez", Gender.FEMALE,
                    LocalDate.of(1985, Month.MARCH, 13), 
                    LocalDate.of(2002, Month.JANUARY, 13),
                    1900),
            new Employee("E003", "Agustin", "de Lucia", Gender.MALE,
                    LocalDate.of(1995, Month.MARCH, 13), 
                    1600, 12),
            new Employee("E004", "Adrián", "Chamorro", Gender.MALE,
                    LocalDate.of(1998, Month.NOVEMBER, 13), 
                    1700)
        };
               
        Arrays.sort(aEmployees);
               
        System.out.println(Arrays.toString(aEmployees));     
        System.out.println("*********************************************************************");
        
        List<Employee> empleats = new ArrayList<>();
        empleats.add(new Employee("E001", "Miquel", "Garcia",Gender.MALE,LocalDate.of(1980, Month.OCTOBER, 23),LocalDate.of(2003, Month.OCTOBER, 3), 1800, 14));
        empleats.add(new Employee("E002", "Maria", "Sanchez", Gender.FEMALE,LocalDate.of(1985, Month.MARCH, 13), LocalDate.of(2002, Month.JANUARY, 13), 1900));
        empleats.add(new Employee("E003", "Agustin", "de Lucia", Gender.MALE, LocalDate.of(1995, Month.MARCH, 13), 1600, 12));
        empleats.add(new Employee("E004", "Adrián", "Chamorro", Gender.MALE, LocalDate.of(1998, Month.NOVEMBER, 13), 1700));
        Collections.sort(empleats); //helper per a col·leccions
        System.out.println(empleats.toString());
        
        Company empresa = new Company("Vass", new Employee("E001", "Miquel", "Garcia",Gender.MALE,
                    LocalDate.of(1980, Month.OCTOBER, 23),
                    LocalDate.of(2003, Month.OCTOBER, 3), 
                    1800, 14));
        System.out.println(empresa.toString());
        
        var lc1 = new RandomLoveCalculator();
        System.out.println(lc1.getCompatibilityBetween("Josep", "Maria"));
        
        var lc2 = new BasicLoveCalculator();
        System.out.println(lc2.getCompatibilityBetween("Josep", "Maria"));
        
        //classes anònimes
        var lc3 = new LoveCalculator(){
            @Override
            public int getCompatibilityBetween(String name1, String name2) {
                var sum1 = 0.0;
                for(char c : name1.toCharArray()){
                    sum1 += (int)c;
                }

                var sum2 = 0.0;
                for(char c : name2.toCharArray()){
                    sum2 += (int)c;
                }

                return (sum1 <= sum2) ? (int)((sum1/sum2) * LoveCalculator.MAX_VALUE) : (int)((sum2/sum1) * LoveCalculator.MAX_VALUE);
            }
        };
        System.out.println(lc3.getCompatibilityBetween("Josep", "Maria"));
        
        LoveCalculator lc4 = (String name1, String name2) -> {
        
            var sum1 = 0.0;
                for(char c : name1.toCharArray()){
                    sum1 += (int)c;
                }

                var sum2 = 0.0;
                for(char c : name2.toCharArray()){
                    sum2 += (int)c;
                }

                return (sum1 <= sum2) ? (int)((sum1/sum2) * LoveCalculator.MAX_VALUE) : (int)((sum2/sum1) * LoveCalculator.MAX_VALUE);
        };
                
        System.out.println(lc4.getCompatibilityBetween("Josep", "Maria"));
    }
}
