public class FizzBuzzTranslate {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String NGOAI_LE = "Không đúng số nhỏ hơn 1";

    public String translate(int number) {
        String result;
        boolean chiaHetChoCa3Va5 = number % 15 == 0;
        boolean chiaHetCho3 = number % 3 == 0;
        boolean chiaHetCho5 = number % 5 == 0;
        if (number > 0) {
            if (chiaHetChoCa3Va5) {
                result = FIZZ + BUZZ;
            } else if (chiaHetCho3) {
                result = FIZZ;
            } else if (chiaHetCho5) {
                result = BUZZ;
            } else {
                result = String.valueOf(number);
            }
        } else result = NGOAI_LE;
        return result;
    }
}
