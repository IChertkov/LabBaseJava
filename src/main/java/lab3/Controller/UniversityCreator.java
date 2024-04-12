package org.example.Controller;

import java.util.Scanner;

import org.example.model.University;

public class UniversityCreator implements Creator {
    @Override
    public void create() {
        System.out.println("Введіть назву університету: ");

        Scanner sc = new Scanner(System.in);
        University name = new University();
        name.setName(sc.nextLine());
        System.out.println("Назва університету: " + name.getname());

        System.out.println("Введіть кільість студентів: ");

        University students = new University();
        Scanner scstud = new Scanner(System.in);
        students.setCountOfStudents(scstud.nextInt());
        System.out.println("Кількість студентів: " + students.getCountOfStudents());

        System.out.println("Введіть кількість корпусів: ");

        University frames = new University();
        Scanner scframes = new Scanner(System.in);
        frames.setCountOfFrames(scframes.nextInt());
        System.out.println("Кількість корпусів університету: " + frames.getCountOfFrames());
    }
}
