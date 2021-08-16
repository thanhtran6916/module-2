package absolute_number_calculator;

class AbsoluteNumberCalculator {
    private int number;
    AbsoluteNumberCalculator() {

    }

    public AbsoluteNumberCalculator(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int findAbsolute() {
        return Math.abs(number);
    }
}
