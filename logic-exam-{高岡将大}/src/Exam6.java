import java.util.ArrayList;
import java.util.List;

public class Exam6 {
    public static void main(String[] args) {
        int num1 = (int) Math.floor(Math.random() * 10);
        int num2;
        int num3;
        do {
            num2 = (int) Math.floor(Math.random() * 10);
        } while (num1 == num2);
        do {
            num3 = (int) Math.floor(Math.random() * 10);
        } while (num3 == num1 || num3 == num2);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                for (int k = 0; k < numbers.size(); k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println("" + numbers.get(i) + numbers.get(j) + numbers.get(k));
                    }
                }
            }
        }

        /*
         * System.out.println("" + numbers.get(0) + numbers.get(1) + numbers.get(2));
         * System.out.println("" + numbers.get(0) + numbers.get(2) + numbers.get(1));
         * System.out.println("" + numbers.get(1) + numbers.get(0) + numbers.get(2));
         * System.out.println("" + numbers.get(1) + numbers.get(2) + numbers.get(0));
         * System.out.println("" + numbers.get(2) + numbers.get(1) + numbers.get(0));
         * System.out.println("" + numbers.get(2) + numbers.get(0) + numbers.get(1));
         */

    }

}
