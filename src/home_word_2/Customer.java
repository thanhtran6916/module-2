package home_word_2;

public class Customer {
    private int id;
    private String fullName;
    private int age;
    private String typeRoom;
    private int checkIn;

    public Customer(int id, String fullName, int age, String typeRoom, int checkIn) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.typeRoom = typeRoom;
        this.checkIn = checkIn;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return this.getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCheckIn() {
        return this.checkIn;
    }

    public void setCheckIn(int checkIn) {
        this.checkIn = checkIn;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getTypeRoom() {
        return this.typeRoom;
    }

    @Override
    public String toString() {
        return fullName + " " + id + " " + " " + age + " " + typeRoom + " " + checkIn;
    }
}
