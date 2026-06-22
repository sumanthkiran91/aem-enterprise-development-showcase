package com.example.aem.portfolio.core.models;

public interface DynamicTable extends ComponentExporter {
    String getTitle();
    String getDataEndpoint();
    String getResponsiveMode();
}
