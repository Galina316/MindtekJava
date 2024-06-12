package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplyDiscount {
    public static void main(String[] args) {
        //1. Create a class with main method, then create below List.
        //ArrayList <String> items=new ArrayList<>(Arrays.asList("AirPods $230","Magic keyboard $100", "Apple TV $200","iPhone 13 $999"));
        //2. Update item prices in list with %10 discount that has price equals to or more than 200
        //3. Then print items list


        List<String> items = new ArrayList<>(Arrays.asList("AirPods $230", "Magic keyboard $100", "Apple TV $200", "iPhone 13 $999"));


        String updateList = "";
        for (int i = 0; i < items.size(); i++) {
            String[] item = items.get(i).split("\\$");
            int price = Integer.parseInt(item[1]);
            if (price >= 200) {
                double discount = price*0.1;
                int newPrice = (int) (price - discount);
                updateList = item[0] + " $" + newPrice;
                items.set(i,updateList);
            }
        }
        System.out.println(items);


    }
}
