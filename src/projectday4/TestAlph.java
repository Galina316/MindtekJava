package projectday4;

public class TestAlph {
    public static void main(String[] args) {
        String word = "ab";
        int sum = 0;
        for(int i = 0; i<word.length();i++)
            sum = sum+ word.charAt(i);
        System.out.println(sum);
    }
}
