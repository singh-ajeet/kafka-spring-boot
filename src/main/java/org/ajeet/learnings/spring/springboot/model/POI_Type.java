package org.ajeet.learnings.spring.springboot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum POI_Type {
    AIRPORT("Airport"),
    FIRE_STATION("Fire Station");

    private String value;

    POI_Type(String value) {
        this.value = value;
    }

    @JsonCreator
    public static POI_Type fromValue(String value) {
        for(POI_Type poiType :values()){
            if (poiType.value.equals(value)){
                return poiType;
            }
        }
        throw new IllegalArgumentException("Unsupported poi type !!");
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name() + "(" + value + ")";
    }
}
