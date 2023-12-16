import java.util.Arrays;

public class Permutation {
    public static void hackPassword(int length, String symbols) {
        char[] password = new char[length];
        Arrays.fill(password, symbols.charAt(0));
        int num = 0;
        int lengthCombinate = (int) Math.pow(symbols.length(), length);
        while (num < lengthCombinate) {
            System.out.println(password);
            int index = length - 1;
            while (index >= 0) {
                int currentIndex = symbols.indexOf(password[index]);
                if (currentIndex < symbols.length() - 1) {
                    password[index] = symbols.charAt(currentIndex + 1);
                    break;
                } else {
                    password[index] = symbols.charAt(0);
                    index -= 1;
                }
            }
            num += 1;
        }
        System.out.println(num);
        System.out.println(String.valueOf(password));
    }

    public static void main(String[] args) {
        //hackPassword(3, "abcd");
        //foundAllPasswordVariations(3, "abcd");
        //generateVariationsRecursive("abcd", 3, "");
        generateVariations("abcd", 3);
//        System.out.println(2%4);
//        System.out.println("abcd".charAt(3 % 4));
    }

    public static void foundAllPasswordVariations(int length, String str) {
        char[] chars = str.toCharArray();
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    System.out.println(chars[i] + " " + chars[j] + " " + chars[k]);
                }
            }
        }
        System.out.println(Arrays.toString(chars));
    }

    private static void generateVariationsRecursive(String input, int length, String current) {
        if (length == 0) {
            System.out.println(current);
        }

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            generateVariationsRecursive(input, length - 1, current + currentChar);
        }
    }

    private static void generateVariations(String input, int length) {
        for (int i = 0; i < Math.pow(input.length(), length); i++) {
            StringBuilder variation = new StringBuilder();
            int temp = i;

            for (int j = 0; j < length; j++) {
                variation.append(input.charAt(temp % input.length()));
                temp /= input.length();
            }

            System.out.println(variation);
        }
    }
}


