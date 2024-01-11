package com.example.doctree.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctree.DataModel.TopDoctorModel;
import com.example.doctree.R;

import java.util.List;

public class TopDoctorsAdapter extends RecyclerView.Adapter<TopDoctorsAdapter.RecyclerVHolder> {
    private final Context context;
    private final List<TopDoctorModel> doctorData; // Fix: Should be List<TopDoctorModel>

    public TopDoctorsAdapter(Context context, List<TopDoctorModel> doctorData) {
        this.context = context;
        this.doctorData = doctorData;
    }

    @NonNull
    @Override
    public RecyclerVHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_doctor_card, parent, false);
        return new RecyclerVHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVHolder holder, int position) {
        TopDoctorModel model = doctorData.get(position);
        holder.doctorName.setText(model.getDoc_name());
        holder.doctorType.setText(model.getDoc_type());
        holder.doctorPhoto.setImageResource(model.getDoc_photo());
    }

    @Override
    public int getItemCount() {
        return doctorData.size();
    }

    public static class RecyclerVHolder extends RecyclerView.ViewHolder {
        private final TextView doctorName;
        private final TextView doctorType;
        private final ImageView doctorPhoto;

        public RecyclerVHolder(@NonNull View itemView) {
            super(itemView);
            doctorName = itemView.findViewById(R.id.doctor_name); // Fix: Replace with actual ID
            doctorType = itemView.findViewById(R.id.doctor_type); // Fix: Replace with actual ID
            doctorPhoto = itemView.findViewById(R.id.doctor_photo); // Fix: Replace with actual ID
        }
    }
}
