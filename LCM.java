import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int A = a;
        int B = b;
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        int res = ((A * B) / a);
        System.out.println(res);
        s.close();
    }

}