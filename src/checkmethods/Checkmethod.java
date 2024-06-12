package checkmethods;

public class Checkmethod {
    public String commonLetters(String value1, String value2){
        value1 =value1.toLowerCase();
        value2= value2.toLowerCase();

        StringBuilder commonChar = new StringBuilder();
        for(int i= 0;i<value1.length()&&i<value2.length();i++){
            if(value1.charAt(i)==value2.charAt(i));
            i--;
            commonChar.append(value1.charAt(i));


        }
        return commonChar.toString();
    }

    public static void main(String[] args) {
       Checkmethod m = new Checkmethod();
        System.out.println();
    }

}
