package me.yeunikey.assignment.utils;

import me.yeunikey.assignment.entities.Student;
import me.yeunikey.assignment.entities.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputUtil {

    public static List<Student> loadStudents(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        List<Student> students = new ArrayList<>();

        while (scanner.hasNext()) {

            String name = scanner.next();
            String surname = scanner.next();

            int age = scanner.nextInt();
            boolean gender = scanner.next().equalsIgnoreCase("Male");

            List<Integer> grades = new ArrayList<>();

            for (String grade : scanner.nextLine().split(" ")) {
                if (grade.equalsIgnoreCase(""))
                    continue;

                grades.add(Integer.parseInt(grade));
            }

            Student student = new Student(
                    name, surname, age, gender, grades
            );
            students.add(student);

        }

        return students;
    }

    public static List<Teacher> loadTeachers(File file) {
        Scanner scanner = new Scanner(file);
        List<Teacher> teachers = new ArrayList<>();

        while (scanner.hasNext()) {

            String name = scanner.next();
            String surname = scanner.next();

            int age = scanner.nextInt();
            boolean gender = scanner.next().equalsIgnoreCase("Male");

            String subject = scanner.next();

            // todo дописать надо это

        }

        return teachers;
    }

}
