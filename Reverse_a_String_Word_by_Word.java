import java.util.Scanner;

public class Reverse_a_String_Word_by_Word {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println("Original Array: " + a);
        String res = Reverse(a);
        System.out.println("Reversed string: " + res);
        s.close();

    }

    public static String Reverse(String s) {
        String result = "";
        int i = 0;
        int n = s.length();
        while (i < n) {
            while (i < n && s.charAt(i) == ' ')
                i++;
            if (i >= n)
                break;
            int j = i + 1;
            while (j < n && s.charAt(j) != ' ')
                j++;
            String sub = s.substring(i, j);
            if (result.length() == 0)
                result = sub;
            else
                result = sub + " " + result;
            i = j + 1;
        }
        return result;

    }

}
