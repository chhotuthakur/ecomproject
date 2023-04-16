package com.omkar.pw.models;

public class Customer {

    String id,name,email,phone,location,type;

    public Customer() {

//        required by firebase
    }

    public Customer(String name, String email, String phone, String location, String type) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.type = type;
        this.id =id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
