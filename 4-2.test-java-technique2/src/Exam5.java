public class Exam5 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.add(new Item("アナと雪の女王", 3000));
        cart.add(new Item("美女と野獣", 2000));
        cart.add(new Item("モアナと伝説の海", 8000));

        System.out.println("合計値:" + cart.getTotalPrice() + "円");
        System.out.println("平均値:" + cart.getAveragePrice() + "円");
    }
}
