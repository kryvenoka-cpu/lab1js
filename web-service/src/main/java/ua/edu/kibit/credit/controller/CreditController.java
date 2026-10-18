package ua.edu.kibit.credit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditController {

    @GetMapping("greet")
    public String greet() {
        return "Greetings, Artem";
    }
}