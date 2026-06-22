package com.example.aem.portfolio.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.example.aem.portfolio.core.models.GridV1;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = { GridV1.class, ComponentExporter.class },
    resourceType = GridV1Impl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class GridV1Impl implements GridV1 {

    public static final String RESOURCE_TYPE = "enterprise-showcase/components/grid-v1";

    @ValueMapValue
    private String id;

    @ValueMapValue
    private String columns;

    @ValueMapValue
    private String desktopSpacing;

    @ValueMapValue
    private String mobileSpacing;

    @Override
    public String getId() {
        return StringUtils.defaultIfBlank(id, "grid-v1");
    }

    @Override
    public String getColumns() {
        return StringUtils.defaultIfBlank(columns, "");
    }

    @Override
    public String getDesktopSpacing() {
        return StringUtils.defaultIfBlank(desktopSpacing, "");
    }

    @Override
    public String getMobileSpacing() {
        return StringUtils.defaultIfBlank(mobileSpacing, "");
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
