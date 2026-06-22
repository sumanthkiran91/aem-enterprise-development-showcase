package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.Grid;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = Grid.class,
    resourceType = "enterprise-showcase/components/grid-v1",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class GridImpl extends BaseComponentImpl implements Grid {
    @ValueMapValue
    private String columns;
    @ValueMapValue
    private String desktopSpacing;
    @ValueMapValue
    private String mobileSpacing;

    @Override
    public String getColumns() {
        return columns;
    }

    @Override
    public String getDesktopSpacing() {
        return desktopSpacing;
    }

    @Override
    public String getMobileSpacing() {
        return mobileSpacing;
    }
}
