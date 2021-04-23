package com.mobiquity.locateatm.controller;

import com.mobiquity.locateatm.LocateAtmService;
import com.mobiquity.locateatm.pojo.LocateAtmResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
@RestController
public class LocateAtmController {

    @Autowired
    LocateAtmService locateAtmService;

    @RequestMapping(value = "/check")
    public String check(){
        return "Hey, I am running!";
    }

    @RequestMapping(value = "/atmlist", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LocateAtmResponse> getAtmLocation() {
        return locateAtmService.getAtmLocation();
    }

    @RequestMapping(value = "/atmlist/{city}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LocateAtmResponse> getAtmLocationByCity(@PathVariable String city) {
        return locateAtmService.getAtmLocationByCity(city);

    }
}
