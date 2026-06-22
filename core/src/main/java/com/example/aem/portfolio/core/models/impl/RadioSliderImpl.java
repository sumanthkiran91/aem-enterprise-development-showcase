package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.RadioSlider;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = RadioSlider.class,
    resourceType = "enterprise-showcase/components/radio-slider",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class RadioSliderImpl extends BaseComponentImpl implements RadioSlider {
    @ValueMapValue
    private String name;
    @ValueMapValue
    private String defaultValue;
    @ValueMapValue
    private String minLabel;
    @ValueMapValue
    private String maxLabel;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDefaultValue() {
        return defaultValue;
    }

    @Override
    public String getMinLabel() {
        return minLabel;
    }

    @Override
    public String getMaxLabel() {
        return maxLabel;
    }
}
