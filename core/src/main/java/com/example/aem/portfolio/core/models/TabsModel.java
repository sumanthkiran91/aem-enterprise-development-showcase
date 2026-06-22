package com.example.aem.portfolio.core.models;

import java.util.Collections;
import java.util.List;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TabsModel {
    @ValueMapValue private String tabType;
    @ValueMapValue private String tabStyle;
    @ChildResource private List<Resource> tabs;

    public String getTabType() { return tabType != null ? tabType : "default"; }
    public String getTabStyle() { return tabStyle != null ? tabStyle : "hug"; }
    public List<Resource> getTabs() { return tabs != null ? tabs : Collections.emptyList(); }
}
