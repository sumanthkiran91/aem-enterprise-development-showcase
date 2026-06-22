package com.example.aem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class dynamicTable {
    @ValueMapValue private String tableTitle;
    @ValueMapValue private String variant;

    public String getTableTitle() { return tableTitle; }
    public String getVariant() { return variant; }
}
