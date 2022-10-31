package classesandobjects.Part1;
import java.util.*;;
public class Inheritance {
    int l,b;
    public Inheritance(int l,int b){
        this.l = l;
        this.b = b;
    }
    public int setDim(){
        return l*b;
    }
    public void area(){
        System.out.println("Area :"+setDim());
    }
    public static void main(String[] args) {
        int l,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of the rectangle :");
        l = sc.nextInt();
        System.out.println("Breadth of the rectangle :");
        b = sc.nextInt();
        sc.close();
        Inheritance in = new Inheritance(l, b);
        in.area();
    }
}
