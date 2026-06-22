package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.Subheading;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = Subheading.class,
    resourceType = "enterprise-showcase/components/subheading",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class SubheadingImpl extends BaseComponentImpl implements Subheading {
    @ValueMapValue
    private String heading;
    @ValueMapValue
    private String description;
    @ValueMapValue
    private boolean centerAligned;

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isCenterAligned() {
        return centerAligned;
    }
}
