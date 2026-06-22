package com.example.aem.portfolio.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface DynamicTable extends ComponentExporter {
    String getId();
    String getTableTitle();
    String getDataEndpoint();
    String getVariant();
}
