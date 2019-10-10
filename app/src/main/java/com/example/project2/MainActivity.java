package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.project2.Model.CourseEnrollment;
import com.example.project2.Model.Student;
import com.example.project2.Model.StudentDB;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createStudentObjects();
        setContentView(R.layout.student_list);
        root = findViewById(R.id.student_list);

        ArrayList<Student> studentList = StudentDB.getInstance().getStudentList();
        for(int i = 0; i<studentList.size(); i++){
            Student s = studentList.get(i);

            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.student_row, root, false);

            ((TextView)row_view.findViewById(R.id.first_name)).setText(s.getFirstName());
            ((TextView)row_view.findViewById(R.id.last_name)).setText(s.getLastName());
            ((TextView)row_view.findViewById(R.id.CWID)).setText(s.getCWID().toString());
            root.addView(row_view);
        }

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
