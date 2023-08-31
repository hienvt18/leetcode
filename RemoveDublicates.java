public class RemoveDublicates {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] a) {
        int n = a.length;
        int curIndex = 0;

        if (n == 0)
            return 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != a[curIndex]) {
                a[curIndex] = a[i];
                curIndex++;
            }
        }

        return curIndex + 1;
    }
}
