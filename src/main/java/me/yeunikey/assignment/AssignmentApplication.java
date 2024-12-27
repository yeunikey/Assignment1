package me.yeunikey.assignment;

import me.yeunikey.assignment.entities.Person;
import me.yeunikey.assignment.entities.School;
import me.yeunikey.assignment.entities.Student;
import me.yeunikey.assignment.entities.Teacher;
import me.yeunikey.assignment.utils.InputUtil;
import me.yeunikey.starter.Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class AssignmentApplication implements Application {

    private School school = new School();

    @Override
    public void onStart() {

        try {
            loadTeachers();
            loadStudents();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        }

        System.out.println("========- Test 1 / All school members -========");

        /* Test 1 | Print all School members */
        for (Person person : school.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("========- Test 2 / Calculate GPA -========");

        /* Test 2 | Print all Student gpa */
        for (Person person : school.getPersons()) {
            if (person instanceof Student student) {
                System.out.println(student);
                System.out.println("GPA: " + student.calculateGPA());
            }
        }

        System.out.println();
        System.out.println("========- Test 3 / Give raise method -========");

        /* Test 3 | Give raise method */
        for (Person person : school.getPersons()) {
            if (person instanceof Teacher teacher) {

                if (teacher.getYearsOfExperience() < 10) {
                    continue;
                }

                System.out.println(teacher);
                int from = teacher.getSalary();
                teacher.giveRaise(25);
                int to = teacher.getSalary();
                System.out.println("Give raise from " + from + " to " + to);

            }
        }

    }

    public void loadStudents() throws FileNotFoundException {
        File file = new File("D:\\projects\\other\\Assignment1\\src\\main\\resources\\students.txt");
        List<Student> students = InputUtil.loadStudents(file);

        school.getPersons().addAll(students);
    }

    public void loadTeachers() throws FileNotFoundException {
        File file = new File("D:\\projects\\other\\Assignment1\\src\\main\\resources\\teachers.txt");
        List<Teacher> teachers = InputUtil.loadTeachers(file);

        school.getPersons().addAll(teachers);
    }

}
