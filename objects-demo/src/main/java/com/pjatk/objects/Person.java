package com.pjatk.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Person(int id, String name, LocalDate dateOfBirth){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public Person copy(){
        Person copy = new Person(this.id, this.name, this.dateOfBirth);
        copy.addresses = new ArrayList<>(this.addresses);
        return copy;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public ArrayList<Address> getAddresses() { return addresses; }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Person person = (Person) other;
        return id == person.id &&
                Objects.equals(name, person.name) &&
                Objects.equals(dateOfBirth, person.dateOfBirth) &&
                Objects.equals(addresses, person.addresses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(id).append(", ").append(name).append(", ").append(dateOfBirth).append(")\n");
        sb.append("Adresy:\n");
        for (Address address : addresses) {
            sb.append(address.toString()).append("\n");
        }
        return sb.toString();
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirth, addresses);
    }

}
