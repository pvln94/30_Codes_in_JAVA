import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class leadersinArray {

    static ArrayList<Integer> leaders = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(arr));
        leaders(arr);
        System.out.println("Leaders are: " + leaders);
        s.close();

    }

    public static void leaders(int[] arr) {

        int n = arr.length;
        leaders.add(arr[n - 1]);
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }

    }

}
