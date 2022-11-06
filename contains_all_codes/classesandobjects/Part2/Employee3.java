package classesandobjects.Part2;
import java.util.*
;
class ExampleEmployee{
    private int s;
    public void getInfo(int s){
        this.s = s;
    }
    public int addSal(){
        return s+10;
    }
    public int addWork(){
        return s+5;
    }
}

public class Employee3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,h;
        System.out.println("Enter the salary amount :");
        s = sc.nextInt();
        System.out.println("Enter the hours amount :");
        h = sc.nextInt();
        sc.close();
        ExampleEmployee ee = new ExampleEmployee();
        ee.getInfo(s);

        if(s<500) System.out.println(ee.addSal());   
        else if(h>6) System.out.println(ee.addWork());
    }
}
