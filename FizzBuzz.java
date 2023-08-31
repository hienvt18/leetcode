import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

    }

    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            boolean divisible3 = i % 3 == 0;
            boolean divisible5 = i % 5 == 0;
            String curStr = "";

            if (divisible3) {
                curStr += "Fizz";
            }

            if (divisible5) {
                curStr += "Buzz";
            }

            if (curStr.isEmpty()) {
                curStr += String.valueOf(i);
            }
            answer.add(curStr);
        }
        return answer;
    }
}
