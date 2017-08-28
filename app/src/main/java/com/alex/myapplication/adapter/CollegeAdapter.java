package com.alex.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alex.myapplication.Model.College;
import com.alex.myapplication.R;

import java.util.ArrayList;

/**
 * Created by aasantos4 on 28/08/2017.
 */

public class CollegeAdapter extends RecyclerView.Adapter<CollegeAdapter.CollegeViewHolder> {
    ArrayList<College> colleges = new ArrayList<College>();

    public CollegeAdapter(ArrayList<College> colleges) {
        this.colleges = colleges;
    }


    @Override
    public CollegeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carditem_layout,
                parent, false);
        CollegeViewHolder collegeViewHolder = new CollegeViewHolder(view);
        return collegeViewHolder;
    }

    @Override
    public void onBindViewHolder(CollegeViewHolder holder, int position) {
        College college = colleges.get(position);
        holder.imgLogo.setImageResource(college.getLogo());
        holder.tvCollege.setText(college.getCollege());
        holder.tvPatron.setText(college.getPatron());
        holder.tvBuilding.setText(college.getBuilding());
    }

    @Override
    public int getItemCount() {
            return colleges.size();
        }


        public static class CollegeViewHolder extends RecyclerView.ViewHolder {

            ImageView imgLogo;
            TextView tvCollege, tvPatron, tvBuilding;

            public CollegeViewHolder(View itemView) {
                super(itemView);
                imgLogo = (ImageView) itemView.findViewById(R.id.iv_logo);
            tvCollege = (TextView) itemView.findViewById(R.id.tv_college);
            tvPatron = (TextView) itemView.findViewById(R.id.tv_patron);
            tvBuilding = (TextView) itemView.findViewById(R.id.tv_building);



        }
    }
}
