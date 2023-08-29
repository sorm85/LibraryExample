package com.ddsr.LibraryExample.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "UsersLibrary")
public class UsersLibrary {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    public UsersLibrary(String firstName, String lastName, int birthYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public UsersLibrary() {

    }

    @Column
    private int birthYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersLibrary usersLibrary = (UsersLibrary) o;
        return id == usersLibrary.id && birthYear == usersLibrary.birthYear && firstName.equals(usersLibrary.firstName) && lastName.equals(usersLibrary.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, birthYear);
    }
}
