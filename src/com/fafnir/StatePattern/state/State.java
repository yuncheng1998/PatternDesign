package com.fafnir.StatePattern.state;

public interface State {
    // 投入硬币
    void insertCoin();
    // 退还硬币
    void ejectCoin();
    // 转动手柄
    void turnCrank();
    // 发放糖果
    void dispense();
    // 显示状态
    void printState();
}
