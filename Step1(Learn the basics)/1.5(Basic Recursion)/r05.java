/* 5.  Fibonacci Number using Multiple recusrsion calls */
import java.util.*;
class r05{

    public static int mrFib(int n){
    if(n<=1){
        return n;
    }
    int last=mrFib(n-1);
    int slast=mrFib(n-2);
    return last + slast;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("fibonacci series is  " +mrFib(n));

    }
}