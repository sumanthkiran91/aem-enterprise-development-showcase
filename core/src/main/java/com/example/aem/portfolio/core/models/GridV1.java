package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface GridV1 extends ComponentExporter {
    String getId();
    String getColumns();
    String getDesktopSpacing();
    String getMobileSpacing();
}
