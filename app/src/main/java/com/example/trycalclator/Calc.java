package com.example.trycalclator;

public interface Calc {
    String getCurrentDisplayString();

    void appendDigit(int digit);
    void addDecimalPoint();
    void clear();
    void applyOperator(String operator);
}

