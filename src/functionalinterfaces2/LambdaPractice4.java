package functionalinterfaces2;

public class LambdaPractice4 {
    public static void main(String[] args) {
        Checker<Integer,Integer> sum = x -> {
            Integer total = 0;
            for(Integer num:x){
                total+=num;
            }
            return total;
        };
        Integer []nums = {5,2,6};
        System.out.println(sum.execute(nums));

        Checker <Integer,Boolean> sumMoreThan20=x-> sum.execute(x)>20;

        System.out.println(sumMoreThan20.execute(nums));

        /*
        implement lambda expression for checker that takes array
        ofString and return all elements concatenated.
        example;
        String[] words={"I","love","Java"};
        concatenate.execute(words);->return "I love java"
         */


        Checker <String, String> concatenate = x -> {
            String result = "";
            for(String str: x){
                result+=str + " ";
            }
            return result;
        };

        String [] arr = {"I", "love", "Java"};

        System.out.println(concatenate.execute(arr));

        Checker<String,String> concatenate1 =x ->{
            StringBuilder stb = new StringBuilder();
            for(String s: x){
                stb.append(s).append(" ");
            }
            return stb.toString().trim();
        };
        String [] arr1 = {"I", "love", "Java"};
        System.out.println(concatenate1.execute(arr1));

        /*
        String[] prices ={"$2.4","$5.2","$3"};
        Example:
        getTotal.execute(prices);->return 10.6; double
         */

        Checker<String,Double>getTotal=x->{
            Double total =0.0;
            for(String price: x){
                Double p =Double.valueOf(price.substring(1)) ;
                total+=p;
            }
            return total;
        };

        String[] prices ={"$2.4","$5.2","$3"};
        System.out.println(getTotal.execute(prices));


        }
    }

