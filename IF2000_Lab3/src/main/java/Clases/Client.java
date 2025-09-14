/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author eitel
 */
public class Client {
    
    private final String idNumber; // nacional ID (cedula)
    private String name;
    private String phone;
    private String address;

    public Client(String idNumber, String name, String phone, String address) {
        this.idNumber = idNumber;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // getters
    public String getIdNumber() { return idNumber; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    // setters (optional)
    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return String.format("Client[id=%s, name=%s, phone=%s, address=%s]",
                idNumber, name, phone, address);
    }
}
