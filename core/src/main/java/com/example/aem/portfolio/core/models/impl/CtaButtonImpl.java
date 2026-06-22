package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.CtaButton;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = CtaButton.class,
    resourceType = "enterprise-showcase/components/cta-button",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CtaButtonImpl extends BaseComponentImpl implements CtaButton {
    @ValueMapValue
    private String label;
    @ValueMapValue
    private String url;
    @ValueMapValue
    private String variant;
    @ValueMapValue
    private boolean openInNewTab;

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getVariant() {
        return variant;
    }

    @Override
    public boolean isOpenInNewTab() {
        return openInNewTab;
    }
}
