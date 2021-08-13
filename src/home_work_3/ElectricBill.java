package home_work_3;

public class ElectricBill {
    private Customer customer;
    private int oldIndexElectric;
    private int newIndexElectric;
    final int COST = 750;

    public ElectricBill() {

    }

    public ElectricBill(Customer customer, int oldIndexElectric, int newIndexElectric) {
        this.customer = customer;
        this.oldIndexElectric = oldIndexElectric;
        this.newIndexElectric = newIndexElectric;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldIndexElectric() {
        return oldIndexElectric;
    }

    public void setOldIndexElectric(int oldIndexElectric) {
        this.oldIndexElectric = oldIndexElectric;
    }

    public int getNewIndexElectric() {
        return newIndexElectric;
    }

    public void setNewIndexElectric(int newIndexElectric) {
        this.newIndexElectric = newIndexElectric;
    }

    public double getPayMoney() {
        return COST * (newIndexElectric - oldIndexElectric);
    }

    @Override
    public String toString() {
        return customer.toString() + " " + oldIndexElectric + " " + newIndexElectric + " " + getPayMoney();
     }
}
