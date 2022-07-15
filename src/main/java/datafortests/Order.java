package datafortests;

public class Order {

    private String name;
    private String secondName;
    private String address;
    private String metroStation;
    private String phone;

    public String getName() {
        return name;
    }

    public String getSecondName() {

        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public String getMetroStation() {
        return metroStation;
    }

    public String getPhone() {
        return phone;
    }

    public Order(String name, String secondName, String address, String metroStation, String phone) {
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.metroStation = metroStation;
        this.phone = phone;

    }

}