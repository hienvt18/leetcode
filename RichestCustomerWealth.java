public class RichestCustomerWealth {
    public static void main(String[] args) {

    }

    public static int maximumWealth(int[][] a) {
        int soHang = a.length;
        int soCot = a[0].length;
        int max = 0;

        for (int i = 0; i < soHang; i++) {
            int tongHangI = 0;
            for (int j = 0; j < soCot; j++) {
                tongHangI += a[i][j];
            }

            if (tongHangI > max) {
                max = tongHangI;
            }
        }

        return max;
    }
}
