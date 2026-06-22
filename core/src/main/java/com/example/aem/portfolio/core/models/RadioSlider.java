package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface RadioSlider extends ComponentExporter {
    String getId();
    String getLabel();
    String getDefaultValue();
    String getOptions();
}
