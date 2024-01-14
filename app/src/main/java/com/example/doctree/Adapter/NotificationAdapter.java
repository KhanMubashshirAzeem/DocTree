package com.example.doctree.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctree.DataModel.NotificationModel;
import com.example.doctree.R;

import org.w3c.dom.Text;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {
    private final Context context;
    private final List<NotificationModel> notificationModelList;

    public NotificationAdapter(Context context, List<NotificationModel> notificationModelList) {
        this.context = context;
        this.notificationModelList = notificationModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_cart,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.ViewHolder holder, int position) {
        NotificationModel notificationModel = notificationModelList.get(position);
        holder.Icon.setImageResource(notificationModel.getNotificationIcon());
        holder.Title.setText(notificationModel.getNotificationTitle());
        holder.Time.setText(notificationModel.getNotificationTime());
        holder.Message.setText(notificationModel.getNotificationMessage());

    }

    @Override
    public int getItemCount() {
        return notificationModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView Icon;
        private final TextView Title;
        private final TextView Time;
        private final TextView Message;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Icon = itemView.findViewById(R.id.noti_icon);
            Title = itemView.findViewById(R.id.noti_title);
            Time = itemView.findViewById(R.id.noti_time_ago);
            Message = itemView.findViewById(R.id.noti_msg);
        }
    }
}
