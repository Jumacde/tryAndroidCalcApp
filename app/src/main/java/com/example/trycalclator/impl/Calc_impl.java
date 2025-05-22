package com.example.trycalclator.impl;

import com.example.trycalclator.Calc;

public class Calc_impl implements Calc {
    private  float num, i1;
    private int int_num;
    private int m,n;

    private String currentDisplayString;
    private String currentOperator;
    private boolean waitingForNewNumber;
    private boolean hasDecimalPoint;

    public Calc_impl() {
        clear();
    }

    // getter & setter
    @Override
    public float getNum() {
        return num;
    }

    @Override
    public void setNum(float num) {
        this.num = num;
    }

    @Override
    public float getI1() {
        return i1;
    }

    @Override
    public void setI1(float i1) {
        this.i1 = i1;
    }

    @Override
    public int getInt_num() {
        return int_num;
    }

    @Override
    public void setInt_num(int int_num) {
        this.int_num = int_num;
    }

    @Override
    public int getM() {
        return m;
    }

    @Override
    public void setM(int m) {
        this.m = m;
    }

    @Override
    public int getN() {
        return n;
    }

    @Override
    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String getCurrentDisplayString() {
        return "";
    }

    @Override
    public void setCurrentDisplayString(String currentDisplayString) {
        this.currentDisplayString = currentDisplayString;
    }

    @Override
    public String getCurrentOperator() {
        return currentOperator;
    }

    @Override
    public void setCurrentOperator(String currentOperator) {
        this.currentOperator = currentOperator;
    }

    @Override
    public boolean getWaitingForNewNumber() {
        return waitingForNewNumber;
    }

    @Override
    public void setWaitingForNewNumber(boolean waitingForNewNumber) {
        this.waitingForNewNumber = waitingForNewNumber;
    }

    @Override
    public boolean getHasDecimalPoint() {
        return hasDecimalPoint;
    }

    @Override
    public void setHasDecimalPoint(boolean hasDecimalPoint) {
        this.hasDecimalPoint = hasDecimalPoint;
    }

    //// methods ////
    // method: input number
    @Override
    public void appendDigit(int digit) {
        if (waitingForNewNumber) {
            num = digit;
            waitingForNewNumber = false;
            hasDecimalPoint = false;
            m = 0;
            n = 0;
        } else {
            if (hasDecimalPoint || m == 1) {
                n++;
                num = (float) (num + digit / Math.pow(10, n));
            } else {
                num = num * 10 + digit;
            }
        }


    }

    // method: input decimal number
    @Override
    public void addDecimalPoint() {

    }

    // method: clear
    @Override
    public void clear() {
        this.m = 0;
        this.n = 0;
        this.i1 = 0;
        this.num = 0;
        this.int_num = 0;
        this.currentOperator = "";
        this.waitingForNewNumber = true;
        this.hasDecimalPoint = false;


    }

    // method: apply operators
    @Override
    public void applyOperator(String operator) {

    }


    ///// method only at this program
    private void calculateResult() {

    }

    private void updateCurrentDisplayString() {

    }

    private void updateCurrentDisplayStringWithOperator() {

    }

}
