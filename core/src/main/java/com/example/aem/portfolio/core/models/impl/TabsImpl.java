package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.Tabs;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = Tabs.class,
    resourceType = "enterprise-showcase/components/tabs-v1",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TabsImpl extends BaseComponentImpl implements Tabs {
    @ValueMapValue
    private String tabType;
    @ValueMapValue
    private String tabStyle;
    @ValueMapValue
    private String activeTab;

    @Override
    public String getTabType() {
        return tabType;
    }

    @Override
    public String getTabStyle() {
        return tabStyle;
    }

    @Override
    public String getActiveTab() {
        return activeTab;
    }
}
