package com.riskinsights.risk.risk_management_system.repository;

import com.riskinsights.risk.risk_management_system.model.Risk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskRepository extends JpaRepository<Risk, Long> {
    // Additional query methods can be defined here if needed
}