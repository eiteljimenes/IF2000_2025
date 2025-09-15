package Clases;

/**
 * Client: representa un cliente del banco.
 */
public class Client {

    private final String idNumber; // cédula
    private String name;
    private String phone;
    private String address;

    public Client(String idNumber, String name, String phone, String address) {
        this.idNumber = idNumber;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getIdNumber() { return idNumber; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return String.format("Client[id=%s, name=%s, phone=%s, address=%s]",
                idNumber, name, phone, address);
    }
}
