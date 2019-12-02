package com.juliarmanumar.resepmasakan;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.sufficientlysecure.htmltextview.HtmlTextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterResep  extends RecyclerView.Adapter<AdapterResep.ResepViewHolder> {
    private Context context;
    private ArrayList<Resep> listresep;


    public AdapterResep(Context context, ArrayList<Resep> listresep) {
        this.context = context;
        this.listresep = listresep;
    }

    @NonNull
    @Override
    public AdapterResep.ResepViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resep, parent, false);

        return new ResepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterResep.ResepViewHolder holder, final int position) {

        final Resep resep = listresep.get(position);
        Glide.with(holder.itemView.getContext())
                .load(resep.getGambarResep())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imageresep);
        holder.judulresepp.setText(resep.getJudul());
        holder.isi_resepp.setText(resep.getIsi());
        holder.lihatresepp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Tampilan_Resep.class);
                intent.putExtra("judul", listresep.get(holder.getAdapterPosition()).getJudul());
                intent.putExtra("content", listresep.get(holder.getAdapterPosition()).getPenyajian());
                intent.putExtra("bahan", listresep.get(holder.getAdapterPosition()).getBahan());
                intent.putExtra("gambar", listresep.get(holder.getAdapterPosition()).getGambarResep());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return listresep.size();
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder {


        CircleImageView imageresep;
        TextView judulresepp;
        TextView isi_resepp;
        Button lihatresepp;
        TextView bahan, showresep;
        ImageView header_resep;




        public ResepViewHolder(@NonNull View itemView) {
            super(itemView);

            header_resep = itemView.findViewById(R.id.header);
            showresep = itemView.findViewById(R.id.show_resep);
            bahan = itemView.findViewById(R.id.bahan_resep);
            imageresep = itemView.findViewById(R.id.gambarresep);
            judulresepp = itemView.findViewById(R.id.judulresep);
            isi_resepp = itemView.findViewById(R.id.deskripsiresep);
            lihatresepp = itemView.findViewById(R.id.lihatresep);

        }
    }


    public void food(){

    }

}
