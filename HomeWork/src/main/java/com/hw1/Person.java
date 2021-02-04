package com.hw1;

class Person {
    String fitsName;
    String lastName;
    String middleName;
    String country;
    String address;
    String phone;
    int age;
    String gender;

    public Person(){}

    public String getFitsName() {
        return fitsName;
    }

    public void setFitsName(String fitsName) {
        this.fitsName = fitsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public class Builder{
        public Builder(){}

        public Builder setFirstName(String firstName){
            Person.this.fitsName = fitsName;
            return this;
        }

        public Builder setAgeName(int age){
            Person.this.age = age;
            return this;
        }

        public Builder setAddressName(String address){
            Person.this.address = address;
            return this;
        }

        public Builder setCountry(String country){
            Person.this.country = country;
            return this;
        }

        public Builder setGender(String gender){
            Person.this.gender = gender;
            return this;
        }

        public Builder setLastName(String lastName){
            Person.this.lastName = lastName;
            return this;
        }

        public Builder setMiddleName(String middleName){
            Person.this.middleName = middleName;
            return this;
        }

        public Builder setPhone(String phone){
            Person.this.phone = phone;
            return this;
        }

        public Person build(){
            return Person.this;
        }
    }
}

