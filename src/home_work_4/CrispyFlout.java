package home_work_4;

import java.time.LocalDate;

public class CrispyFlout extends Material{
    int quantity;

    public CrispyFlout() {

    }

    public CrispyFlout(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return LocalDate.of(getManufacturingDate().getYear() + 1, getManufacturingDate().getMonthValue(), getManufacturingDate().getDayOfMonth());
    }
}
