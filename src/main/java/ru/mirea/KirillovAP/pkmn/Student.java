package ru.mirea.KirillovAP.pkmn;

import java.io.Serializable;

public class Student implements Serializable {
    private String firstName;
    private String surName;
    private String familyName;
    private String group;


    public Student(String firstName, String surName, String familyName, String group) {
        this.firstName = firstName;
        this.surName = surName;
        this.familyName = familyName;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
