package home_word_2;

public class Hotel {
    private Customer[] arrCustomer = new Customer[0];
    private String[] typeRoom = {"vip", "normal"};
    private int[] rateMoney = {200, 150};

    public Hotel() {

    }

    public Hotel(Customer[] arrCustomer, String[] typeRoom, int[] rateMoney) {
        this.arrCustomer = arrCustomer;
        this.typeRoom = typeRoom;
        this.rateMoney = rateMoney;
    }

    public Customer[] getArrCustomer() {
        return this.arrCustomer;
    }

    public void setArrCustomer(Customer[] arrCustomer) {
        this.arrCustomer = arrCustomer;
    }

    public String[] getTypeRoom() {
        return typeRoom;
    }

    public int[] getRateMoney() {
        return rateMoney;
    }
}
