public class PlusOne {
    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] a) {
        int n = a.length;
        int i = n - 1;
        int soDu = 1;

        while (i >= 0 && soDu >= 0) {
            int temp = a[i] + soDu; /// 9 + 4 = 13 => 13 % 10 = 3 ; 13 / 10 = 1
            a[i] = temp % 10;
            soDu = temp / 10;
            i--;
        }

        if (soDu == 0)
            return a;

        int[] b = new int[n + 1];
        b[0] = soDu;

        for (i = 0; i < n; i++) {
            b[i + 1] = a[i];
        }

        return b;
    }
}
