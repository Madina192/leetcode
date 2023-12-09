import java.util.ArrayList;
import java.util.Scanner;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean isSelfDividing = true;
            while (num > 0){
                System.out.println(num%10);
                if(num%10==0){
                    isSelfDividing = false;
                    break;
                } else {
                    if (i % (num % 10) != 0) {
                        isSelfDividing = false;
                        break;
                    }
                }
                num/=10;
            }
            if (isSelfDividing) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
