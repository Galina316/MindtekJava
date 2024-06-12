package homework;

public class idk {
    public static void main(String[] args) {
        String[] words = {"Hi", "java", "String"};

        // Reassign each value of the array with the reversed word
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }

        // Print the modified array
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}

