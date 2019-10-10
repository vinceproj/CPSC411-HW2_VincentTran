/*
Vincent Tran
891036956
CPSC 411
HW Assignment #2
*/

package com.example.project2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.example.project2.Adapter.SummaryListAdapter;
import com.example.project2.Model.CourseEnrollment;
import com.example.project2.Model.Student;
import com.example.project2.Model.StudentDB;

import java.util.ArrayList;

public class StudentActivity extends Activity {

    protected ListView mSummaryView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.student_list_lv);
        createStudentObjects();

        mSummaryView = findViewById(R.id.summary_list_id);
        SummaryListAdapter ad = new SummaryListAdapter();
        mSummaryView.setAdapter(ad);
    }

    protected void createStudentObjects(){

        ArrayList<Student> students = new ArrayList<>();

        Student student = new Student("Vincent", "Tran", 891036956);
        ArrayList<CourseEnrollment> courseList = new ArrayList<CourseEnrollment>();
        courseList.add(new CourseEnrollment("CPSC411", "A"));
        courseList.add(new CourseEnrollment("CPSC454", "A"));
        student.setCourseList(courseList);
        students.add(student);


        student = new Student("Ari", "Arcebal", 891096024);
        courseList = new ArrayList<CourseEnrollment>();
        courseList.add(new CourseEnrollment("CPSC411", "A"));
        courseList.add(new CourseEnrollment("CPSC454", "A"));
        student.setCourseList(courseList);
        students.add(student);


        StudentDB.getInstance().setStudentList(students);

    }
}
