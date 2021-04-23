package com.mobiquity.locateatm;

import com.mobiquity.locateatm.pojo.Address;
import com.mobiquity.locateatm.pojo.GeoLocation;
import com.mobiquity.locateatm.pojo.Hours;
import com.mobiquity.locateatm.pojo.LocateAtmResponse;
import com.mobiquity.locateatm.pojo.OpeningHours;

import java.util.ArrayList;
import java.util.List;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
public class UtilResonse {
    public static List<LocateAtmResponse> getTestResponse()
    {
        List<LocateAtmResponse> expectedControllerResponse = new ArrayList<>();
        LocateAtmResponse locateAtmResponse = new LocateAtmResponse();
        Address address = new Address();
        address.setStreet("Raghavendra");
        address.setHousenumber("12/R");
        address.setCity("Kukatpally");
        address.setPostalcode("4521");

        GeoLocation geoLocation = new GeoLocation();

        geoLocation.setLat("845.3255");
        geoLocation.setLng("524.3256");

        address.setGeoLocation(geoLocation);
        locateAtmResponse.setAddress(address);

        locateAtmResponse.setDistance(1);

        OpeningHours openingHours = new OpeningHours();

        openingHours.setDayOfWeek(2);

        Hours hours = new Hours();
        hours.setHourTo("11:00PM");
        hours.setHourFrom("10:00AM");
        List<Hours> hoursList = new ArrayList<>();
        hoursList.add(hours);
        openingHours.setHours(hoursList);
        List<OpeningHours> openingHoursList = new ArrayList<>();
        openingHoursList.add(openingHours);
        locateAtmResponse.setOpeningHours(openingHoursList);

        locateAtmResponse.setFunctionality("Residentail area- non metro");
        locateAtmResponse.setType("IND");
        expectedControllerResponse.add(locateAtmResponse);


        return expectedControllerResponse;
    }
}
