package com.example.project2.Model;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    private ArrayList<Student> mStudentList;

    static public StudentDB getInstance() { return ourInstance;}

    private StudentDB(){createStudentObjects();}

    public ArrayList<Student> getStudentList(){return mStudentList;}

    public void setStudentList(ArrayList<Student> studentList){mStudentList = studentList;}

    protected void createStudentObjects(){

        mStudentList = new ArrayList<Student>();

        Student student = new Student("Vincent", "Tran", 891036956);
        ArrayList<CourseEnrollment> courseList = new ArrayList<CourseEnrollment>();
        courseList.add(new CourseEnrollment("CPSC411", "A"));
        courseList.add(new CourseEnrollment("CPSC454", "A"));
        student.setCourseList(courseList);
        mStudentList.add(student);


        student = new Student("Ari", "Arcebal", 891096024);
        courseList = new ArrayList<CourseEnrollment>();
        courseList.add(new CourseEnrollment("CPSC411", "A"));
        courseList.add(new CourseEnrollment("CPSC454", "A"));
        student.setCourseList(courseList);
        mStudentList.add(student);
    }
}


