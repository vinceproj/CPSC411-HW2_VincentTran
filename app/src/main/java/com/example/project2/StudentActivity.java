/*
Vincent Tran
891036956
CPSC 411
HW Assignment #2
*/

package com.example.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project2.Adapter.SummaryListAdapter;
import com.example.project2.Model.CourseEnrollment;
import com.example.project2.Model.Student;
import com.example.project2.Model.StudentDB;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {

    //Set vars for long term use
    protected ListView mSummaryView;
    protected SummaryListAdapter ad;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set view
        setContentView(R.layout.student_list_lv);

        //Use adapter to set view with content
        mSummaryView = findViewById(R.id.summary_list_id);
        ad = new SummaryListAdapter();
        mSummaryView.setAdapter(ad);
    }

    //onStart update view with changes to StudentDB
    @Override
    protected void onStart(){
    ad.notifyDataSetChanged();
    super.onStart();
    }

    //Create menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.student_activity_menu, menu);
        return true;
    }

    //Define actions for menu
   @Override
   public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.action_Add){
            Intent intent = new Intent(StudentActivity.this, SummaryLVActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
   }


}
