package com.mobiquity.locateatm.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoLocation implements Serializable {

    private String lat;
    private String lng;


    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
