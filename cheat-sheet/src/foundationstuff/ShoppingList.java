package foundationstuff;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    public static void main(String[] args) {
        Map<String, Double> bolt = new HashMap<>();
        Map<String, Integer> bobsList = new HashMap<>();
        Map<String, Integer> aliceList = new HashMap<>();
        bolt.put("Milk", 1.07);
        bolt.put("Rice", 1.59);
        bolt.put("Eggs", 3.14);
        bolt.put("Cheese", 12.60);
        bolt.put("Chicken Breasts", 9.40);
        bolt.put("Apples", 2.31);
        bolt.put("Tomato", 2.58);
        bolt.put("Potato", 1.75);
        bolt.put("Onion", 1.10);
        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken Breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);
        aliceList.put("Rice", 1);
        aliceList.put("Eggs", 5);
        aliceList.put("Chicken Breasts", 2);
        aliceList.put("Apples", 1);
        aliceList.put("Tomato", 10);
        double bobsPay = 0.0;
        double alicesPay = 0.0;


        for (Map.Entry<String, Double> termek : bolt.entrySet()) {
            for (Map.Entry<String, Integer> bobtermek : bobsList.entrySet()) {
                if (termek.getKey().equals(bobtermek.getKey())) {
                    bobsPay += termek.getValue() * bobtermek.getValue();
                }
            }
        }
        System.out.println(bobsPay);
        for (Map.Entry<String, Double> termek : bolt.entrySet()) {
            for (Map.Entry<String, Integer> alicetermek : aliceList.entrySet()) {
                if (termek.getKey().equals(alicetermek.getKey())) {
                    alicesPay += termek.getValue() * alicetermek.getValue();
                }
            }
        }
        System.out.println(alicesPay);

    }
}
