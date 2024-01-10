package com.example.doctree.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctree.DataModel.SpecialityModel;
import com.example.doctree.R;

import java.util.List;

public class CategorySpecialityAdapter extends RecyclerView.Adapter<CategorySpecialityAdapter.RecyclerViewHolder> {
    private final Context context;
    private final List<SpecialityModel> dataModelList;

    public CategorySpecialityAdapter(Context context, List<SpecialityModel> dataModelList) {
        this.context = context;
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_card, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        SpecialityModel model = dataModelList.get(position);

        holder.specialityIn.setText(model.getSpecialityIn());
        holder.symbol.setImageResource(model.getSymbol());
        holder.symbolBg.setBackgroundResource(model.getSymbolBg());
        holder.cardBg.setBackgroundResource(model.getCardBg());
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private final TextView specialityIn;
        private final ImageView symbol;
        private final View symbolBg;
        private final ImageView cardBg;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            specialityIn = itemView.findViewById(R.id.specialityIn);
            symbol = itemView.findViewById(R.id.symbol);
            symbolBg = itemView.findViewById(R.id.symbolBg);
            cardBg = itemView.findViewById(R.id.cardBg);
        }
    }
}
