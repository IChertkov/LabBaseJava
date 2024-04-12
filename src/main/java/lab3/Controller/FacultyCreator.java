package org.example.Controller;

import org.example.model.Faculty;
import org.example.model.University;

import java.util.Scanner;

public class FacultyCreator extends UniversityCreator implements Creator {
    @Override
    public void create() {
        System.out.println("Введіть назву факультету: ");

        Scanner sc = new Scanner(System.in);
        Faculty name = new Faculty();
        name.setName(sc.nextLine());
        System.out.println("Назва факультету: " + name.getname());

        System.out.println("Введіть кільість студентів факультету: ");

        Faculty students = new Faculty();
        Scanner scstud = new Scanner(System.in);
        students.setCountOfStudents(scstud.nextInt());
        System.out.println("Кількість студентів факультету: " + students.getCountOfStudents());
    }
}
