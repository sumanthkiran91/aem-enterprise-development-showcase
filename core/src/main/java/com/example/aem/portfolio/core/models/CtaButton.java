package com.example.aem.portfolio.core.models;

public interface CtaButton extends ComponentExporter {
    String getLabel();
    String getUrl();
    String getVariant();
    boolean isOpenInNewTab();
}
