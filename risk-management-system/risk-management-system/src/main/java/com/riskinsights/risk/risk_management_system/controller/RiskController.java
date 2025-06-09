package com.riskinsights.risk.risk_management_system.controller;

import com.riskinsights.risk.risk_management_system.model.Risk;
import com.riskinsights.risk.risk_management_system.service.RiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/risks")

public class RiskController {

    private final RiskService riskService;//injects the riskservice into the controller using constructor-based -dependancy

    @Autowired
    public RiskController(RiskService riskService){
        this.riskService = riskService;
    }// SPring automatically creating and passing service into the controller

    @PostMapping
    public Risk createRisk(@RequestBody Risk risk){
        return riskService.createRisk(risk);
    }//Handles HTTP POST requests to the /api/risks

    @GetMapping
    public List<Risk> getAllRisks() {
        return riskService.getAllRisks();

    }//Handles HTTP GET Requests

}