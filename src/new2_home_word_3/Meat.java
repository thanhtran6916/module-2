package new_home_word_3;

import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private static final int DAY_USE_PRODUCT = 7;
    public static final int EXTRA_3_DAYS_OF_USE = 3;
    public static final int EXTRA_5_DAYS_OF_USE = 5;
    public static final double DISCOUNT_50 = 0.5;
    public static final double DISCOUNT_30 = 0.3;
    public static final double DISCOUNT_10 = 0.1;
    private int manufacturingDay = getManufacturingDate().getDayOfMonth();
    private int manufacturingMonth = getManufacturingDate().getMonthValue();
    private int manufacturingYear = getManufacturingDate().getYear();
    private int expiryDay = getExpiryDate().getDayOfMonth();
    private int expiryMonth = getExpiryDate().getMonthValue();
    private int expiryYear = getExpiryDate().getYear();
    private double weight;

    protected Meat() {

    }

    protected Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    protected LocalDate getExpiryDate() {
        int dayExpiry = manufacturingDay + DAY_USE_PRODUCT;
        return LocalDate.of(manufacturingYear, manufacturingMonth, dayExpiry);
    }

    
    @Override
    protected double getAmount() {
        return getCost() * weight;
    }

    @Override
    public double getRealMoney() {
        double realMoney = 0;
        int nowDay = LocalDate.now().getDayOfMonth();
        int nowMonth = LocalDate.now().getMonthValue();
        int nowYear = LocalDate.now().getYear();
        boolean sameYear = nowYear == expiryYear;
        boolean sameMonth = nowMonth == expiryMonth;
        if (sameYear && sameMonth && expiryDay - nowDay <= EXTRA_3_DAYS_OF_USE) {
            realMoney = getAmount() - getAmount() * DISCOUNT_50;
        } else if (sameYear && sameMonth && expiryDay - nowDay <= EXTRA_5_DAYS_OF_USE) {
            realMoney = getAmount()- getAmount() * DISCOUNT_30;
        } else {
            realMoney =getAmount() - getAmount() * DISCOUNT_10;
        }
        
        return realMoney;
    }

    @Override
    public String toString() {
        return "{" + getId() + " , "
                + getName() + " , "
                + getExpiryDate() + " , "
                + getCost() + " , "
                + getWeight() + " , "
                + getRealMoney() + "}";
    }
}
