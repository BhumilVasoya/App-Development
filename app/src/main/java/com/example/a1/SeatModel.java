package com.example.a1;


public class SeatModel {
    private String seatNumber;
    private boolean isSelected;
    private boolean isUnavailable;

    public SeatModel(String seatNumber, boolean isSelected, boolean isUnavailable) {
        this.seatNumber = seatNumber;
        this.isSelected = isSelected;
        this.isUnavailable = isUnavailable;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isUnavailable() {
        return isUnavailable;
    }

    public void setUnavailable(boolean unavailable) {
        isUnavailable = unavailable;
    }
}
