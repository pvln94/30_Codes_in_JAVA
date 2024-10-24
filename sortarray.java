import java.util.Scanner;
import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        Sortarray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        s.close();

    }

    public static void Sortarray(int[] arr) {
        int l = 0;
        int m = 0;
        int h = arr.length - 1;

        while (m <= h) {
            if (arr[m] == 0) {
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                l++;
                m++;
            } else if (arr[m] == 1) {
                m++;
            } else {
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }

    }

}
