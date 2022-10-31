package classesandobjects.Part1;
class Student1{
    int age;
    String name;
}
public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.age = 20;
        s1.name = "John";
        System.out.printf("Age :%d\nName :%s",s1.age,s1.name);
    }
}
