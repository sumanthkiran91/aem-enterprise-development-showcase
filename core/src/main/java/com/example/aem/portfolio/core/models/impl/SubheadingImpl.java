package com.example.aem.portfolio.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.example.aem.portfolio.core.models.Subheading;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = { Subheading.class, ComponentExporter.class },
    resourceType = SubheadingImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class SubheadingImpl implements Subheading {

    public static final String RESOURCE_TYPE = "enterprise-showcase/components/subheading";

    @ValueMapValue
    private String id;

    @ValueMapValue
    private String heading;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private boolean centerAlign;

    @Override
    public String getId() {
        return StringUtils.defaultIfBlank(id, "subheading");
    }

    @Override
    public String getHeading() {
        return StringUtils.defaultIfBlank(heading, "Subheading");
    }

    @Override
    public String getDescription() {
        return StringUtils.defaultIfBlank(description, "");
    }

    @Override
    public boolean isCenterAlign() {
        return centerAlign;
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
