public class Exam01 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int calc = i * j;

                if (calc < 10) {
                    System.out.print("0" + calc + " ");
                } else {
                    System.out.print(calc + " ");
                }
            }
            System.out.println();
        }
    }
}
