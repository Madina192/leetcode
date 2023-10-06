import java.util.Scanner;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(nums[i] == nums[j]){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
