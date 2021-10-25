package edu.neu.cs5520firstapp;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Person> personList;

    public MyAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(itemview);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.nameText.setText(person.getName());
        holder.URLText.setText(person.getURL());


    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nameText;
        TextView URLText;


        public MyViewHolder(View item) {
            super(item);
            this.nameText = item.findViewById(R.id.textView5);
            this.URLText = item.findViewById(R.id.textView6);

        }
    }


}
