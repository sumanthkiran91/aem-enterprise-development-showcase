package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.ComponentExporter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.injectorspecific.Self;

public abstract class BaseComponentImpl implements ComponentExporter {
    @Self
    protected Resource resource;

    @Override
    public String getId() {
        return resource != null ? resource.getName() : "component";
    }

    @Override
    public String getComponentName() {
        return resource != null ? resource.getResourceType() : "enterprise-showcase/component";
    }
}
