
public class BubbleSort {
    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) { // j j+1 // j + 1 < n => j < n -i -1
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                if (isSorted) {
                    break;
                }
            }
        }
    }
}
