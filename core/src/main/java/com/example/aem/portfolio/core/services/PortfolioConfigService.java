package com.example.aem.portfolio.core.services;

public interface PortfolioConfigService {
    String getApiBasePath();
    boolean isFeatureEnabled(String featureName);
}
