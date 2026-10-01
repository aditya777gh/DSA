/*
A
AB
ABC
ABCD
ABCDE
*/

import java.util.*;
class P14{

    public static void pattern14(int n){
        for(int i=1;i<=n;i++){
            for(char ch='A'; ch<'A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern14(n);
        }
    }

}