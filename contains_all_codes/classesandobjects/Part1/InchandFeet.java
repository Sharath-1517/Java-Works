package classesandobjects.Part1;
import java.util.Scanner;

class Convert{
    Scanner sc  =new Scanner(System.in);
    private double inch,feet;
    public Convert(){
        System.out.println("Enter Inch: ");
        inch = sc.nextDouble();
        System.out.println("Enter Feet: ");
        feet = sc.nextDouble();
    }
    public static void toCalculate(Convert c1,Convert c2){
        System.out.printf("Sum of Inches :%f \nSum of feet :%f",c1.inch+c2.inch,c1.feet+c2.feet);
    }
}

public class InchandFeet {
    public static void main(String[] args) {
        Convert c1 = new Convert();
        Convert c2 = new Convert();
        Convert.toCalculate(c1, c2);
    }
}
