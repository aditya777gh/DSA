/*
    *    
   ***   
  *****  
 ******* 
*********
*/
import java.util.*;
class P7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            pattern7(n);
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
    
}