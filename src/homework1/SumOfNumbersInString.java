package homework1;

public class SumOfNumbersInString {
    public static int getSum(String nums){
        StringBuilder str = new StringBuilder();
        int total = 0;
        String t = "";
        for(int i= 0;i<nums.length();i++){

            if(Character.isDigit(nums.charAt(i))){
                t+=nums.charAt(i);
                if(i+1 ==nums.length()){
                    total+=Integer.parseInt(t);
                }
            }else if(t.length()>=1){
                total+=Integer.parseInt(t);
                t="";
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(getSum("a12b2mn10"));
        System.out.println(getSum("123u6i009"));
    }
}
