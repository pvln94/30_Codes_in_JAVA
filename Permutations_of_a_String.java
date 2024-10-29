import java.util.ArrayList;
import java.util.List;

public class Permutations_of_a_String {
    public static List<String> getPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permute(str, "", permutations);
        return permutations;
    }

    private static void permute(String str, String prefix, List<String> permutations) {
        if (str.isEmpty()) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                permute(remaining, prefix + currentChar, permutations);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> result = getPermutations(input);

        System.out.println("Permutations of " + input + ":");
        for (String permutation : result) {
            System.out.println(permutation);
        }
    }
}
