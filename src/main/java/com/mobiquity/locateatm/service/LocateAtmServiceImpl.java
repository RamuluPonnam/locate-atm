package com.mobiquity.locateatm.service;

import com.mobiquity.locateatm.LocateAtmDao;
import com.mobiquity.locateatm.LocateAtmService;
import com.mobiquity.locateatm.pojo.LocateAtmResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
@Service
public class LocateAtmServiceImpl implements LocateAtmService {

    @Autowired
    LocateAtmDao locateAtmDao;

    @Override
    public List<LocateAtmResponse> getAtmLocation() {
        return locateAtmDao.getAtmLocation();
    }

    @Override
    public List<LocateAtmResponse> getAtmLocationByCity(String city) {
        List<LocateAtmResponse> atmLocationByCity = getAtmLocation().stream().filter(locateAtmResponse -> locateAtmResponse.getAddress().getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
        return atmLocationByCity;
    }
}
