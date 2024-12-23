package me.yeunikey.assignment.entities;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Person> persons = new ArrayList<>();

    public School() {
    }

    public School(String name, List<Person> persons) {
        this.name = name;
        this.persons = persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("School name - ").append(name).append("\n");
        for (Person person : persons) {
            sb.append(person.toString()).append("\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

}
