package com.std.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    private int i;

    HomeController() {
        i = -1;
    }

    @GetMapping("/home/main")
    @ResponseBody
    public String showMain() {
        return "안녕하세요";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String showMain2() {
        return "반갑습니다";
    }

    @GetMapping("/home/main3")
    @ResponseBody
    public String showMain3() {
        return "즐거웠습니다";
    }

    @GetMapping("/home/increase")
    @ResponseBody
    public String showIncrease() {
        i++;
        return "응답 : " + i;
    }

    @GetMapping("/home/plus")
    @ResponseBody
    public int showPlus(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        return a + b;
    }

    @GetMapping("/home/minus")
    @ResponseBody
    public int showMinus(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        return a - b;
    }

    @GetMapping("/home/multiplication")
    @ResponseBody
    public int showMultiplication(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        return a * b;
    }

    @GetMapping("/home/division")
    @ResponseBody
    public int showDivision(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        return a / b;
    }
}
