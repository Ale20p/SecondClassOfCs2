package org.example;

public class Student {
    private String id;
    private String collegeName;
    private int age;
    private int studentID;

    public Student(String id, String collegeName, int age, int studentID) {
        this.id = id;
        this.collegeName = collegeName;
        this.age = age;
        this.studentID = studentID;
    }

    void display() {
        System.out.printf("name: %s, college name: %s, age: %d, student id: %d", id, collegeName, age, studentID);
    }
}
