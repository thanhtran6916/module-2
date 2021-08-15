package new_home_word_3;

import java.time.LocalDate;

class CrispyFlour extends Material implements Discount {
    public static final double DISCOUNT_40 = 0.4;
    public static final double DISCOUNT_20 = 0.2;
    public static final double DISCOUNT_10 = 0.1;
    public static final int EXTRA_2_MONTHS_USE = 2;
    public static final int EXTRA_4_MONTHS_USE = 4;
    private double quantity;
    private int manufacturingDay = getManufacturingDate().getDayOfMonth();
    private int manufacturingMonth = getManufacturingDate().getMonthValue();
    private int manufacturingYear = getManufacturingDate().getYear();
    private int expiryDay = getExpiryDate().getDayOfMonth();
    private int expiryMonth = getExpiryDate().getMonthValue();
    private int expiryYear = getExpiryDate().getYear();

    protected CrispyFlour(){
    }

    protected CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    protected double getQuantity() {
        return quantity;
    }

    protected void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    protected LocalDate getExpiryDate() {
        return LocalDate.of(manufacturingYear + 1, manufacturingMonth, manufacturingDay);
    }

    @Override
    protected double getAmount() {
        return quantity * getCost();
    }


    @Override
    public double getRealMoney() {
        double realMoney = 0;
        int nowDay = LocalDate.now().getDayOfMonth();
        int nowMonth = LocalDate.now().getMonthValue();
        int nowYear = LocalDate.now().getYear();
        boolean sameYear = nowYear == expiryYear;
        int subtractionExpiryMonthAndNowMonth = expiryMonth - nowMonth;
        if (sameYear && subtractionExpiryMonthAndNowMonth < EXTRA_2_MONTHS_USE
            || sameYear && subtractionExpiryMonthAndNowMonth == EXTRA_2_MONTHS_USE && nowDay > expiryDay) {

            realMoney = getAmount() - getAmount() * DISCOUNT_40;
        } else if (sameYear && subtractionExpiryMonthAndNowMonth < EXTRA_4_MONTHS_USE
                   || sameYear && subtractionExpiryMonthAndNowMonth == EXTRA_4_MONTHS_USE && nowDay > expiryDay) {
            realMoney = getAmount() - getAmount() * DISCOUNT_20;
        } else {
            realMoney = getAmount() - getAmount() * DISCOUNT_10;
        }
        return realMoney;
    }

    @Override
    public String toString() {
        return "{" + getId() + " , "
                + getName() + " , "
                + getExpiryDate() + " , "
                + getCost() + " , "
                + getQuantity() + " , "
                + getRealMoney() + "}";
    }
}
