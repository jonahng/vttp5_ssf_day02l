package com.jonah.vttp5a_ssf_day02l.model;

public class Student {
    
    public Integer id;
    public String firstName;
    public String lastName;
    public Long birthDate;
    public String email;
    public String address;

    
    public Student(Integer id, String firstName, String lastName, Long birthDate, String email, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
    }

    
    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
                + ", email=" + email + ", address=" + address + "]";
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public Long getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
