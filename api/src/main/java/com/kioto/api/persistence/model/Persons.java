package com.kioto.api.persistence.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="person_id")
    private long Personid;
    @Column(name="last_name",nullable =false)
    private String lastName;
    @Column(name="first_name")
    private String firstName;
    @Column(name="age")
    private int age;

    public Persons() {
        super();
    }

    public Persons(String LastName, String FirstName, int Age) {
        super();
        this.lastName = LastName;
        this.firstName = FirstName;
        this.age = Age;
    }

    public long getPersonId() {
        return Personid;
    }

    public void setPersonId(long Personid) {
        this.Personid = Personid;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public int getAge() {
        return age;
    }

    public void setAuthor(int age) {
        this.age = age;
    }


}