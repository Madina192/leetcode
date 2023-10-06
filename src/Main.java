import java.util.Arrays;

public class Main {
    public static int num = 5;
    public static void main(String[] args) {
        System.out.println(num);
        int[] numbers1 = {0,4,6,-2};
        int[] numbers = new int[4];
        char symbol = '0';
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        int[][] table = new int[4][6];
        String[][] tableOfNames = {{"Madina","Andy"},{"Keven","John"}};


        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < 6; j++) {
                table[0][j] = 1;
                table[table.length-1][j] = 1;
                table[i][0] = 1;
                table[i][5] = 1;
            }
        }

        //System.out.println(Arrays.toString(numbers1));
        //System.out.println(Arrays.toString(numbers));
        //System.out.println(symbol);
        System.out.println(Arrays.deepToString(table));
        //System.out.println(Arrays.deepToString(tableOfNames[0]));
        //System.out.println();

        int [] myNumList = {3, 7, 0, 9, -2, 13, -3, 17, 57, 5};

        int box2 = 0;
        for (int i = 0; i < myNumList.length; i++) {
            for (int j = i + 1; j < myNumList.length; j++) {
                if (myNumList[i] > myNumList[j]) {
                    box2 = myNumList[i];
                    myNumList[i] = myNumList[j];
                    myNumList[j] = box2;
                }
            }
        }
        System.out.println(Arrays.toString(myNumList));
    }
}