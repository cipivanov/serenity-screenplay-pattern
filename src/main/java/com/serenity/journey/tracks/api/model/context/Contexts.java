package com.serenity.journey.tracks.api.model.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "contexts")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contexts {

    @XmlElement(name = "context")
    private List<Context> contexts;

    public List<Context> getContexts() {
        return contexts;
    }

    public void setContexts(List<Context> contexts) {
        this.contexts = contexts;
    }
}