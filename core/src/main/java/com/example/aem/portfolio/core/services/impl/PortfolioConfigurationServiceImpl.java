package com.example.aem.portfolio.core.services.impl;

import com.example.aem.portfolio.core.services.PortfolioConfigurationService;
import org.osgi.service.component.annotations.Component;

@Component(service = PortfolioConfigurationService.class)
public class PortfolioConfigurationServiceImpl implements PortfolioConfigurationService {
    @Override
    public String getEnvironmentName() {
        return "portfolio";
    }
}
