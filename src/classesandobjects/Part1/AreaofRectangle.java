package classesandobjects.Part1;
import java.util.Scanner;
class Rectangle{
    int l,b;
    public Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    public double area(){
        return(l*b);
    }
}

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Rectangle r = new Rectangle(l,b);
        System.out.println( r.area());
    }
}
