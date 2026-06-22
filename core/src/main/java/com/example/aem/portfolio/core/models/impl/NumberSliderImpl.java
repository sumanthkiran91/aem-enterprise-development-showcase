package com.example.aem.portfolio.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.example.aem.portfolio.core.models.NumberSlider;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = { NumberSlider.class, ComponentExporter.class },
    resourceType = NumberSliderImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class NumberSliderImpl implements NumberSlider {

    public static final String RESOURCE_TYPE = "enterprise-showcase/components/number-slider";

    @ValueMapValue
    private String id;

    @ValueMapValue
    private String label;

    @ValueMapValue
    private String minValue;

    @ValueMapValue
    private String maxValue;

    @ValueMapValue
    private String defaultValue;

    @ValueMapValue
    private boolean showReset;

    @Override
    public String getId() {
        return StringUtils.defaultIfBlank(id, "number-slider");
    }

    @Override
    public String getLabel() {
        return StringUtils.defaultIfBlank(label, "Continue");
    }

    @Override
    public String getMinValue() {
        return StringUtils.defaultIfBlank(minValue, "");
    }

    @Override
    public String getMaxValue() {
        return StringUtils.defaultIfBlank(maxValue, "");
    }

    @Override
    public String getDefaultValue() {
        return StringUtils.defaultIfBlank(defaultValue, "");
    }

    @Override
    public boolean isShowReset() {
        return showReset;
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
