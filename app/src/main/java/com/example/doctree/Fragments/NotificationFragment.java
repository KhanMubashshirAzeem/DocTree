package com.example.doctree.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doctree.Adapter.NotificationAdapter;
import com.example.doctree.DataModel.NotificationModel;
import com.example.doctree.R;

import java.util.ArrayList;
import java.util.List;


public class NotificationFragment extends Fragment {
    protected RecyclerView recyclerView;
    protected RecyclerView recyclerView2;
    private NotificationAdapter adapter;
    private List<NotificationModel> modelList;


    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_notification, container, false);

        recyclerView = view.findViewById(R.id.recycler_view_today);
        recyclerView2 = view.findViewById(R.id.recycler_view_yesterday);
        SetNotification();

        return view;
    }

    private void SetNotification() {
        modelList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            NotificationModel model = new NotificationModel();
            switch (i) {
                case 0:
                    model.setNotificationIcon(R.drawable.noti_icon1);
                    model.setNotificationTitle("Remind For Serial");
                    model.setNotificationTime("11:45 pm");
                    model.setNotificationMessage("It is a long established fact that a reader\n" +
                            "and will be distracted");
                    break;
                case 1:
                    model.setNotificationIcon(R.drawable.noti_icon1);
                    model.setNotificationTitle("Remind For Serial");
                    model.setNotificationTime("11:45 pm");
                    model.setNotificationMessage("It is a long established fact that a reader\n" +
                            "and will be distracted");
                    break;
                case 2:
                    model.setNotificationIcon(R.drawable.noti_icon1);
                    model.setNotificationTitle("Remind For Serial");
                    model.setNotificationTime("11:45 pm");
                    model.setNotificationMessage("It is a long established fact that a reader\n" +
                            "and will be distracted");
                    break;
                case 3:
                    model.setNotificationIcon(R.drawable.noti_icon1);
                    model.setNotificationTitle("Remind For Serial");
                    model.setNotificationTime("11:45 pm");
                    model.setNotificationMessage("It is a long established fact that a reader\n" +
                            "and will be distracted");
                    break;
                case 4:
                    model.setNotificationIcon(R.drawable.noti_icon1);
                    model.setNotificationTitle("Remind For Serial");
                    model.setNotificationTime("11:45 pm");
                    model.setNotificationMessage("It is a long established fact that a reader\n" +
                            "and will be distracted");
                    break;
                default:
                    break;
            }
            modelList.add(model);
        }
        adapter = new NotificationAdapter(requireContext(),modelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);

        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false));
        recyclerView2.setAdapter(adapter);



    }
}