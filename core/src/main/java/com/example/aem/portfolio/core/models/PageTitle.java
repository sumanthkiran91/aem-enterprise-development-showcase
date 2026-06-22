package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface PageTitle extends ComponentExporter {
    String getId();
    String getTitle();
    String getSubtitle();
    String getAlignment();
}
