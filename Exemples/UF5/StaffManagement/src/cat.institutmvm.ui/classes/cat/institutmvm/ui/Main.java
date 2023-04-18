package cat.institutmvm.ui;

import cat.institutmvm.entities.BasicLoveCalculator;
import cat.institutmvm.entities.Company;
import cat.institutmvm.entities.Employee;
import cat.institutmvm.entities.Employee.Gender;
import cat.institutmvm.entities.RandomLoveCalculator;
import cat.institutmvm.entities.SalesEmployee;
import cat.institutmvm.contracts.LoveCalculator;
import cat.institutmvm.entities.Player;
import cat.institutmvm.entities.Space;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args){        
        /********************** Generic types *********************************/
        Space<Integer> spaceInt = new Space<Integer>(0,0,1920,1280);
        Space<Double> spaceDoub = new Space<Double>(0.0,0.0,50.0,75.5);
        System.out.println(spaceInt);
        System.out.println(spaceDoub);        
        System.out.println("**************************************************");
        
        /********** Classes anònimes (implementació no funcional) *************/        
        var lc1 = new RandomLoveCalculator();
        System.out.println(lc1.getCompatibilityBetween("Josep", "Maria"));
        
        var lc2 = new BasicLoveCalculator();
        System.out.println(lc2.getCompatibilityBetween("Josep", "Maria"));
        
        //classe anònima
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

                return (sum1 <= sum2) ? (int)((sum1/sum2) * LoveCalculator.MAX_VALUE) 
                        : (int)((sum2/sum1) * LoveCalculator.MAX_VALUE);
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

                return (sum1 <= sum2) ? (int)((sum1/sum2) * LoveCalculator.MAX_VALUE) 
                        : (int)((sum2/sum1) * LoveCalculator.MAX_VALUE);
        };
                
        System.out.println(lc4.getCompatibilityBetween("Josep", "Maria"));
        System.out.println("**************************************************");
        /********************** String i utils ********************************/
        String[] aNames = {"Miquel", "Anna", "Ona", "Joan", "Patrícia", "Lluïsa"};
        Arrays.sort(aNames);
        System.out.println(Arrays.toString(aNames));
        
        //classe anònima, compara per mida dels dos elements
        Arrays.sort(aNames, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        
        });
        //lambda expression
        Arrays.sort(aNames, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(aNames));
        
        
        
        List<String> lNames = Arrays.asList("Miquel", "Anna", "Ona", "Joan", "Patrícia", "Lluïsa");
        System.out.println(lNames.toString());
        //classe anònima, compara per mida dels dos elements
        Collections.sort(lNames, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        
        });
        //lambda expression
        Collections.sort(lNames, (o1, o2) -> o1.length() - o2.length());
        System.out.println(lNames.toString());
        
        //recorre els elements de la collection
        lNames.forEach(new Consumer<String>(){
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        lNames.forEach( t -> System.out.println(t)); //lambda expression
        lNames.forEach(System.out::println); //method reference
        
        //reemplaça cada element d'una collection
        lNames.replaceAll(new UnaryOperator<String>(){
            @Override
            public String apply(String t) {
                return t.toUpperCase();
            }
        });
        lNames.replaceAll( t -> t.toUpperCase()); //lambda expression
        lNames.replaceAll(String::toUpperCase); //method reference
        lNames.forEach(System.out::println); //method reference
        
        //elimina els elements que compleixen la condició
        //donarà error perquè és una collection lligada a un Array
        lNames.removeIf(new Predicate<String>(){
            @Override
            public boolean test(String t) {
                return t.length() <= 3;
            }
        });
        lNames.removeIf( t -> t.length() <= 3);
        
        List<String> cNames = new ArrayList<>(Arrays.asList("Miquel", "Anna", "Ona", "Joan", "Patrícia", "Lluïsa"));
        cNames.removeIf(new Predicate<String>(){
            @Override
            public boolean test(String t) {
                return t.length() <= 3;
            }
        });
        cNames.removeIf( t -> t.length() <= 3);
        cNames.forEach(System.out::println); //method reference
        
        /********************** Streams ***************************************/
        System.out.println("*****************************************************");
        cNames.stream().filter(new Predicate<String>(){
                                @Override
                                public boolean test(String t) {
                                    return t.length() > 3;
                                }
                            })
                        .forEach(new Consumer<String>(){
                            @Override
                            public void accept(String t) {
                                System.out.println(t);
                            }
                        });
        cNames.stream().filter(t -> t.length() <= 3)
                       .forEach(System.out::println);
        /********************** Instàncies ************************************/
        Employee empleat  = new Employee("E001", "Miquel", "Garcia",Gender.MALE, 
            LocalDate.of(1980, Month.APRIL, 23), 
            LocalDate.of(2003, Month.OCTOBER, 3), 1800, 14);
        System.out.println(empleat.toString());
        
        SalesEmployee empleatVendes  = new SalesEmployee("SE001", "Anna", "Marcos", 
                Gender.MALE, LocalDate.of(1996, Month.APRIL, 15), 
                LocalDate.of(2008, Month.MAY, 3), 1800, 14);
        System.out.println(empleatVendes.toString());
        
        Company empresa = new Company("Vass", new Employee("E001", "Miquel", 
                    "Garcia", Gender.MALE,
                    LocalDate.of(1980, Month.OCTOBER, 23),
                    LocalDate.of(2003, Month.OCTOBER, 3), 
                    1800, 14));
        System.out.println(empresa.toString());
        
        System.out.println("**************************************************");
        
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
        System.out.println("**************************************************");
        
        List<Employee> empleats = new ArrayList<>();
        empleats.add(new Employee("E001", "Miquel", "Garcia",Gender.MALE,LocalDate.of(1980, Month.OCTOBER, 23),LocalDate.of(2003, Month.OCTOBER, 3), 1800, 14));
        empleats.add(new Employee("E002", "Maria", "Sanchez", Gender.FEMALE,LocalDate.of(1985, Month.MARCH, 13), LocalDate.of(2002, Month.JANUARY, 13), 1900));
        empleats.add(new Employee("E003", "Agustin", "de Lucia", Gender.MALE, LocalDate.of(1995, Month.MARCH, 13), 1600, 12));
        empleats.add(new Employee("E004", "Adrián", "Chamorro", Gender.MALE, LocalDate.of(1998, Month.NOVEMBER, 13), 1700));
        Collections.sort(empleats); //helper per a col·leccions
        System.out.println(empleats.toString()); 
        
        //Streams
        System.out.println("********** STREAMS *******************************");
        empleats.stream().filter(e -> e.getAge() > 30)
                         .filter(e -> e.getAnnualSalary() > 20000)
                         .map( e -> e.getCode())
                         .sorted()
                         .forEach(System.out::println);
        
        var count = empleats.stream().filter(e -> e.getAge() > 30)
                         .filter(e -> e.getAnnualSalary() > 20000)
                         .map( e -> e.getCode())
                         .sorted()
                         .count();
        System.out.println(count);
        
        System.out.println("********** Players *******************************");
        List<Player> players = new ArrayList<>();
        players.add(new Player("Maria", "Delgado", 1.98, 85, 20000, LocalDate.of(1985, Month.MARCH, 23)));
        players.add(new Player("Sergio", "Garcia", 1.50, 91, 40000, LocalDate.of(1992, Month.APRIL, 3)));
        players.add(new Player("Pedro", "Sanchez", 1.80, 91, 32000, LocalDate.of(1985, Month.AUGUST, 21)));
        players.add(new Player("Mariano", "Aznar", 1.85, 92, 16000, LocalDate.of(1991, Month.NOVEMBER, 15)));
        players.add(new Player("Laura", "Madrid", 1.75, 75, 35000, LocalDate.of(1985, Month.DECEMBER, 10)));
        players.add(new Player("Vanessa", "Romero", 1.92, 80, 28500, LocalDate.of(1995, Month.SEPTEMBER, 5)));
        players.add(new Player("Jesus", "Quintero", 1.91, 85, 21000, LocalDate.of(1985, Month.OCTOBER, 5)));
        players.add(new Player("Alba", "Garcia", 1.91, 85, 21000, LocalDate.of(1974, Month.JANUARY, 9)));
        System.out.println(players.toString()); 
        
        System.out.printf("%nInfo sobre l'edat dels jugadors:%n");
        System.out.printf("------------------------------------------%n");
        double avgAge = players.stream()
                              .mapToInt(e -> e.getAge())
                              .average()
                              .getAsDouble();
        int maxAge = players.stream()
                              .mapToInt(e -> e.getAge())
                              .max()
                              .getAsInt();
        int minAge = players.stream()
                              .mapToInt(e -> e.getAge())
                              .min()
                              .getAsInt();       
    }
}
