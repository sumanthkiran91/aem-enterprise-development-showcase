package com.example.aem.portfolio.core.models;

import java.util.Collections;
import java.util.List;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DynamicTableModel {
    @ChildResource private List<Resource> rows;
    public List<Resource> getRows() { return rows != null ? rows : Collections.emptyList(); }
}
