package com.fafnir.SingletonPattern;

class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler =  new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
    void fill() {
        if (empty) {
            empty = false;
            boiled = false;
            System.out.println("原料加入完毕");
        }
    }
    void drain() {
        if (!empty && boiled) {
            empty = true;
            System.out.println("将煮过的原料排出");
        }
    }
    void boiled() {
        if (!empty && !boiled) {
            boiled = true;
            System.out.println("开始煮原料");
        }
    }
}
