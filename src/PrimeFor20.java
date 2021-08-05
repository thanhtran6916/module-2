public class PrimeFor20 {
    public static void main(String[] args) {
        System.out.println(displayPrime(20));
    }

    public static String displayPrime(int number) {
        String result = "";
        int count = 0;
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
                count++;
                result += ("" + i + "\n");
            }
            i++;
        } while (count < number);
        return result;
    }
}
