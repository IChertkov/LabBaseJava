package org.example;

import org.example.Controller.FacultyCreator;
import org.example.Controller.GroupCreator;
import org.example.Controller.StudentCreator;
import org.example.Controller.UniversityCreator;

public class Run {
    public static void main(String[] args) {
        createTypycalUniversity();
    }

    public static void createTypycalUniversity() {
        UniversityCreator Uni = new UniversityCreator();
        Uni.create();
        FacultyCreator Fac = new FacultyCreator();
        Fac.create();
        GroupCreator Group = new GroupCreator();
        Group.create();
        StudentCreator student = new StudentCreator();
        student.create();
    }
}
