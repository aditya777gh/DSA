/*
1
22
333
4444
 */
import java.util.*;
class P4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern4(n);
        }
    }

    public static void pattern4(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
        System.out.println();
        }
    }
}