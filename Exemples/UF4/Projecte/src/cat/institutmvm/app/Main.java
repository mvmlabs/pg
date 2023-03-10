package cat.institutmvm.app;

import cat.institutmvm.entities.Bird;
import cat.institutmvm.entities.Cat;
import cat.institutmvm.entities.Student;
import cat.institutmvm.utils.MyMath;
import java.lang.Math;
/**
 *
 * @author raquel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                    
        Cat michi = new Cat("Siamés", 4);
        System.out.println(michi.toString());
        System.out.printf("Michi s'ha mogut %.2f passes\n", michi.move(4));
        
        Bird piolin = new Bird("Canari", 2, true);
        System.out.println(piolin.toString());
        System.out.printf("Piolin s'ha mogut %.2f passes\n", piolin.move(4));
        
        Cat silvestre = new Cat("Europeu", 4);
        System.out.println(silvestre.toString());
        System.out.printf("Silvestre s'ha mogut %.2f passes\n", silvestre.move(10));
    }  
}
