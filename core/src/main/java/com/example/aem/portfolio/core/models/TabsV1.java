package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface TabsV1 extends ComponentExporter {
    String getId();
    String getTabType();
    String getTabStyle();
    String getItems();
}
