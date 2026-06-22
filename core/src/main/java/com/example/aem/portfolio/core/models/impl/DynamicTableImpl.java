package com.example.aem.portfolio.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.example.aem.portfolio.core.models.DynamicTable;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = { DynamicTable.class, ComponentExporter.class },
    resourceType = DynamicTableImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class DynamicTableImpl implements DynamicTable {

    public static final String RESOURCE_TYPE = "enterprise-showcase/components/dynamic-table";

    @ValueMapValue
    private String id;

    @ValueMapValue
    private String tableTitle;

    @ValueMapValue
    private String dataEndpoint;

    @ValueMapValue
    private String variant;

    @Override
    public String getId() {
        return StringUtils.defaultIfBlank(id, "dynamic-table");
    }

    @Override
    public String getTableTitle() {
        return StringUtils.defaultIfBlank(tableTitle, "Dynamic Table");
    }

    @Override
    public String getDataEndpoint() {
        return StringUtils.defaultIfBlank(dataEndpoint, "");
    }

    @Override
    public String getVariant() {
        return StringUtils.defaultIfBlank(variant, "");
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
