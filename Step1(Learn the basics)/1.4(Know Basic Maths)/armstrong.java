import java.util.*;

public class armstrong {

    public static boolean isArmstrong(int n) {

        int c = 0;
        int temp = n;

        while (temp > 0) {
            c++;
            temp /= 10;
        }

        int temp2 = n;
        int arm = 0;

        while (temp2 > 0) {
            int dig = temp2 % 10;
            arm = arm + (int) Math.pow(dig, c);
            temp2 /= 10;
        }

        return arm == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isArmstrong(n));
    }
}