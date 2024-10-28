import java.util.Scanner;
import java.util.Arrays;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter list seperated by spaces");
        String a = s.nextLine();
        String[] arr = a.split(" ");
        System.out.println("Original Array: " + Arrays.toString(arr));

        String res = LCP(arr);
        System.out.println("Longest Common Prefix is: " + res);

        s.close();

    }

    public static String LCP(String a[]) {

        if (a.length == 0)
            return "";

        Arrays.sort(a);
        String x = a[0];
        String y = a[a.length - 1];

        int index = 0;
        while (index < x.length()) {
            if (x.charAt(index) == y.charAt(index)) {
                index++;
            } else {
                break;
            }

        }
        return index == 0 ? "" : x.substring(0, index);
    }
}