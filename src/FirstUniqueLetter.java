import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstUniqueLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] charArray = s.toCharArray();
        int indexOfUniqueLetter = -1;
        ArrayList listOfRepeatedEl = new ArrayList<>();
        boolean isItOccurs = false;
        for (int i = 0; i < charArray.length; i++) {
            if (i == charArray.length - 1) {
                if (listOfRepeatedEl.contains(charArray[i])) {
                    isItOccurs = true;
                } else {
                    isItOccurs = false;
                }
            } else {
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        isItOccurs = true;
                        listOfRepeatedEl.add(charArray[i]);
                        System.out.println("occurs " + charArray[i]);
                    } else if (listOfRepeatedEl.contains(charArray[i])) {
                        isItOccurs = true;
                    } else {
                        isItOccurs = false;

                    }
                    System.out.println("letters: " + charArray[i] + charArray[j]);
                }
            }
            if (isItOccurs) {
                indexOfUniqueLetter = -1;
                System.out.println("true");
            } else {
                indexOfUniqueLetter = i;
                break;
            }
        }
        System.out.println(indexOfUniqueLetter);
        System.out.println(Arrays.toString(charArray));
    }
}
