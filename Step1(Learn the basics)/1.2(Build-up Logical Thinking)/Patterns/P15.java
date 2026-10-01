/*
A B C D E 
A B C D 
A B C 
A B 
A 
*/

import java.util.*;
class P15{

    public static void pattern15(int n){
        for(int i=0;i<n;i++){
            for(char ch='A'; ch<='A'+(n-i-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern15(n);
        }
    }

} 
