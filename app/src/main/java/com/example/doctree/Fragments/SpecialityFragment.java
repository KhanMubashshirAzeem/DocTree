package com.example.doctree.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctree.Adapter.SpecialityAdapter;
import com.example.doctree.DataModel.SpecialityModel;
import com.example.doctree.R;

import java.util.ArrayList;
import java.util.List;

public class SpecialityFragment extends Fragment {

    private RecyclerView recyclerView;
    private SpecialityAdapter adapter;
    private List<SpecialityModel> specialityList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_speciality, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        specialityList = new ArrayList<>();

        // Populate your data here
        for (int i = 0; i < 10; i++) {
            SpecialityModel specialityModel = new SpecialityModel();


            switch (i) {
                case 0:
                    specialityModel.setSpecialityIn("Skins and\nhair");
                    specialityModel.setSymbol(R.drawable.skin); // Replace with your drawable resource
                    specialityModel.setSymbolBg(R.color.blue); // Replace with your color resource
                    specialityModel.setCardBg(R.color.light_blue); // Replace with your drawable resource
                    break;
                case 1:
                    specialityModel.setSpecialityIn("Child Specialist");
                    specialityModel.setSymbol(R.drawable.child_specialist); // Replace with your drawable resource
                    specialityModel.setSymbolBg(R.color.icon_orange1); // Replace with another color resource
                    specialityModel.setCardBg(R.color.trans_icon_orange1); // Replace with another drawable resource
                    break;
                case 2:
                    specialityModel.setSpecialityIn("Women's Health");
                    specialityModel.setSymbol(R.drawable.women_health); // Replace with your drawable resource
                    specialityModel.setSymbolBg(R.color.icon_orange2); // Replace with another color resource
                    specialityModel.setCardBg(R.color.trans_icon_orange2); // Replace with another drawable resource
                    break;
                case 3:
                    specialityModel.setSpecialityIn("Dental Care");
                    specialityModel.setSymbol(R.drawable.teath_icon); // Replace with your drawable resource
                    specialityModel.setSymbolBg(R.color.icon_pink); // Replace with another color resource
                    specialityModel.setCardBg(R.color.trans_icon_pink); // Replace with another drawable resource
                    break;
                case 4:
                    specialityModel.setSpecialityIn("General Physician");
                    specialityModel.setSymbol(R.drawable.general_physician); // Replace with your drawable resource
                    specialityModel.setSymbolBg(R.color.grey); // Replace with another color resource
                    specialityModel.setCardBg(R.color.trans_grey); // Replace with another drawable resource
                    break;
                case 5:
                    specialityModel.setSpecialityIn("Eye Specialist");
                    specialityModel.setSymbol(R.drawable.ear_nose); // Replace with your drawable resource
                    specialityModel.setSymbolBg(R.color.lite_blue); // Replace with another color resource
                    specialityModel.setCardBg(R.color.trans_lite_blue); // Replace with another drawable resource
                    break;
                case 6:
                    specialityModel.setSpecialityIn("Ear Nose");
                    specialityModel.setSymbol(R.drawable.eye_specialist); // Replace with your drawable resource
                    specialityModel.setSymbolBg(R.color.lite_blue); // Replace with another color resource
                    specialityModel.setCardBg(R.color.trans_lite_blue); // Replace with another drawable resource
                    break;
                case 7:
                    specialityModel.setSpecialityIn("Sex Specialist");
                    specialityModel.setSymbol(R.drawable.sex_specialist); // Replace with your drawable resource
                    specialityModel.setSymbolBg(R.color.lite_green); // Replace with another color resource
                    specialityModel.setCardBg(R.color.trans_lite_green); // Replace with another drawable resource
                    break;
                case 8:
                    specialityModel.setSpecialityIn("Homoeopath");
                    specialityModel.setSymbol(R.drawable.homopethy); // Replace with your drawable resource
                    specialityModel.setSymbolBg(R.color.low_green); // Replace with another color resource
                    specialityModel.setCardBg(R.color.low_trans_green); // Replace with another drawable resource
                    break;

                // Add more cases as needed
                default:
                    specialityModel.setSymbolBg(R.color.default_color);
                    specialityModel.setCardBg(R.color.default_color);
                    break;
            }

            specialityList.add(specialityModel);
        }


        adapter = new SpecialityAdapter(requireContext(), specialityList);
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2)); // Change the span count as needed
        recyclerView.setAdapter(adapter);

        return view;
    }
}
