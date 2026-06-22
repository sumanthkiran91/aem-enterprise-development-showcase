package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface Modal extends ComponentExporter {
    String getId();
    String getModalTitle();
    String getTriggerLabel();
    String getModalContent();
}
