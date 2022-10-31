package basicmaths;

// import basicmaths.*;
import java.util.*;
abstract class Car{
    abstract void display();
}
class Car1 extends Car{
    void display(){
        System.out.println("Displaying Car 1");
        }
}
class NormalCalc{
    public void display(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        Car c1 = new Car1();
        c1.display();
        Mathematics ma = new Mathematics();
        System.out.println("Enter 1st number :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number :");
        int b = sc.nextInt();
        sc.close();
        System.out.println(ma.sum(a, b));
        System.out.println(ma.difference(a, b));
        System.out.println(ma.division(a, b));
        System.out.println(ma.product(a, b));
    }
}