class AbsoluteNumberCalculator {
    private int number;

    public AbsoluteNumberCalculator() {
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

    public int findAbsolute(int number) {
        if (number == 0) {
            return 0;
        } else if (number < 0) {
            return -number;
        }
        return number;
    }
}
