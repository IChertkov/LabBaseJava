package org.example.Controller;

import org.example.model.Sex;
import org.example.model.Student;

public class StudentCreator implements Creator {
    @Override
    public void create() {
        Student name = new Student();
        name.setName("Illia");
        Student lastname = new Student();
        lastname.setLastname("Chertkov");
        Student patronymic = new Student();
        patronymic.setPatronymic("Olexsandrovich");

        Student sex = new Student();
        sex.setSex(Sex.MALE);

        System.out.println("Ім'я студента: " + " " + name.getName() + " " + lastname.getLastname() + " " + patronymic.getPatronymic());
        System.out.println("Стать студента: " + sex.getSex());
    }
}
