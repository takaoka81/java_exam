public class Exam6 {
    static int calc(int num1, int num2, char str){
        if(str == '+'){
            return num1 + num2;
        }else if(str == '-'){
            return num1 - num2;
        }else if(str == '*'){
            return num1 * num2;
        }else if(str == '/'){
            return num1 / num2;
        }else {
            System.out.println("-1");
        }
            return str;
    }

    public static void main(String[] args) {
        System.out.println(calc(2, 3, '+'));
        System.out.println(calc(8, 2, '-'));
        System.out.println(calc(5, 4, '*'));
        System.out.println(calc(7, 2, '/'));
        System.out.println(calc(8, 3, '@'));
    }
}
