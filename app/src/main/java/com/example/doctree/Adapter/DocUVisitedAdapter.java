package com.example.doctree.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctree.DataModel.DocUVisitedModel;
import com.example.doctree.R;

import java.util.List;

public class DocUVisitedAdapter extends RecyclerView.Adapter<DocUVisitedAdapter.ViewHolder> {

    private final Context context;
    private final List<DocUVisitedModel> modelList;

    public DocUVisitedAdapter(Context context, List<DocUVisitedModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.doctor_you_visited,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DocUVisitedAdapter.ViewHolder holder, int position) {
        DocUVisitedModel model = modelList.get(position);

        holder.docName.setText(model.getDocName());
        holder.docType.setText(model.getDocType());
        holder.docImage.setImageResource(model.getDocImg());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView docName;
        private final TextView docType;
        private final ImageView docImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            docName = itemView.findViewById(R.id.doc_name);
            docType = itemView.findViewById(R.id.doc_type);
            docImage = itemView.findViewById(R.id.doc_image);
        }
    }
}
