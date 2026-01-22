package object;

public class Car {
    private int speed;

    public void run(){
        speed = speed + 50;

        System.out.println("走りました。スピードが" + speed + "km/hになりました");

        if(speed >= 120){
            System.out.println("スピードの出しすぎです");
        }
    }
}
