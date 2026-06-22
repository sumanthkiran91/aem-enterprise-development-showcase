package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.NumberSlider;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = NumberSlider.class,
    resourceType = "enterprise-showcase/components/number-slider",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class NumberSliderImpl extends BaseComponentImpl implements NumberSlider {
    @ValueMapValue
    private String label;
    @ValueMapValue
    private String minValue;
    @ValueMapValue
    private String maxValue;
    @ValueMapValue
    private String defaultValue;

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getMinValue() {
        return minValue;
    }

    @Override
    public String getMaxValue() {
        return maxValue;
    }

    @Override
    public String getDefaultValue() {
        return defaultValue;
    }
}
