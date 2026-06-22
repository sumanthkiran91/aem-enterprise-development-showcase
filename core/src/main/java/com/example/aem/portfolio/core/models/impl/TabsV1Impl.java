package com.example.aem.portfolio.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.example.aem.portfolio.core.models.TabsV1;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = { TabsV1.class, ComponentExporter.class },
    resourceType = TabsV1Impl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class TabsV1Impl implements TabsV1 {

    public static final String RESOURCE_TYPE = "enterprise-showcase/components/tabs-v1";

    @ValueMapValue
    private String id;

    @ValueMapValue
    private String tabType;

    @ValueMapValue
    private String tabStyle;

    @ValueMapValue
    private String items;

    @Override
    public String getId() {
        return StringUtils.defaultIfBlank(id, "tabs-v1");
    }

    @Override
    public String getTabType() {
        return StringUtils.defaultIfBlank(tabType, "");
    }

    @Override
    public String getTabStyle() {
        return StringUtils.defaultIfBlank(tabStyle, "");
    }

    @Override
    public String getItems() {
        return StringUtils.defaultIfBlank(items, "");
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
