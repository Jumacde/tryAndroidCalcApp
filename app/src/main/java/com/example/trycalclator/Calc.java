package com.example.trycalclator;

public interface Calc {
    float getNum();
    void setNum(float num);
    float getI1();
    void setI1(float i1);
    int getInt_num();
    void setInt_num(int int_num);
    int getM();
    void setM(int m);
    int getN();
    void setN(int n);

    String getCurrentDisplayString();
    void setCurrentDisplayString(String currentDisplayString);
    String getCurrentOperator();
    void setCurrentOperator(String currentOperator);
    boolean getWaitingForNewNumber();
    void setWaitingForNewNumber(boolean waitingForNewNumber);
    boolean getHasDecimalPoint();
    void setHasDecimalPoint(boolean hasDecimalPoint);

    // input number
    void appendDigit(int digit);
    // input decimal number
    void addDecimalPoint();
    // clear method
    void clear();
    // apply operators
    void applyOperator(String operator);
}
