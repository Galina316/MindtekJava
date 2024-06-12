package wrapperclasses;

import java.util.Arrays;

public class StarbucksPrices {
    public static void main(String[] args) {
        String [] prices ={"Coffee $2.25","Cappuccino $4.45","Latte $4.10","Mocha $3.25"};
        //{"Coffee $2.47","Cappuccino $4.89","Latte $4.51","Mocha $3.57"};

        for (int i = 0; i<prices.length;i++){
            //double value = Double.parseDouble(prices[i].substring(prices[i].indexOf('$')+1));
           // value+=value*0.1;
            //prices[i] = prices[i].substring(0,prices[i].indexOf('$')+1)+value;
            String[]elements = prices[i].split("\\$");
            //System.out.println(elements[1]);
            double price = Double.parseDouble(elements[1]);
            price = price+ price*0.1;
            price = Math.round(price*100.0)/100.0;
            String newElement = elements[0]+" $"+price;
            prices[i]=newElement;
            }
        System.out.println(Arrays.toString(prices));
        }
        //System.out.println(prices);




    }

