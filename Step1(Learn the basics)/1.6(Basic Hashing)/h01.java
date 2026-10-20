// Number Hashing
import java.util.*;
public class h01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // 1. Array input lena
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. Precomputation (Hash Array banana)
        // Agar array ke numbers max 12 tak hain, toh size 13 banaya (0 se 12 indices)
        int[] hash = new int[13]; 
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // 3. Queries fetch karna
        int q = sc.nextInt();
        while (q > 0) {
            int number = sc.nextInt();
            // Fetch: direct O(1) me frequency print karna
            System.out.println(hash[number]);
            q--;
        }
    }
}
