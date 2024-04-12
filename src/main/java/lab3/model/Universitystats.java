package org.example.model;

public abstract class Universitystats {

    private String name;

    private int СountOfStudents;

    public void setCountOfStudents(int СountOfStudents) {
        this.СountOfStudents = СountOfStudents;

    }

    public int getCountOfStudents() {
        return СountOfStudents;
    }

    public String getname() {

        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

}
