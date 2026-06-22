package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface Subheading extends ComponentExporter {
    String getId();
    String getHeading();
    String getDescription();
    boolean isCenterAlign();
}
