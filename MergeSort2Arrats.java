import java.util.Scanner;
import java.util.Arrays;

public class MergeSort2Arrats {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("Array1: " + Arrays.toString(arr1));

        for (int i = 0; i < n2; i++) {
            arr2[i] = s.nextInt();
        }
        System.out.println("Array2: " + Arrays.toString(arr2));

        Mergesort(arr1, arr2);
        s.close();

    }

    public static void Mergesort(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        for (int i = 0; i < m; i++) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                int first = arr2[0];

                int k = 1;
                while (k < n && arr2[k] < first) {
                    arr2[k - 1] = arr2[k];
                    k++;
                }
                arr2[k - 1] = first;
            }
        }

        System.out.println("Updated Array1: " + Arrays.toString(arr1));
        System.out.println("Updated Array2: " + Arrays.toString(arr2));
    }

}
