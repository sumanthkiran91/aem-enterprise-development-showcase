package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface CtaButton extends ComponentExporter {
    String getId();
    String getLabel();
    String getUrl();
    String getTarget();
}
