package basicmaths;

public class Mathematics{
    public int sum(int a,int b){
        return (a+b);
    }
    public int difference(int a,int b){
        return (Math.max(a, b)-Math.min(a, b));
    }public double division(int a,int b){
        return (a/b);
    }public int product(int a,int b){
        return (a*b);
    }
}