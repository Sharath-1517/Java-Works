package classesandobjects.Part1;

class Triangle2{
    public Triangle2(int a,int b,int c){
        
        double s = (a+b+c)/2.0;
        System.out.println(s);
        System.out.println(Math.pow((s*(s-a)*(s-b)*(s-c)), .5));
    }
}
public class TrianglewithConstructor {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        
        new Triangle2(a, b, c);
    }
}
