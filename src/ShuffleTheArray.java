import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            array[i] = scanner.nextInt();
        }
        int iter = 0;
        int iter2 = n;
        int[] array2 = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            if(i % 2 == 0) {
                array2[i] = array[iter];
                iter++;
            } else {
                array2[i] = array[iter2];
                iter2++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
