package com.fafnir.CommandPattern.appliances;

public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }
    public void off() {
        System.out.println(location + " stereo is off");
    }
    public void setCD() {
        System.out.println(location + "stereo is set for CD input");
    }
    public void setVolume(int volume) {
        System.out.println(location + "stereo volume set to " + volume);
    }
}
