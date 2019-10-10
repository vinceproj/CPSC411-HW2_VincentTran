package com.example.project2.Model;

public class CourseEnrollment {

    protected String mCourseID;
    protected String mGrade;

    public String getCourseID() {
        return mCourseID;
    }

    public void setCourseID(String courseID) {
        mCourseID = courseID;
    }

    public String getGrade() {
        return mGrade;
    }

    public void setGrade(String grade) {
        mGrade = grade;
    }

    public CourseEnrollment(String ID, String grade){
        mCourseID = ID;
        mGrade = grade;
    }
}
