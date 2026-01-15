import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exam3 {
    public static void main(String[] args) {
        BigDecimal item1Price = new BigDecimal("200");
        BigDecimal item2Price = new BigDecimal("250");

        //税率
        BigDecimal TAX_RATE = new BigDecimal("0.10");

        //税抜
        BigDecimal subtotal = item1Price .multiply(BigDecimal.valueOf(3))
                                .add(item2Price .multiply(BigDecimal.valueOf(4)));

        //消費税
        BigDecimal tax = subtotal .multiply(TAX_RATE) .setScale(0, RoundingMode.DOWN);

        //税込合計
        BigDecimal total = subtotal .add(tax);


        System.out.println("小計");
        System.out.println(subtotal + "円");
        System.out.println("消費税" );
        System.out.println(tax + "円");
        System.out.println("合計金額" );
        System.out.println(total + "円");
    }
}
