public class Exam6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                int total = i * j;
                if(total < 10){
                    System.out.print(" " + total + " ");
                }else {
                    System.out.print(total+ " " );
                }   
            }
            System.out.println();
        }
    }
}
