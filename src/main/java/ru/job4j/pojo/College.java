package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Pervushin Nikolay");
        student.setGroup("VMKS 00-2");
        student.setStart(new Date());

        System.out.println("Студент - " + student.getName());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Дата поступления: " + student.getStart());
    }
}
