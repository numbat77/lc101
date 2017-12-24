package com.sarahhanley.ifoster.models;

import java.util.ArrayList;

public class Human {
    private int id;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private Address address;
    private boolean foster;
    private boolean adopter;
    private Preference preferences;
    private ArrayList<Animal> ownedAnimals;

    public Human() {}

    public Human(String firstName, String lastName, int phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isFoster() {
        return foster;
    }

    public void setFoster(boolean foster) {
        this.foster = foster;
    }

    public boolean isAdopter() {
        return adopter;
    }

    public void setAdopter(boolean adopter) {
        this.adopter = adopter;
    }

    public Preference getPreferences() {
        return preferences;
    }

    public void setPreferences(Preference preferences) {
        this.preferences = preferences;
    }

    public ArrayList<Animal> getOwnedAnimals() {
        return ownedAnimals;
    }

    public void setOwnedAnimals(ArrayList<Animal> ownedAnimals) {
        this.ownedAnimals = ownedAnimals;
    }
}
