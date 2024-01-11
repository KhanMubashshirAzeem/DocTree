package com.example.doctree.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctree.Adapter.DocUVisitedAdapter;
import com.example.doctree.Adapter.SpecialityAdapter;
import com.example.doctree.Adapter.TopDoctorsAdapter;
import com.example.doctree.DataModel.DocUVisitedModel;
import com.example.doctree.DataModel.SpecialityModel;
import com.example.doctree.DataModel.TopDoctorModel;
import com.example.doctree.R;

import java.util.ArrayList;
import java.util.List;
public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView recyclerViewCategory;
    private RecyclerView recyclerDocUVis;
    private SpecialityAdapter specialityAdapter;
    private TopDoctorsAdapter topDoctorsAdapter;
    private DocUVisitedAdapter docUVisitedAdapter;
    private List<DocUVisitedModel> docUVisitedModelList; // Corrected variable name
    private List<SpecialityModel> specialityList;
    private List<TopDoctorModel> topDoctorModelList;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        initViews();
        populateCategory();
        populateTopDoctors();
        DoctorUVisited();

        TextView seeAllCategory = view.findViewById(R.id.seeAllCategory);
        seeAllCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSpecialityFragment();
            }
        });

        return view;
    }

    private void initViews() {
        recyclerViewCategory = view.findViewById(R.id.recycle_view_category);
        recyclerView = view.findViewById(R.id.recycler_view_top_doctor);
        recyclerDocUVis = view.findViewById(R.id.recycler_view_docUVis);
    }

    private void navigateToSpecialityFragment() {
        SpecialityFragment specialityFragment = new SpecialityFragment();
        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, specialityFragment)
                    .addToBackStack(null)
                    .commit();
        }
    }

    private void DoctorUVisited() {
        docUVisitedModelList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            DocUVisitedModel docUVisitedModel1 = new DocUVisitedModel();
            switch (i) {
                case 0:
                    docUVisitedModel1.setDocName("Patrick Aaron Gonzalez");
                    docUVisitedModel1.setDocType("Orthodontist");
                    docUVisitedModel1.setDocImg(R.drawable.doctor_1);
                    break;
                case 1:
                    docUVisitedModel1.setDocName("Patrick Aaron Gonzalez");
                    docUVisitedModel1.setDocType("Orthodontist");
                    docUVisitedModel1.setDocImg(R.drawable.doctor_5);
                    break;
                case 2:
                    docUVisitedModel1.setDocName("Patrick Aaron Gonzalez");
                    docUVisitedModel1.setDocType("Orthodontist");
                    docUVisitedModel1.setDocImg(R.drawable.doctor_3);
                    break;
                case 3:
                    docUVisitedModel1.setDocName("Aaron Gonzalez");
                    docUVisitedModel1.setDocType("Orthodontist");
                    docUVisitedModel1.setDocImg(R.drawable.doctor_4);
                    break;
                default:
                    break;
            }
            docUVisitedModelList.add(docUVisitedModel1);
        }
        docUVisitedAdapter = new DocUVisitedAdapter(requireContext(), docUVisitedModelList);
        recyclerDocUVis.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerDocUVis.setAdapter(docUVisitedAdapter);
    }

    private void populateTopDoctors() {
        topDoctorModelList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            TopDoctorModel topDoctorModel = new TopDoctorModel();
            switch (i) {
                case 0:
                    topDoctorModel.setDoc_name("Patrick Aaron Gonzalez");
                    topDoctorModel.setDoc_type("Orthodontist");
                    topDoctorModel.setDoc_photo(R.drawable.doctor_1);
                    break;
                case 1:
                    topDoctorModel.setDoc_name("Cristina Joseph Pattrick Jones");
                    topDoctorModel.setDoc_type("Orthodontist");
                    topDoctorModel.setDoc_photo(R.drawable.doctor_2);
                    break;
                case 2:
                    topDoctorModel.setDoc_name("Shawn Elizabeth Mendes");
                    topDoctorModel.setDoc_type("Orthodontist");
                    topDoctorModel.setDoc_photo(R.drawable.doctor_3);
                    break;
                case 3:
                    topDoctorModel.setDoc_name("George William Song Anderson");
                    topDoctorModel.setDoc_type("Orthodontist");
                    topDoctorModel.setDoc_photo(R.drawable.doctor_4);
                    break;
                case 4:
                    topDoctorModel.setDoc_name("Cris Steve Philander");
                    topDoctorModel.setDoc_type("Orthodontist");
                    topDoctorModel.setDoc_photo(R.drawable.doctor_5);
                    break;
                case 5:
                    topDoctorModel.setDoc_name("Patrick Gonzalez");
                    topDoctorModel.setDoc_type("Orthodontist");
                    topDoctorModel.setDoc_photo(R.drawable.doctor_1);
                    break;
                default:
                    break;
            }
            topDoctorModelList.add(topDoctorModel);
        }

        topDoctorsAdapter = new TopDoctorsAdapter(requireContext(), topDoctorModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(topDoctorsAdapter);
    }

    private void populateCategory() {
        specialityList = new ArrayList<>();

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
                default:
                    break;
            }
            specialityList.add(specialityModel);
        }

        specialityAdapter = new SpecialityAdapter(requireContext(), specialityList);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewCategory.setAdapter(specialityAdapter);
    }
}
