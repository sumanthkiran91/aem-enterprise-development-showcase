package com.example.aem.portfolio.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.example.aem.portfolio.core.models.Modal;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
    adaptables = Resource.class,
    adapters = { Modal.class, ComponentExporter.class },
    resourceType = ModalImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = "jackson", extensions = "json")
public class ModalImpl implements Modal {

    public static final String RESOURCE_TYPE = "enterprise-showcase/components/modal";

    @ValueMapValue
    private String id;

    @ValueMapValue
    private String modalTitle;

    @ValueMapValue
    private String triggerLabel;

    @ValueMapValue
    private String modalContent;

    @Override
    public String getId() {
        return StringUtils.defaultIfBlank(id, "modal");
    }

    @Override
    public String getModalTitle() {
        return StringUtils.defaultIfBlank(modalTitle, "Modal");
    }

    @Override
    public String getTriggerLabel() {
        return StringUtils.defaultIfBlank(triggerLabel, "Continue");
    }

    @Override
    public String getModalContent() {
        return StringUtils.defaultIfBlank(modalContent, "");
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
