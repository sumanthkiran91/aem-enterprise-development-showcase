package com.example.aem.portfolio.core.services.impl;

import com.example.aem.portfolio.core.services.ContentValidationService;
import org.osgi.service.component.annotations.Component;

@Component(service = ContentValidationService.class)
public class ContentValidationServiceImpl implements ContentValidationService {
    @Override
    public boolean isValidText(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
