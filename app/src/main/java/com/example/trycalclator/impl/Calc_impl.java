package com.example.trycalclator.impl;


import com.example.trycalclator.Calc;

public class Calc_impl implements Calc {
    private double currentNumber;
    private double storedNumber;
    private String currentOperator;
    private boolean isNewNumberInput;
    private boolean hasDecimalPoint;
    private int decimalPlaces;
    private String displayString;

    public Calc_impl() {
        clear();
    }


    @Override
    public String getCurrentDisplayString() {
        return displayString;
    }

    @Override
    public void appendDigit(int digit) {
        if(isNewNumberInput) {
            currentNumber = digit;
            isNewNumberInput = false;
            hasDecimalPoint = false;
            decimalPlaces = 0;
        } else {
            if (hasDecimalPoint) {
                decimalPlaces++;
                currentNumber = currentNumber + digit / Math.pow(10, decimalPlaces);
            } else {
                currentNumber = currentNumber * 10 + digit;
            }
        }
        updateCurrentDisplayString();
    }

    @Override
    public void addDecimalPoint() {
        if (!hasDecimalPoint) {
            if (isNewNumberInput) {
                currentNumber = 0;
                isNewNumberInput = false;
            }
            hasDecimalPoint = true;
            if (!displayString.contains(".")) {
                displayString += ".";
            }
        }
    }

    @Override
    public void clear() {
        currentNumber = 0;
        storedNumber = 0;
        currentOperator = "";
        isNewNumberInput = true;
        hasDecimalPoint = false;
        decimalPlaces = 0;
        displayString = "0";
    }

    @Override
    public void applyOperator(String operator) {
        if (!currentOperator.isEmpty() && !isNewNumberInput) {
            calculateResult();
            storedNumber = currentNumber;
            isNewNumberInput = true;
            hasDecimalPoint = false;
            decimalPlaces = 0;
            currentOperator = operator;
            updateDisplayStringWithOperator();
        } else if (operator.equals("=")) {
            calculateResult();
            currentOperator = "";
            isNewNumberInput = true;
            hasDecimalPoint = (currentNumber % 1 != 0);
            decimalPlaces = 0;
            updateCurrentDisplayString();
        } else {
            currentOperator = operator;
            storedNumber = currentNumber;
            isNewNumberInput = true;
            hasDecimalPoint = false;
            decimalPlaces = 0;
            updateDisplayStringWithOperator();
        }
    }

    private void calculateResult() {
        if (currentOperator.isEmpty()) {
            return;
        }

        double result = 0;
        switch (currentOperator) {
            case "+":
                result = storedNumber + currentNumber;
                break;
            case "-":
                result = storedNumber - currentNumber;
                break;
            case "x":
                result = storedNumber * currentNumber;
                break;
            case "÷":
                if (currentNumber != 0) {
                    result = storedNumber / currentNumber;
                } else {
                    displayString = "Error";
                    clear();
                    return;
                }
                break;
        }
        currentNumber = result;
    }

    private void updateCurrentDisplayString() {
        if (currentNumber == (long) currentNumber && !hasDecimalPoint) {
            displayString = String.valueOf((long) currentNumber);
        } else {
            String temp = String.valueOf(currentNumber);
            if (temp.endsWith(".0")) {
                displayString = temp.substring(0, temp.length() - 2);
            } else {
                displayString = temp;
            }
        }
    }

    private void updateDisplayStringWithOperator() {
        if (storedNumber == (long) storedNumber) {
            displayString = String.valueOf((long) storedNumber) + " " + currentOperator + " ";
        } else {
            displayString = String.valueOf(storedNumber) + " " + currentOperator + " ";
        }
    }


}
