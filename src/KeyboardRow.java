import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class KeyboardRow {
    public static void main(String[] args) {
        findWords(new String[]{"Hello", "Alaska", "Dad", "Peace", "DaklS", "qWerty"});
    }

    public static ArrayList<String> findWords(String[] words) {
        HashMap<Integer, char[]> map = new HashMap<>();
        map.put(0, new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'});
        map.put(1, new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'});
        map.put(2, new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'});
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toLowerCase().toCharArray();
            System.out.println(Arrays.toString(chars));
            int rowNum = 0;
            boolean isAnotherRow = false;
            for (int a = 0; a < chars.length; a++) {
                boolean isFound = false;
                for (int j = 0; j < 3; j++) {
                    if (!isFound && !isAnotherRow) {
                        for (int k = 0; k < map.get(j).length; k++) {
                            if (map.get(j)[k] == chars[a]) {
                                isFound = true;
                                System.out.println("found: " + chars[a]);
                                if (a == 0) {
                                    rowNum = j;
                                    System.out.println("rownum: " + rowNum + chars[a]);
                                } else {
                                    if (j != rowNum) {
                                        isAnotherRow = true;
                                        System.out.println("added");
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
            if (!isAnotherRow) {
                output.add(words[i]);
            }
        }
        System.out.println(output);
        return output;
    }
}
