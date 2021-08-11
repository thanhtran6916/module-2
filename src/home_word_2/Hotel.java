package home_word_2;

public class Hotel {
    static private Customer[] arrCustomer;
    private String[] typeRoom = {"vip", "normal"};
    private int[] rateMoney = {150, 200};

    public Hotel() {

    }

    public Customer[] addCustomer(Customer a) {
        Customer[] newArrCustomer;
        if (arrCustomer == null) {
            arrCustomer = new Customer[1];
            newArrCustomer = new Customer[this.arrCustomer.length];
            newArrCustomer[0] = a;
        } else {
            newArrCustomer = new Customer[this.arrCustomer.length];
            System.arraycopy(arrCustomer, 0, newArrCustomer, 0, this.arrCustomer.length);
            newArrCustomer[newArrCustomer.length -1] = a;
        }
        return arrCustomer = newArrCustomer;
    }

    public void displayCustomerAll() {
        for (int i = 0; i < arrCustomer.length; i++) {
            System.out.print(this.arrCustomer[i].toString());
            System.out.println("");
        }
    }

    public Customer[] deleteCustomer(Customer a) {
        Customer[] newArrCustomer = new Customer[this.arrCustomer.length - 1];
        int index = 0;
        for (Customer value : this.arrCustomer) {
            if (a.equals(value)) {
                continue;
            }
            newArrCustomer[index] = value;
            index++;
        }
        return newArrCustomer;
    }

    public int calculateMoney(Customer a) {
        int result = 0;
        int checkIn = a.getCheckIn();
        int checkOut = a.getCheckOut();
        String typeRoom = a.getTypeRoom();
        if (typeRoom.equals(this.typeRoom[0])) {
            result = (checkOut - checkIn) * this.rateMoney[0];
        } else if (typeRoom.equals(this.typeRoom[1])){
            result = (checkOut - checkIn) * this.rateMoney[1];
        }
        return result;
    }

}
