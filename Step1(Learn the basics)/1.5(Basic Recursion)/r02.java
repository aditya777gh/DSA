/* 2. Factorial of a Given Number */
import java.util.*;
class r02{

    public static int sumN(int N){
        if(N<=0){
            return 1;
        }
        return N*sumN(N-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("factorial of N is "+sumN(N));
    }
}
/*
4
factorial of N is 24
*/