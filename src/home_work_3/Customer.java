package home_work_3;

class Customer {
    private String name;
    private String address;
    private String electricMeterCode;

    public Customer() {

    }

    public Customer(String name, String address, String electricMeterCode) {
        this.name = name;
        this.address = address;
        this.electricMeterCode = electricMeterCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getElectricMeterCode() {
        return electricMeterCode;
    }

    public void setElectricMeterCode(String electricMeterCode) {
        this.electricMeterCode = electricMeterCode;
    }

    @Override
    public String toString() {
        return name + " " + address + " " + electricMeterCode;
    }
}

