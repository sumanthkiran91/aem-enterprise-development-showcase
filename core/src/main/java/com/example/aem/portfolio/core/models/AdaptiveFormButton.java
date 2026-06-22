package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface AdaptiveFormButton extends ComponentExporter {
    String getId();
    String getLabel();
    String getAction();
    String getRuleTarget();
}
