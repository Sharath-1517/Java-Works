package classesandobjects.Part1;
class Employee1{
    private String n;
    private int y;
    private int s;
    private String a;
    public Employee1(String name,int year,int salary,String address){
        n=name;
        y=year;
        s=salary;
        a=address;
    }
    public String dispName(){
        return n;
    } 
    public int dispYear(){
        return y;
    }public int dispSalary(){
        return s;
    }public String dispAddress(){
        return a;
    }
}
public class Employee {
   public static void main(String[] args) {
    Employee1 e1 = new Employee1("Robert",1994,15000,"64C-WallsStreet");
    Employee1 e2 = new Employee1("Sam",2000,16000,"68D-WallsStreet");
    Employee1 e3 = new Employee1("John",1999,17000,"26B-WallsStreet");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
    System.out.println(e1.dispName()+"\t\t"+e1.dispYear()+"\t"+e1.dispSalary()+"\t"+e1.dispAddress());  
    System.out.println(e2.dispName()+"\t\t"+e2.dispYear()+"\t"+e2.dispSalary()+"\t"+e2.dispAddress()); 
    System.out.println(e3.dispName()+"\t\t"+e3.dispYear()+"\t"+e3.dispSalary()+"\t"+e3.dispAddress());  
  }
}
