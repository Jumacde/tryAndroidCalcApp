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
        this.num = 0;
        this.i1 = 0;
        this.int_num = 0;
        this.m = 0;
        this.n = 0;
    }


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
        return "";
    }

    @Override
    public void setCurrentOperator(String currentOperator) {
        this.currentOperator = currentOperator;
    }

    @Override
    public boolean getWaitingForNewNumber() {
        return false;
    }

    @Override
    public void setWaitingForNewNumber(boolean waitingForNewNumber) {
        this.waitingForNewNumber = waitingForNewNumber;
    }

    @Override
    public boolean getHasDecimalPoint() {
        return false;
    }

    @Override
    public void setHasDecimalPoint(boolean hasDecimalPoint) {
        this.hasDecimalPoint = hasDecimalPoint;
    }
}
