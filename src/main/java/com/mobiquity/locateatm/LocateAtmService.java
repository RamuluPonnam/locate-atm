package com.mobiquity.locateatm;

import com.mobiquity.locateatm.pojo.LocateAtmResponse;

import java.util.List;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
public interface LocateAtmService {

    List<LocateAtmResponse> getAtmLocation();
    List<LocateAtmResponse> getAtmLocationByCity(String city);
}
