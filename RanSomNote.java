import java.util.HashMap;

public class RanSomNote {
    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = map.getOrDefault(m, 0);
            map.put(m, currentCount + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = map.getOrDefault(r, 0);
            if (currentCount == 0)
                return false;
            map.put(r, currentCount - 1);
        }
        return true;
    }
}
