/*
A 
B B 
C C C 
D D D D 
E E E E E 
*/

import java.util.*;
class P16{

    public static void pattern16(int n){
        
        for(int i=0;i<n;i++){
            char ch=(char)('A' + i);
            for(int j=0;j<=i;j++){
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
            pattern16(n);
        }
    }

} 
 
