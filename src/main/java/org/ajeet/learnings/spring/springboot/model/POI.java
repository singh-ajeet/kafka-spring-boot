package org.ajeet.learnings.spring.springboot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class represents a 'point of interest',
 * it can be anything like - an airports, fire station or household.
 */
public final class POI {
    private final double longitude;
    private final double latitude;
    private final POI_Type type;
    private final String description;

    @JsonCreator
    public POI(@JsonProperty("longitude") double longitude,
               @JsonProperty("latitude") double latitude,
               @JsonProperty("type") POI_Type type,
               @JsonProperty("description") String description) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.type = type;
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

    public POI_Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "POI[" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", type=" + type +
                ", description='" + description + '\'' +
                ']';
    }
}
