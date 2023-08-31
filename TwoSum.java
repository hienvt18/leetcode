import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] a, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int complement = a[i] - target;
            if (map.containsKey(complement)) {
                return new int[] { i, map.get(complement) };
            }
            map.put(a[i], i);
        }
        return null;
    }
}