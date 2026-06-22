package com.example.aem.portfolio.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PageTitleModel {
    @ValueMapValue private String title;
    @ValueMapValue private String subtitle;
    @ValueMapValue private String alignment;

    public String getTitle() { return title; }
    public String getSubtitle() { return subtitle; }
    public String getAlignment() { return alignment != null ? alignment : "left"; }
}
