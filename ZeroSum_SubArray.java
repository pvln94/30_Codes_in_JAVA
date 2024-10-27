import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class ZeroSum_SubArray {
    static ArrayList<int[]> res = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original array is: " + Arrays.toString(arr));

        array(arr);
        for (int[] i : res) {
            System.out.println("(" + i[0] + "," + i[1] + ")");
        }
        s.close();

    }

    public static void array(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int curr_sum = 0;
        for (int end = 0; end < arr.length; end++) {
            curr_sum += arr[end];
            if (curr_sum == 0) {
                res.add(new int[] { 0, end });
            }
            if (map.containsKey(curr_sum)) {
                int start = map.get(curr_sum) + 1;
                res.add(new int[] { start, end });

            }
            map.put(curr_sum, end);

        }
    }

}
