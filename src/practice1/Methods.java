package practice1;

public class Methods {

    public String lastTwoChar(String str){
        return str.toLowerCase().substring(str.length()-2);
    }

    public static void main(String[] args) {
        Methods t = new Methods();
        System.out.println(t.lastTwoChar("Hello"));
    }
}
