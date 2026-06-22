package com.example.aem.portfolio.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.example.aem.portfolio.core.models.RadioSlider;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = { RadioSlider.class, ComponentExporter.class },
    resourceType = RadioSliderImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class RadioSliderImpl implements RadioSlider {

    public static final String RESOURCE_TYPE = "enterprise-showcase/components/radio-slider";

    @ValueMapValue
    private String id;

    @ValueMapValue
    private String label;

    @ValueMapValue
    private String defaultValue;

    @ValueMapValue
    private String options;

    @Override
    public String getId() {
        return StringUtils.defaultIfBlank(id, "radio-slider");
    }

    @Override
    public String getLabel() {
        return StringUtils.defaultIfBlank(label, "Continue");
    }

    @Override
    public String getDefaultValue() {
        return StringUtils.defaultIfBlank(defaultValue, "");
    }

    @Override
    public String getOptions() {
        return StringUtils.defaultIfBlank(options, "");
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
