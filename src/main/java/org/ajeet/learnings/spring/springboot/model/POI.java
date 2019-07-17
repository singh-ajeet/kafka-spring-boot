package org.ajeet.learnings.spring.springboot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class POI {
    private final double longitude;
    private final double latitude;
    private final String description;

    @JsonCreator
    public POI(@JsonProperty("longitude") double longitude,
               @JsonProperty("latitude") double latitude,
               @JsonProperty("description") String description) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "POI{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", description='" + description + '\'' +
                '}';
    }
}
