package arrays2;

public class LongestPalindrome {
    public static void main(String[] args) {
        String palindromes = "civic kayak racecar mom madam";
        // get the longest palindrome - racecar

        String [] word = palindromes.split(" ");
        int max = 0;
        for(String palindrome : word){
            if(max<palindrome.length()){
                max = palindrome.length();
            }
        }
        for(String palindrome: word){
            if(max==palindrome.length()){
                System.out.println(palindrome);
            }
        }

    }
}
