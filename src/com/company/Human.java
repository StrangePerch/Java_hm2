package com.company;

public class Human {
    private String surname;
    private String lastname;
    private int age;

    public Human(String surname, String lastname, int age)
    {
        this.surname = surname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return surname + " " + lastname + "(" + age + ")";
    }
}
