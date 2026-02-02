public class Exam3 {
    public static void main(String[] args) {
        seiki(2110);
    }

    public static void seiki(int year){
        int seikis = (year - 1) / 100 + 1;
        
        int count = 0;
        for(int i = 1; i <= seikis; i++){
            count++;
        }
        System.out.println( year + "年は" +count + "世紀です");
    }
}
