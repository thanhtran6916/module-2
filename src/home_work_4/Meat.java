package home_work_4;

import java.time.LocalDate;

public class Meat extends Material{
    double weight;

    public Meat() {

    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return LocalDate.of(getManufacturingDate().getYear(), getManufacturingDate().getMonthValue(), getManufacturingDate().getDayOfMonth() + 7);
    }
}
