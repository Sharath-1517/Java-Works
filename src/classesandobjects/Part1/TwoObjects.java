package classesandobjects.Part1;
class Variables{
    int contact;
    int roll;
    String address;
    String name;
}
public class TwoObjects {
    public static void main(String[] args) {
        Variables v1 = new Variables();
        Variables v2 = new Variables();
        v1.name = "Sam";
        v2.name = "John";
        v1.contact = 755018532;
        v2.contact = 979097780;
        v1.roll = 1115;
        v2.roll = 1116;
        v1.address = "X";
        v2.address = "Y";
        System.out.printf("%d %d %s\n",v1.roll,v1.contact,v1.address);
        System.out.printf("%d %d %s",v2.roll,v2.contact,v2.address);
    }
}
