import java.util.Scanner;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));

        int a = arr.length + 1;
        int arraysum = (a * (a + 1)) / 2;

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int res = arraysum - sum;
        System.out.println("Missing element is: " + res);

        s.close();

    }
}
