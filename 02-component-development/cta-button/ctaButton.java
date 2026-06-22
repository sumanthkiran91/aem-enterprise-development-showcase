package com.example.aem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ctaButton {
    @ValueMapValue private String label;
    @ValueMapValue private String url;

    public String getLabel() { return label; }
    public String getUrl() { return url; }
}
