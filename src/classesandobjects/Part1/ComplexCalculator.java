package classesandobjects.Part1;
import java.util.*;

class Complex{
    int real,imaginary;
    public Complex(int r,int i){
        real = r;
        imaginary = i;
    }
    public static Complex add(Complex n1,Complex n2){
        return new Complex((n1.real+n2.real),(n1.imaginary+n2.imaginary));
    }
    public static Complex diff(Complex n1,Complex n2){
        return new Complex((n1.real-n2.real),(n1.imaginary-n2.imaginary));
    }
    public static Complex prod(Complex n1,Complex n2){
        return new Complex((n1.real*n2.real),(n1.imaginary*n2.imaginary));
    }
    public void toPrint(){
        if(real==0 && imaginary!=0) System.out.println(imaginary+"i");
        else if(real!=0 && imaginary==0) System.out.println(real);
        else{
            System.out.printf("%d+%di\n",real,imaginary);
        }
    }
}
public class ComplexCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Real1:");
        int r1 = sc.nextInt();
        System.out.println("Imaginary1:");
        int i1 = sc.nextInt();
        System.out.println("Real2:");
        int r2 = sc.nextInt();
        System.out.println("Imaginary2:");
        int i2 = sc.nextInt();
        sc.close();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex a = Complex.add(c1, c2);
        Complex d = Complex.diff(c1, c2);
        Complex p = Complex.prod(c1, c2);
        a.toPrint();
        d.toPrint();
        p.toPrint();
    }
}
