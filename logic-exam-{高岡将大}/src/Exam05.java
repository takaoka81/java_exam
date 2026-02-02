import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam05 {
    public static void main(String[] args) {
        countSports();
    }

    public static void countSports() {
        String[] sports = { "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer",
                "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging",
                "baseball", "soccer", "soccer" };

        Map<String, Integer> map = new HashMap<>();

        for (String sport : sports) {
            Integer count = map.get(sport);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(sport, count);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Comparator.comparing(Map.Entry<String, Integer> :: getValue).reversed());

        System.out.println("最も出現回数の多いスポーツは" + list.get(0).getKey() + "で、出現回数は" + list.get(0).getValue() + "回です");


    }
}
