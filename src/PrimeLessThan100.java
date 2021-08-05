public class PrimeLessThan100 {
    public static void main(String[] args) {
        System.out.println(displayPrime(100));
    }

    public static String displayPrime(int number) {
        String result = "";
        int i = 2;
        do {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result += ("" + i + "\n");
            }
            i++;
        } while (i < number);
        return result;
    }
}

