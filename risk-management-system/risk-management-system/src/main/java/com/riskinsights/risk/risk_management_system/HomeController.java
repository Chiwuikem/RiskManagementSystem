package com.riskinsights.risk.risk_management_system;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Risk Management Systems!";
    }
}