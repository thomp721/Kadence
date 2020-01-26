package com.example.Library;

public class MusicPlayerSetup {
    int heartRate;
    String musicLevel;
    public MusicPlayerSetup(String heartRate) {
        if (this.heartRate <= 100) {
            musicLevel = "resting";
        } else if (this.heartRate <= 130) {
            musicLevel = "low";
        } else if (this.heartRate > 130 && this.heartRate <= 150) {
            musicLevel = "medium";
        } else {
            musicLevel = "high";
        }
    }
    public String getMusicLevel() {
        return musicLevel;
    }
}
