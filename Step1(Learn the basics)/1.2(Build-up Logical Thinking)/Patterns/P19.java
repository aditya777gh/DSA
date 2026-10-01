/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
import java.util.*;
class P19{

    public static void pattern19(int n){
        int iniS=0;
            for(int i=0;i<n;i++){
                //stars
                for(int j=1;j<=n-i;j++){
                    System.out.print("*");
                }
                //space
                for(int j=0;j<iniS;j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=n-i;j++){
                    System.out.print("*");
                }
                System.out.println();
                iniS+=2;
            }

            iniS=2*n-2;
            for(int i=1;i<=n;i++){
                //stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                //space
                for(int j=0;j<iniS;j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
                iniS-=2;
            }
            
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern19(n);
        }
    }

} 