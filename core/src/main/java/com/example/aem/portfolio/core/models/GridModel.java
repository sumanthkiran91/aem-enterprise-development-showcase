package com.example.aem.portfolio.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class GridModel {
    @ValueMapValue private String desktopSpacing;
    @ValueMapValue private String mobileSpacing;
    @ValueMapValue private boolean removeBottomMargin;

    public String getDesktopSpacing() { return desktopSpacing != null ? desktopSpacing : "spacing-desktop-4"; }
    public String getMobileSpacing() { return mobileSpacing != null ? mobileSpacing : "spacing-mobile-2"; }
    public boolean isRemoveBottomMargin() { return removeBottomMargin; }
}
