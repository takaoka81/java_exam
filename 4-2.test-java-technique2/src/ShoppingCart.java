import java.util.LinkedList;

public class ShoppingCart extends LinkedList<Item> {

    public int getTotalPrice() {
        int count = 0;

        for (Item price : this) {
            count += price.getPrice();
        }

        return count;
    }

    public int getAveragePrice() {
        if (this.size() == 0) {
            return 0;
        }
        return getTotalPrice() / this.size();
    }
}
