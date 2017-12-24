package com.sarahhanley.ifoster.models;

public class Preference {
    private int id;
    private boolean catFriendly;
    private boolean kidFriendly;
    private boolean dogFriendly;
    private String other;

    public Preference() {}

    public Preference(boolean catFriendly, boolean kidFriendly, boolean dogFriendly) {
        this.catFriendly = catFriendly;
        this.kidFriendly = kidFriendly;
        this.dogFriendly = dogFriendly;
    }

    public int getId() {
        return id;
    }

    public boolean isCatFriendly() {
        return catFriendly;
    }

    public void setCatFriendly(boolean catFriendly) {
        this.catFriendly = catFriendly;
    }

    public boolean isKidFriendly() {
        return kidFriendly;
    }

    public void setKidFriendly(boolean kidFriendly) {
        this.kidFriendly = kidFriendly;
    }

    public boolean isDogFriendly() {
        return dogFriendly;
    }

    public void setDogFriendly(boolean dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}