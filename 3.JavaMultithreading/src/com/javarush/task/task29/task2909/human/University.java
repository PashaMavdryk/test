package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        for(Student student : students){
            if(student.getAverageGrade()==averageGrade)
                return student;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        int iMaxGrade = 0;
        for (int i = 1; i <students.size() ; i++) {
            if(students.get(i).getAverageGrade()>students.get(iMaxGrade).getAverageGrade())
                iMaxGrade = i;
        }
        return students.size()==0 ? null : students.get(iMaxGrade);
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        int iMinGrage = 0;
        for (int i = 1; i <students.size() ; i++) {
            if(students.get(i).getAverageGrade()<students.get(iMinGrage).getAverageGrade()){
                iMinGrage= i;
            }

        }
        return students.size()==0 ? null : students.get(iMinGrage);

    }
    public void expel(Student student){
        students.remove(student);
    }
}