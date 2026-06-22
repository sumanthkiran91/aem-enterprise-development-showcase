package com.example.aem.portfolio.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.example.aem.portfolio.core.models.PageTitle;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = { PageTitle.class, ComponentExporter.class },
    resourceType = PageTitleImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class PageTitleImpl implements PageTitle {

    public static final String RESOURCE_TYPE = "enterprise-showcase/components/page-title";

    @ValueMapValue
    private String id;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String subtitle;

    @ValueMapValue
    private String alignment;

    @Override
    public String getId() {
        return StringUtils.defaultIfBlank(id, "page-title");
    }

    @Override
    public String getTitle() {
        return StringUtils.defaultIfBlank(title, "Page Title");
    }

    @Override
    public String getSubtitle() {
        return StringUtils.defaultIfBlank(subtitle, "Page Title");
    }

    @Override
    public String getAlignment() {
        return StringUtils.defaultIfBlank(alignment, "");
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
