import java.util.Scanner;

public class CountNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int sumOfNegativeNums = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] < 0){
                    sumOfNegativeNums++;
                }
            }
        }
        System.out.println(sumOfNegativeNums);
        System.out.println(grid.length);
    }
}
