package com.fafnir.SingletonPattern;

public enum SingleTon {
    INSTANCE;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SingleTon firstSingleTon = SingleTon.INSTANCE;
        firstSingleTon.setName("First");
        System.out.println(firstSingleTon.getName());
        SingleTon secondSingleTon = SingleTon.INSTANCE;
        secondSingleTon.setName("Second");
        System.out.println("First: " + firstSingleTon.getName() + "," + firstSingleTon.toString());
        System.out.println("Second:" + secondSingleTon.getName() + "," + secondSingleTon.toString());

    }
}
