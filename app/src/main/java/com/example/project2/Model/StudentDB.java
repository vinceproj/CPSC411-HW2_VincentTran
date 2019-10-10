package com.example.project2.Model;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    private ArrayList<Student> mStudentList;

    static public StudentDB getInstance() { return ourInstance;}

    private StudentDB(){}

    public ArrayList<Student> getStudentList(){return mStudentList;}

    public void setStudentList(ArrayList<Student> studentList){mStudentList = studentList;}
}
