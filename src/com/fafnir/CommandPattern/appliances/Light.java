package com.fafnir.CommandPattern.appliances;

public class Light {
    private String location;

    public Light(String lightName) {
        this.location = lightName;
    }

    public void on() {
        System.out.println(location + " light on");
    }
    public void off() {
        System.out.println(location + " light off");
    }
}
