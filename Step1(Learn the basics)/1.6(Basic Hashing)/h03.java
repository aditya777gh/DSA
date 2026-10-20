// Unordered Map
import java.util.*;
public class h03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 1. Input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 2. HashMap create karna (Key = Number, Value = Frequency)
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // C++ ke mpp[arr[i]]++ ka Java equivalent:
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        // 3. Map ko iterate karke dekhna (Optional / Commented in C++)
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }

        // 4. Queries fetch karna
        int q = sc.nextInt();
        while (q > 0) {
            int number = sc.nextInt();
            // Fetch: agar number exist nahi karta toh 0 print karein
            System.out.println(mpp.getOrDefault(number, 0));
            q--;
        }
    }
}
