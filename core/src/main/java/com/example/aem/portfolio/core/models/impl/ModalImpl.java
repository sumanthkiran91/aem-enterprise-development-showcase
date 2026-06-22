package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.Modal;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = Modal.class,
    resourceType = "enterprise-showcase/components/modal",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ModalImpl extends BaseComponentImpl implements Modal {
    @ValueMapValue
    private String modalTitle;
    @ValueMapValue
    private String triggerLabel;
    @ValueMapValue
    private String modalSize;

    @Override
    public String getModalTitle() {
        return modalTitle;
    }

    @Override
    public String getTriggerLabel() {
        return triggerLabel;
    }

    @Override
    public String getModalSize() {
        return modalSize;
    }
}
