package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListSiswa extends RecyclerView.Adapter<AdapterListSiswa.ViewHolder> {

    private List<ModelSiswa> items;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public AdapterListSiswa(List<ModelSiswa> items, Context context) {
        this.items = items;
        this.context = context;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ModelSiswa currentSiswa = items.get(position);

        holder.tvName.setText(currentSiswa.getNama());
        holder.tvNumber.setText(currentSiswa.getNoAbsen());
        Glide.with(context)
                .load(currentSiswa.getImage())
                .placeholder(R.drawable.profile)
                .error(R.drawable.error)
                .into(holder.profilePicture);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(currentSiswa);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvNumber;
        ImageView profilePicture;

        ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvNumber = itemView.findViewById(R.id.tvNum);
            profilePicture = itemView.findViewById(R.id.imageView);
        }
    }

    // Interface untuk menangani klik item
    public interface OnItemClickListener {
        void onItemClick(ModelSiswa currentSiswa);
    }
}
