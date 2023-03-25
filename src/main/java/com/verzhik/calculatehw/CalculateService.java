package com.verzhik.calculatehw;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {


    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        return (double)num1 / num2;
    }
}
