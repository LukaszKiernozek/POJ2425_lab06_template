package com.pjatk.objects;
import java.util.ArrayList;
import java.util.Objects;

public class Address {
    private int id;
    private String city;
    private String postalCode;
    private ArrayList<String> addressLines = new ArrayList<>();

    public Address(int id, String city, String postalCode) {
        this.id = id;
        this.city = city;
        this.postalCode = postalCode;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }
    public ArrayList<String> getAddressLines() { return addressLines; }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Address address = (Address) other;
        return id == address.id &&
                Objects.equals(city, address.city) &&
                Objects.equals(postalCode, address.postalCode) &&
                Objects.equals(addressLines, address.addressLines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(id).append(", ").append(city).append(", ").append(postalCode).append(", {");
        for (int i = 0; i < addressLines.size(); i++) {
            sb.append(addressLines.get(i));
            if (i < addressLines.size() - 1) sb.append(", ");
        }
        sb.append("})");
        return sb.toString();
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, city, postalCode, addressLines);
    }
}
