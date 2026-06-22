package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.DynamicTable;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = DynamicTable.class,
    resourceType = "enterprise-showcase/components/dynamic-table",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class DynamicTableImpl extends BaseComponentImpl implements DynamicTable {
    @ValueMapValue
    private String title;
    @ValueMapValue
    private String dataEndpoint;
    @ValueMapValue
    private String responsiveMode;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDataEndpoint() {
        return dataEndpoint;
    }

    @Override
    public String getResponsiveMode() {
        return responsiveMode;
    }
}
