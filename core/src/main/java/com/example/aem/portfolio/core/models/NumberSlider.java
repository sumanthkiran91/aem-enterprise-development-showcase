package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface NumberSlider extends ComponentExporter {
    String getId();
    String getLabel();
    String getMinValue();
    String getMaxValue();
    String getDefaultValue();
    boolean isShowReset();
}
