public class Exam04 {
    public static void main(String[] args) {
        uruyear(2000);
    }

    public static boolean uruyear(int year) {

        if (year % 400 == 0) {
            System.out.println(year + "年はうるう年です");
            return true;
        } else if (year % 100 == 0) {
            System.out.println(year + "年はうるう年ではありません");
            return false;
        } else if (year % 4 == 0) {
            System.out.println(year + "年はうるう年です");
            return true;
        } else {
            System.out.println(year + "年はうるう年ではありません");
            return false;
        }
    }
}
