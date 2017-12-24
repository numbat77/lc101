package com.sarahhanley.ifoster.models;

import java.util.Date;

public class Animal {
    private int id;
    private String name;
    private boolean adopted;
    private Human foster;
    private Human adopter;
    private Gender gender;
    private boolean altered;
    private Preference preferences;
    private Date birthdate;
    private String origin;
    private PetType petType;

    public Animal(String name, PetType petType) {
        this.name = name;
        this.petType = petType;
    }

    public Animal() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    public Human getFoster() {
        return foster;
    }

    public void setFoster(Human foster) {
        this.foster = foster;
    }

    public Human getAdopter() {
        return adopter;
    }

    public void setAdopter(Human adopter) {
        this.adopter = adopter;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isAltered() {
        return altered;
    }

    public void setAltered(boolean altered) {
        this.altered = altered;
    }

    public Preference getPreferences() {
        return preferences;
    }

    public void setPreferences(Preference preferences) {
        this.preferences = preferences;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
