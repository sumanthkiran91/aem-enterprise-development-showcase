package com.example.aem.portfolio.core.models;

public interface Tabs extends ComponentExporter {
    String getTabType();
    String getTabStyle();
    String getActiveTab();
}
