// Character Hashing
import java.util.*;
public class h02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. String input lena
        String s = sc.next();

        // 2. Precomputation (ASCII Size 256 ka hash array)
        // By default Java me saare 256 indices par 0 hota hai
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++; // char automatically apne ASCII integer value me convert hota hai
        }

        // 3. Queries fetch karna
        int q = sc.nextInt();
        while (q > 0) {
            char c = sc.next().charAt(0); // single character read karne ka standard tarika
            // Fetch: direct O(1) me frequency print
            System.out.println(hash[c]);
            q--;
        }
    }
}
