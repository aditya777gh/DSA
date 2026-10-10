/* 3. Check if String is Palindrome or Not */
import java.util.*;
class r03{

    public static boolean isPal(int i, String s){
        int n=s.length();
        
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n-i-1) ){
            return false;
        }
        return isPal(i+1,s);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("is palindrome? : " +isPal(0,s) );
    }
}
/*
racecar
is palindrome? : true
*/