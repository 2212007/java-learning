package day03;
//方法与重载
public class Demo1 {
    public static int max(int a,int b){
        return a>b?a:b;
    }

    public static int max(int a,int b,int c){
        return max(max(a,b),c);
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }
    public static void main(String[] args){
        int a=max(1,2,3);
        int b=max(1,2);
        double c=max(1.0,2.0);
        System.out.print(a+" "+b+" "+c);
    }
}
