/*     
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    * 
*/
import java.util.*;
class P9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern7(n);
            pattern8(n);
        }
    }

    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
    
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
    
            System.out.println();
        }
    }
    
}