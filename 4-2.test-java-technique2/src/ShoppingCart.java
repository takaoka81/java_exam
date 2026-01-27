import java.util.ArrayList;
import java.util.LinkedList;

public class ShoppingCart extends LinkedList{
    
    private  ArrayList<Item> items;

    ShoppingCart(){
        items = new ArrayList<>();
    }

    public int getTotalPrice(){
        int count = 0;

        for(Item price : items){
            count += price;
        }

        return count;
    }

    public int getAveragePrice(){
        return getTotalPrice() / items.size();
    }
}
