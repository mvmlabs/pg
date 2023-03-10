package cat.institutmvm.utils;

/**
 *
 * @author raquel
 */

//Fully Qualified Class Name: cat.institutmvm.utils.MyMath
public class MyMath {

    //Atributs o camps estàtics
    public static final double PI = 3.14_15_92_65; //java underscores https://docs.oracle.com/javase/7/docs/technotes/guides/language/underscores-literals.html
    public static final double E = 2.71828;
    public static final double PHI = (1 + Math.sqrt(5)) / 2;

    //Constructor
    private MyMath() {}

    //Mètodes o operacions estàtiques
    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public static boolean isOdd(int value) {
        return !isEven(value); //return (value % 2 != 0);
    }

    public static int abs(int value) {
        return (value < 0) ? -value : value;
    }
    
    public static double max(double num1, double num2){
        return (num1>=num2) ? num1 : num2;
    }
    public static double max(double op1, double op2, double... ops) {
        var max = (op1 >= op2) ? op1 : op2;
        for (var op : ops) {
            max = (op >= max) ? op : max;
        }
        return max;
    }

    public static double min(double op1, double op2, double... ops) {
        var min = (op1 <= op2) ? op1 : op2;
        for (var op : ops) {
            min = (op <= min) ? op : min;
        }
        return min;
    }

    public static double average(double op1, double op2, double... ops) {
        var sum = op1 + op2;
        for (var op : ops) {
            sum += op; // sum = sum + op;
        }
        return sum / (ops.length + 2);
    }

}