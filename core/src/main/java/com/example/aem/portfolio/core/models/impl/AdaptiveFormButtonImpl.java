package com.example.aem.portfolio.core.models.impl;

import com.example.aem.portfolio.core.models.AdaptiveFormButton;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = AdaptiveFormButton.class,
    resourceType = "enterprise-showcase/components/adaptive-form-button",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class AdaptiveFormButtonImpl extends BaseComponentImpl implements AdaptiveFormButton {
    @ValueMapValue
    private String label;
    @ValueMapValue
    private String action;
    @ValueMapValue
    private String ruleTarget;

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public String getRuleTarget() {
        return ruleTarget;
    }
}
