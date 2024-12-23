package me.yeunikey.assignment.entities;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private static int uniqueIdCounter = 0;

    private int studentID = uniqueIdCounter++;
    private List<Integer> grades = new ArrayList<>();

    public Student() {
    }

    public Student(String name, String surname, int age, boolean gender, List<Integer> grades) {
        super(name, surname, age, gender);
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        double sum = 0;

        for (Integer grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + ", I am a student with ID " + studentID;
    }

    public static int getUniqueIdCounter() {
        return uniqueIdCounter;
    }

    public static void setUniqueIdCounter(int uniqueIdCounter) {
        Student.uniqueIdCounter = uniqueIdCounter;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

}
