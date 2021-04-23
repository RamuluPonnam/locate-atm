package com.mobiquity.locateatm;

import com.mobiquity.locateatm.pojo.LocateAtmResponse;

import java.util.List;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
public interface LocateAtmDao {

    List<LocateAtmResponse> getAtmLocation();
}
