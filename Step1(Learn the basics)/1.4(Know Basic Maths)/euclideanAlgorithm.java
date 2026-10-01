import java.util.*;

public class euclideanalgorithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd;

        while (a > 0 && b > 0) {

            if (a > b) {
                a = a % b;
            } 
            else if (b > a) {
                b = b % a;
            }
        }

        if (a == 0) {
            gcd = b;
        } 
        else {
            gcd = a;
        }

        System.out.println(gcd);
    }
}