import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array seperated by spaces");
        String a = s.nextLine();
        String[] arr = a.split(" ");
        System.out.println("Original array: " + Arrays.toString(arr));
        List<List<String>> res = GA(arr);
        System.out.println("Anagram's are: " + res);

        s.close();

    }

    public static List<List<String>> GA(String[] a) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : a) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(key, strList);
            }
        }
        result.addAll(map.values());
        return result;
    }

}
