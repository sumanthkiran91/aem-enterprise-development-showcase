package com.example.aem.portfolio.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.example.aem.portfolio.core.models.CtaButton;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = { CtaButton.class, ComponentExporter.class },
    resourceType = CtaButtonImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class CtaButtonImpl implements CtaButton {

    public static final String RESOURCE_TYPE = "enterprise-showcase/components/cta-button";

    @ValueMapValue
    private String id;

    @ValueMapValue
    private String label;

    @ValueMapValue
    private String url;

    @ValueMapValue
    private String target;

    @Override
    public String getId() {
        return StringUtils.defaultIfBlank(id, "cta-button");
    }

    @Override
    public String getLabel() {
        return StringUtils.defaultIfBlank(label, "Continue");
    }

    @Override
    public String getUrl() {
        return StringUtils.defaultIfBlank(url, "");
    }

    @Override
    public String getTarget() {
        return StringUtils.defaultIfBlank(target, "");
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
