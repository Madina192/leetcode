
class MaxValueOfString {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("00000"));
        System.out.println(Integer.parseInt("000001"));
        //maximumValue(new String[]{"alic3", "bob", "3", "4", "00000"});
    }

    public static int maximumValue(String[] strs) {
        boolean isItOnlyNumbers;
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            isItOnlyNumbers = true;
            String current = strs[i];
            System.out.println(current);
            for (int j = 0; j < current.length(); j++) {
                if (isItOnlyNumbers) {
                    for (int k = 'a'; k <= 'z'; k++) {
                        if (current.charAt(j) == k) {
                            isItOnlyNumbers = false;
                            System.out.println("char: " + k);
                            break;
                        }
                    }
                }
            }
            if (!isItOnlyNumbers) {
                if (current.length() > max) {
                    max = current.length();
                }
            } else {
                if (Integer.parseInt(current) > max) {
                    max = Integer.parseInt(current);
                }
            }
        }
        System.out.println("max: " + max);
        return max;
    }
}