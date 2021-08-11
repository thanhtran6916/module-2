package home_word_2;

import java.util.Date;

public class Customer {
    private int id;
    private String fullName;
    private int age;
    private String typeRoom;
    private int checkIn;
    private int checkOut;

    public Customer(int id, String fullName, int age, String typeRoom, int checkIn, int checkOut) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.typeRoom = typeRoom;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getAge() {
        return this.getAge();
    }

    public String getTypeRoom() {
        return this.typeRoom;
    }

    public int getCheckIn() {
        return this.checkIn;
    }

    public int getCheckOut() {
        return this.checkOut;
    }

    public String toString() {
        return fullName + " " + id + " " + " " + age + " " + typeRoom + " " + checkIn;
    }
}
