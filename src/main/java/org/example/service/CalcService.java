package org.example.service;

import org.springframework.stereotype.Component;

@Component
public class CalcService {
    private Double sum(Double num1, Double num2) {
        return num1 + num2;
    }
    private Double sub(Double num1, Double num2) {
        return num1 - num2;
    }
    private Double mul(Double num1, Double num2) {
        return num1 * num2;
    }
    private Double div(Double num1, Double num2) {
        return num1 / num2;
    }

    public Double calculate(String opType, Double num1, Double num2){
        double result = 0;
        switch (opType){
            case "sum":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
