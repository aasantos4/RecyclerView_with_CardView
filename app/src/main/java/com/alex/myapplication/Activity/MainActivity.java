package com.alex.myapplication.Activity;

import android.content.ReceiverCallNotAllowedException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.alex.myapplication.Model.College;
import com.alex.myapplication.R;
import com.alex.myapplication.adapter.CollegeAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<College> list = new ArrayList<College>();
    int[] college_logo = {R.drawable.iics_logo, R.drawable.engg_logo,
      R.drawable.med_logo, R.drawable.arch_logo, R.drawable.educ_logo,
      R.drawable.rehab_logo};
    String[] college, patron, building;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        college = getResources().getStringArray(R.array.colleges);
        patron = getResources().getStringArray(R.array.patron_saints);
        building = getResources().getStringArray(R.array.buildings);
        int count = 0;
        for(String name: college){
            College kolehiyo = new College(college_logo[count],
                    college[count], patron[count], building[count]);
            list.add(kolehiyo);
            count++;

        }
        recyclerView = (RecyclerView) findViewById(R.id.rvColleges);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new CollegeAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
