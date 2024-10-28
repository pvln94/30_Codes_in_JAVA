import java.util.Scanner;
import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original Array is: " + Arrays.toString(arr));

        int res = trapRain(arr);
        System.out.println(res);
        s.close();
    }

    public static int trapRain(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0; // Handle empty input

        int[] max_left = new int[n];
        int[] max_right = new int[n];

        // Initialize the max_left and max_right arrays
        max_left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            max_left[i] = Math.max(max_left[i - 1], arr[i]);
        }

        max_right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], arr[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int pot = Math.min(max_left[i], max_right[i]);
            sum += pot - arr[i]; // Accumulate trapped water
        }

        return sum;
    }
}
