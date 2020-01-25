package com.example.Library;

public class Soundtrack {

    private int HeartRate;
    private double Time;
    private String Genre;

    public void setHeartRate(int heartRate) {
        HeartRate = heartRate;
    }

    public void setTime(double time) {
        Time = time;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }



    public int getHeartRate() {
        return HeartRate;
    }

    public double getTime() {
        return Time;
    }

    public String getGenre() {
        return Genre;
    }


}
