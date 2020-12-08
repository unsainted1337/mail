package com.example.mail;

public class data_get_set {
    private String name;
    private String lname;
    private String birthday;
    private int image;

    public data_get_set(String name, String lname, String birthday, int image) {
        this.name = name;
        this.lname = lname;
        this.birthday = birthday;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
