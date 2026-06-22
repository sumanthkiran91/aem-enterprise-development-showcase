package com.example.aem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class gridV1 {
    @ValueMapValue private String gridTitle;
    @ValueMapValue private String columns;

    public String getGridTitle() { return gridTitle; }
    public String getColumns() { return columns; }
}
