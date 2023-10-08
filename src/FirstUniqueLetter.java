import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstUniqueLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] charArray = s.toCharArray();
        int[] freq = new int[26];
        int indexOfUnique = -1;
        char firstUniqueLetter = ' ';
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (charArray[i] == alphabet[j]) {
                    freq[j]++;
                }
            }
        }
        boolean isFound = false;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < freq.length; j++) {
                if (!isFound) {
                    if (charArray[i] == alphabet[j] && freq[j] == 1) {
                        //System.out.println("element: " + charArray[i]);
                        firstUniqueLetter = charArray[i];
                        indexOfUnique = i;
                        isFound = true;
                    }
                }
            }
        }
//        for (int i = 0; i < freq.length; i++) {
//            if (freq[i] == firstUniqueLetter) {
//                indexOfUnique = i;
//            }
//        }
        System.out.println(indexOfUnique);
        System.out.println(firstUniqueLetter);
        System.out.println(Arrays.toString(freq));
        System.out.println(Arrays.toString(alphabet));
    }
}
//from leetcode:
// int freq[] = new int[26];
//    for(char i: s.toCharArray()) freq[i-'a']++;
//    for(int i = 0; i < s.length(); i++) if(freq[s.charAt(i)-'a'] == 1) return i;
//    return -1;
