package com.serenity.journey.tracks.api.model.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "context")
@XmlAccessorType (XmlAccessType.FIELD)
public class Context {

    @XmlElement(name = "id")
    private Integer id;

    @XmlElement(name = "position")
    private Integer position;

    @XmlElement(name = "updated-at")
    private String updatedAt;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "created-at")
    private String createdAt;

    @XmlElement(name = "state")
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Context{" +
                "id=" + id +
                ", position=" + position +
                ", updatedAt=" + updatedAt +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", state='" + state + '\'' +
                '}';
    }
}