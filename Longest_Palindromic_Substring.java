import java.util.Scanner;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String res = longestPal(a);
        System.out.println("Longest Palindromic Substring is: " + res);

        s.close();

    }

    public static String longestPal(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int l1 = expandFromCenter(s, i, i);
            int l2 = expandFromCenter(s, i, i + 1);
            int l = Math.max(l1, l2);

            if (l > end - start) {
                start = i - (l - 1) / 2;
                end = i + l / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

}
