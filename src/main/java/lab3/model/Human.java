package org.example.model;

public class Human {
    private String name;

    private String lastname;

    private String patronymic;

    private Sex sex;

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;

    }

    public String getLastname() {
        return lastname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;

    }

    public String getPatronymic() {
        return patronymic;
    }

}
