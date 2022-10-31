package classesandobjects.Part1;

class Triangle{
    int a,b,c;
    public double getPermimeter(){
        return ((a+b+c)/2.0);
    }
    public double getArea(){
        double s = (a+b+c)/2.0;
        return (Math.pow((s*(s-a)*(s-b)*(s-c)),.5));
    }
}
public class TAandP {
    public static void main(String[] args) {
        Triangle t  =new Triangle();
        t.a = 2;
        t.b = 5;
        t.c = 6;
        System.out.println(t.getPermimeter());
        System.out.println(t.getArea());
    }
}
