public class ValidMountain {
    public static void main(String[] args) {

    }

    public static boolean validMountainArray(int[] a) {
        int n = a.length;
        boolean bIsIncrease = true;

        if (n < 3)
            return false;

        for (int i = 0; (i + 1) < n; i++) {
            int j = i + 1;// phần tử phía sau

            if (a[i] > a[j]) { // dãy giảm
                if (bIsIncrease == false) {

                } else { // bIsIncrease = true
                    if (i == 0) {
                        return false;
                    }
                    bIsIncrease = false;
                }
            } else if (a[i] < a[j]) { // dãy tăng
                if (bIsIncrease == true) {

                } else { // bIsIncrease = false: dãy đang xét là dãy giảm
                    return false;
                }
            } else { // a[i] == a[j]
                return false;
            }
        }

        if (bIsIncrease == false) {// dãy đang xét cuối cùng là dãy giảm
            return true;
        }
        return false;
    }
}
