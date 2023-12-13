public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        int[] nums = {145, 75, 65, 80, 25};
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println(findDividers(min, max));
    }

    private static int findDividers(int a, int b) {   //
        if (b == 0) {
            return a;
        } else {
            return findDividers(b, a % b);
        }
    }

//    Euclidean algorithm :
//    It is based on the principle that the greatest common divisor of two numbers
//    does not change if the larger number is replaced by its difference with the smaller number.
//For example, 21 is the GCD of 252 and 105 (as 252 = 21 × 12 and 105 = 21 × 5),
//    and the same number 21 is also the GCD of 105 and 252 − 105 = 147.
}
