package com.verzhik.calculatehw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final CalculateService calculateService;
    public CalculateController (CalculateService calculateService) {
        this.calculateService = calculateService;
    }
    @GetMapping
    public String calculate() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
    @GetMapping(path = "/plus")
    public String plus (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return buildView(num1, num2, "+");
    }
    @GetMapping(path = "/minus")
    public String minus (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return buildView(num1, num2, "-");
    }
    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return buildView(num1, num2, "*");
    }
    @GetMapping(path = "/divide")
    public String divide (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        return buildView(num1, num2, "/");
    }
    private String buildView(Integer num1, Integer num2, String operation) {
        if(num1 == null || num2 == null) {
            return "Должны быть переданы все параметры";
        }
        if("/".equals(operation) & num2 == 0) {
            return "На ноль делить нельзя";
        }
            Number result;
            switch (operation) {
                case "+":
                    result = calculateService.plus(num1, num2);
                    break;
                case "-":
                    result = calculateService.minus(num1, num2);
                    break;
                case "*":
                    result = calculateService.multiply(num1, num2);
                    break;
                default:
                    result = calculateService.divide(num1, num2);
            }
            return num1 + " " + operation + " " + num2 + " = " + result;


        }

    }

