package com.example.a1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DateItemAdapter extends RecyclerView.Adapter<DateItemAdapter.DateViewHolder> {

    private Context context;
    private List<String> dateList;
    private int selectedPosition = -1;
    private OnDateClickListener onDateClickListener;

    // Interface to handle date click events
    public interface OnDateClickListener {
        void onDateClick(String date);
    }

    public DateItemAdapter(Context context, List<String> dateList, OnDateClickListener onDateClickListener) {
        this.context = context;
        this.dateList = dateList;
        this.onDateClickListener = onDateClickListener;
    }

    @NonNull
    @Override
    public DateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.date_item, parent, false);
        return new DateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DateViewHolder holder, @SuppressLint("RecyclerView") int position) {
        String date = dateList.get(position);
        holder.dateTextView.setText(date);

        if (selectedPosition == position) {
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.dark_blue));
            holder.dateTextView.setTextColor(context.getResources().getColor(R.color.white));
        } else {
            holder.itemView.setBackgroundColor(context.getResources().getColor(android.R.color.transparent));
            holder.dateTextView.setTextColor(context.getResources().getColor(R.color.black));
        }

        holder.itemView.setOnClickListener(v -> {
            selectedPosition = position;
            notifyDataSetChanged();
            onDateClickListener.onDateClick(date);
        });
    }

    @Override
    public int getItemCount() {
        return dateList.size();
    }

    public static class DateViewHolder extends RecyclerView.ViewHolder {
        TextView dateTextView;

        public DateViewHolder(@NonNull View itemView) {
            super(itemView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
        }
    }
}
