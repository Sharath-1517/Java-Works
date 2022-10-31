package basicmaths;
class Average{
    public double toCalculate(int a,int b,int c){
        return (a+b+c)/3;
    }
    public void toPrint(int a,int b,int c){
        System.out.println(toCalculate(a, b, c));
    }
}

public class AverageofThree {
    public static void main(String[] args) {
        int a,b,c;
        a=10;b=20;c=30;
        //Try with Scanner Class :::==
        Average avg = new Average();
        avg.toPrint(a, b, c);
    }
}
