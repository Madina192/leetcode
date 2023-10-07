import java.util.ArrayList;
import java.util.Arrays;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "a"};
        task(words);
    }

    static void task(String[] words) {
        String[] elements = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] secondArray = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            char[] charArray = words[i].toCharArray();
            System.out.println(Arrays.toString(charArray));
            for (int j = 0; j < charArray.length; j++) {
                for (int k = 0; k < alphabet.length; k++) {
                    if (charArray[j] == alphabet[k]) {
                        secondArray[i] += elements[k];
                    }
                }
            }
        }
        ArrayList<String> repeatedElements = new ArrayList<>();
        int numberOfDiff = 0;
        for (int i = 0; i < secondArray.length; i++) {
            if (!repeatedElements.contains(secondArray[i])) {
                numberOfDiff++;
                for (int j = i + 1; j < secondArray.length; j++) {
                    if (secondArray[i].equals(secondArray[j])) {
                        repeatedElements.add(secondArray[i]);
                    }
                }
            }
        }
        System.out.println("different: " + numberOfDiff);
        System.out.println(Arrays.toString(secondArray));
    }
}
