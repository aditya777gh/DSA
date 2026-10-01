/*
1      1
12    21
123  321
12344321
*/

import java.util.*;
class P12{

    public static void pattern12(int n){
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern12(n);
        }
    }

}