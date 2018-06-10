package com.fafnir.SingletonPattern;

public class Singleton {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boiled();
        chocolateBoiler.drain();
    }
}
