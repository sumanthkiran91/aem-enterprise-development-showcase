package com.example.aem.portfolio.core.services.impl;

import com.example.aem.portfolio.core.services.PortfolioConfigService;
import org.osgi.service.component.annotations.Component;

@Component(service = PortfolioConfigService.class)
public class PortfolioConfigServiceImpl implements PortfolioConfigService {
    @Override
    public String getApiBasePath() { return "/mock-api"; }

    @Override
    public boolean isFeatureEnabled(String featureName) { return featureName != null && !featureName.isBlank(); }
}
