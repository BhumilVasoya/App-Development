package com.example.a1;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1.SeatModel;

import java.util.List;

public class SeatAdapter extends RecyclerView.Adapter<SeatAdapter.ViewHolder> {
    private List<SeatModel> seatList;
    private OnSeatSelectedListener onSeatSelectedListener;

    public SeatAdapter(List<SeatModel> seatList, OnSeatSelectedListener onSeatSelectedListener) {
        this.seatList = seatList;
        this.onSeatSelectedListener = onSeatSelectedListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_seat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        SeatModel seat = seatList.get(position);
        holder.textViewSeat.setText(seat.getSeatNumber());
        holder.textViewSeat.setSelected(seat.isSelected());
        holder.textViewSeat.setEnabled(!seat.isUnavailable());

        holder.textViewSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!seat.isUnavailable()) {
                    seat.setSelected(!seat.isSelected());
                    notifyItemChanged(position);
                    onSeatSelectedListener.onSeatSelected();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return seatList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewSeat;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewSeat = itemView.findViewById(R.id.textViewSeat);
        }
    }

    public interface OnSeatSelectedListener {
        void onSeatSelected();
    }
}
