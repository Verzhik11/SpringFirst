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
        return calculateService.calculate();
    }
    @GetMapping(path = "/plus")
    public String plus (@RequestParam int num1, @RequestParam int num2) {
        return calculateService.plus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String minus (@RequestParam int num1, @RequestParam int num2) {
        return calculateService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam int num1, @RequestParam int num2) {
        return calculateService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide (@RequestParam int num1, @RequestParam int num2) {
        return calculateService.divide(num1, num2);
    }

}
