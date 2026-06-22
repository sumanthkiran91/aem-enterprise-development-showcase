package com.example.aem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class tabsV1 {
    @ValueMapValue private String tabTitle;
    @ValueMapValue private String tabStyle;

    public String getTabTitle() { return tabTitle; }
    public String getTabStyle() { return tabStyle; }
}
