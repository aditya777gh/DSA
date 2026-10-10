/* 1. Sum of First N Numbers */
import java.util.*;
class r01{

    public static int sumN(int N){
        if(N<=0){
            return 0;
        }
        return N+sumN(N-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("sum of first N numbers is "+sumN(N));
    }
}
/*
sum of first N numbers is 15
*/