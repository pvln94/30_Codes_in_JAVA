import java.util.Scanner;
import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }
        System.out.println("OriginalArray: " + Arrays.toString(arr));
        int dup = Duplicate(arr);
        System.out.println("Duplicate element is: " + dup);
        s.close();
    }

    public static int Duplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;

    }

}
