package cat.institutmvm.app;

import cat.institutmvm.entities.Person;
import cat.institutmvm.entities.Student;
import cat.institutmvm.entities.Teacher;
import cat.institutmvm.utils.MyMath;

/**
 *
 * @author Raquel
 * @version 1.0 
 */
public class Main {
    public static void main(String[] args) {
        //Instància d'estudiants
        Student p1 = new Student("Alume", "un", "ASIX");
        Student p2 = new Student("Alumne", "dos", "DAW");
        System.out.println("Total de persones: " + Person.cont);
        Student p3 = new Student ("Alumne", "tres", "SMX");
        System.out.println(p3.toText());
        System.out.println("Total de persones: " + Person.cont);
        
        //Instància de docents
        Teacher t1 = new Teacher("Raquel", "Alamán", "PG");
        Teacher t2 = new Teacher("Irene", "Vergara", "FOL");
        
        System.out.println(t1.toText());
        System.out.println(t2.toText());
        
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.max(1,10));
        System.out.println(Math.min(1,10));
        
        System.out.println(MyMath.E);
        System.out.println(MyMath.PI);
        System.out.println(MyMath.PHI);
        
        System.out.println("MyMath.isEven(6): " + MyMath.isEven(6));
        System.out.println("MyMath.isEven(7): " + MyMath.isEven(7));
        System.out.println("MyMath.isEven(8): " + MyMath.isEven(8));

        System.out.println("MyMath.isOdd(6): " + MyMath.isOdd(6));
        System.out.println("MyMath.isOdd(7): " + MyMath.isOdd(7));
        System.out.println("MyMath.isOdd(8): " + MyMath.isOdd(8));
        
        System.out.println("MyMath.abs(-4): " + MyMath.abs(-4));
        System.out.println("MyMath.abs(7): " + MyMath.abs(7));
        

        System.out.println("MyMath.max(5,8): " + MyMath.max(5,8));
        System.out.println("MyMath.min(7,3): " + MyMath.min(7,3));
        System.out.println("MyMath.max(5,8,1,34,43,1001,10): " + MyMath.max(5,8,1,34,43,1001,10));
        System.out.println("MyMath.min(7,3,-1,-14): " + MyMath.min(7,3,-1,-14));
        
        System.out.println("MyMath.avg(5,10): " + MyMath.average(5,10));
        System.out.println("MyMath.avg(5,7,8,4,3,4.5,1.5,10): " + MyMath.average(5,7,8,4,3,4.5,1.5,10));
    }   
}
