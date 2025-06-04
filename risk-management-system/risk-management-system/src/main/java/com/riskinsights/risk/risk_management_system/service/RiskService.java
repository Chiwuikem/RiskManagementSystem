package com.riskinsights.risk.risk_management_system.service;

import com.riskinsights.risk.risk_management_system.model.Risk;
import com.riskinsights.risk.risk_management_system.repository.RiskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskService{
    private final RiskRepository riskRepository;

    public RiskService(RiskRepository riskRepository){
        this.riskRepository =  riskRepository;

    }

    public Risk createRisk(Risk risk) {
        return riskRepository.save(risk);
    }

    public List<Risk> getAllRisks(){
        return riskRepository.findAll();
    }
}