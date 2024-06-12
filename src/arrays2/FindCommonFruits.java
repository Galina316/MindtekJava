package arrays2;

public class FindCommonFruits {
    public static void main(String[] args) {
        String []basket1 ={"Apples","Banana","Watermelon","Orange"};
        String []basket2 ={"Melon","Kiwi","Orange","Apples"};
        // Apples, Orange
        LABEL:for(int i = 0; i<basket1.length;i++){
            LABEL2: for(int a = 0; a< basket2.length; a ++){
                if(basket1[i].equalsIgnoreCase(basket2[a])){
                    System.out.println("Common fruit: "+basket1[i]+", ");
                   break LABEL2;
                }
            }
        }

    }
}
