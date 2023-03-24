package com.verzhik.calculatehw;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public String calculate() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plus(int num1, int num2) {
        int num3 = num1 + num2;
        return num1 + " + " + num2 + " = " + num3;
    }

    public String minus(int num1, int num2) {
        int num3 = num1 - num2;
        return num1 + " - " + num2 + " = " + num3;
    }

    public String multiply(int num1, int num2) {
        int num3 = num1 * num2;
        return num1 + " * " + num2 + " = " + num3;
    }

    public String divide(int num1, int num2) {
        int num3 = num1 / num2;
            return num1 + " / " + num2 + " = " + num3;
    }
}
