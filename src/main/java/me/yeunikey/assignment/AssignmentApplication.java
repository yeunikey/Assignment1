package me.yeunikey.assignment;

import me.yeunikey.assignment.entities.Student;
import me.yeunikey.assignment.utils.InputUtil;
import me.yeunikey.starter.Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class AssignmentApplication implements Application {

    @Override
    public void onStart() {
        try {
            loadTeachers();
            loadStudents();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        }
    }

    public void loadStudents() throws FileNotFoundException {
        File file = new File("D:\\projects\\other\\Assignment1\\src\\main\\resources\\students.txt");
        List<Student> students = InputUtil.loadStudents(file);

        for (Student student : students) {
            System.out.println(student.toString());
        }

    }

    public void loadTeachers() {

    }

}
