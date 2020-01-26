package com.example.Library;

public class Soundtrack {



    private String HeartRange;
    private double Time;
    private String Genre;

    public Soundtrack()
    {
        this.HeartRange = "";
        this.Time = 0;
        this.Genre = "";
    }

    public Soundtrack(String HR, double time, String genre)
    {
        this.HeartRange = HR;
        this.Time = time;
        this.Genre = genre;
    }

    public void setHeartRate(String heartRate) {
        HeartRange = heartRate;
    }

    public void setTime(double time) {
        Time = time;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }



    public String getHeartRate() {
        return HeartRange;
    }

    public double getTime() {
        return Time;
    }

    public String getGenre() {
        return Genre;
    }


}
