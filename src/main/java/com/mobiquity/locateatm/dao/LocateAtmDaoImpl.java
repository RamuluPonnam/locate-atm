package com.mobiquity.locateatm.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobiquity.locateatm.LocateAtmDao;
import com.mobiquity.locateatm.pojo.LocateAtmResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
@Service
public class LocateAtmDaoImpl implements LocateAtmDao {

    private static String url = "https://www.ing.nl/api/locator/atms/";
    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<LocateAtmResponse> getAtmLocation() {

        try {
            ResponseEntity<String> response = restTemplate.exchange(new URI(url), HttpMethod.GET, new HttpEntity<>(getHeaders()), String.class);
            String body = response.getBody();
            // String body = restTemplate.getForObject(url, String.class);
            String sub = body.substring(5);
            ObjectMapper objectMapper = new ObjectMapper();
            LocateAtmResponse[] atmLocations = objectMapper.readValue(sub, LocateAtmResponse[].class);
            List<LocateAtmResponse> locateAtmResponses =  Arrays.asList(atmLocations);
            return locateAtmResponses;

        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return Collections.emptyList();
    }

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
