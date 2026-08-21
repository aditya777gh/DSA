/* 
*****
****         
***
**
*
*/

import java.util.*;
class P5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern5(n);
        }
    }

    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

//alternate method->
/* import java.util.*;
class P5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern5(n);
        }
    }

    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
 */