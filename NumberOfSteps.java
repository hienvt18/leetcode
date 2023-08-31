public class NumberOfSteps {
    public static void main(String[] args) {

    }

    public static int numberOfSteps(int num) {
        int count = 0;
        if (num == 0)
            return 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            count++;
        }
        return count;
    }
}
