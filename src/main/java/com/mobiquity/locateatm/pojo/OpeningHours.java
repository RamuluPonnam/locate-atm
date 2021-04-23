package com.mobiquity.locateatm.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpeningHours implements Serializable {

    private int dayOfWeek;
    private List<Hours> hours;

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public List<Hours> getHours() {
        return hours;
    }

    public void setHours(List<Hours> hours) {
        this.hours = hours;
    }
}
