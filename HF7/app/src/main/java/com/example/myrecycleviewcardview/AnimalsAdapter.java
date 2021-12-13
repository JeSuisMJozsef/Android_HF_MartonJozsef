package com.example.myrecycleviewcardview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.bumptech.glide.Glide;

public class AnimalsAdapter  extends RecyclerView.Adapter<AnimalsAdapter.VH> {

    private Context context;
    private List<Animal> animals;

    public AnimalsAdapter(Context context, List<Animal> animals) {
        this.context = context;
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalsAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new VH(itemView,context);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalsAdapter.VH holder, int position) {
        Animal animal=animals.get(position);
        holder.rootView.setTag(animal);
        holder.animName.setText(animal.getName());
        holder.animAge.setText("Age: "+String.valueOf(animal.getAge()));
        holder.animInfo.setText(animal.getInfo());
        Glide.with(context).load(animal.getmThumbnailDrawable()).centerCrop().into(holder.animImg);

    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
    public class VH extends RecyclerView.ViewHolder{
        final View rootView;
        final ImageView animImg;
        final TextView animName;
        final TextView animInfo;
        final TextView animAge;

        public VH(View itemView, final Context context) {
            super(itemView);
            rootView = itemView;
            animImg = (ImageView)itemView.findViewById(R.id.image);
            animName = (TextView)itemView.findViewById(R.id.name);
            animInfo = (TextView)itemView.findViewById(R.id.info);
            animAge = (TextView)itemView.findViewById(R.id.age);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Animal animal = (Animal) v.getTag();
                    if (animal != null) {
                        Intent i = new Intent(context, Details.class);
                        i.putExtra("EXTRA_ANIMAL", animal);
                        context.startActivity(i);
                    }
                }
            });
        }
    }

}
