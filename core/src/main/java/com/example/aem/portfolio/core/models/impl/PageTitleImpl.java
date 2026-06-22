package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.PageTitle;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = PageTitle.class,
    resourceType = "enterprise-showcase/components/page-title",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class PageTitleImpl extends BaseComponentImpl implements PageTitle {
    @ValueMapValue
    private String title;
    @ValueMapValue
    private String subtitle;
    @ValueMapValue
    private String alignment;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getSubtitle() {
        return subtitle;
    }

    @Override
    public String getAlignment() {
        return alignment;
    }
}
