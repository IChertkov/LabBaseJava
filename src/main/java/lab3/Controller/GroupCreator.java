package org.example.Controller;

import org.example.model.Faculty;

import java.util.Scanner;

public class GroupCreator implements Creator {
    @Override
    public void create() {
        System.out.println("Введіть назву групи: ");

        Scanner sc = new Scanner(System.in);
        Faculty name = new Faculty();
        name.setName(sc.nextLine());
        System.out.println("Назва групи: " + name.getname());

        System.out.println("Введіть кільість студентів групи: ");

        Faculty students = new Faculty();
        Scanner scstud = new Scanner(System.in);
        students.setCountOfStudents(scstud.nextInt());
        System.out.println("Кількість студентів групи: " + students.getCountOfStudents());
    }
}
