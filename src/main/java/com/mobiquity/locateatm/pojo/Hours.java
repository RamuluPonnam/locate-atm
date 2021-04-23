package com.mobiquity.locateatm.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hours implements Serializable {

    private String hourFrom;
    private String hourTo;

    public String getHourFrom() {
        return hourFrom;
    }

    public void setHourFrom(String hourFrom) {
        this.hourFrom = hourFrom;
    }

    public String getHourTo() {
        return hourTo;
    }

    public void setHourTo(String hourTo) {
        this.hourTo = hourTo;
    }
}
