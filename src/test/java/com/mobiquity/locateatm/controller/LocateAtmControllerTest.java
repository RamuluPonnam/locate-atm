package com.mobiquity.locateatm.controller;

import com.mobiquity.locateatm.UtilResonse;
import com.mobiquity.locateatm.pojo.LocateAtmResponse;
import com.mobiquity.locateatm.service.LocateAtmServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
@ExtendWith(MockitoExtension.class)
public class LocateAtmControllerTest {

    private List<LocateAtmResponse> mockResponse;

    @InjectMocks
    LocateAtmController  atmLocatorController;

    @Mock
    LocateAtmServiceImpl atmLocatorService;

    @BeforeEach
    public void setUp()
    {

        mockResponse = UtilResonse.getTestResponse();
    }

    @Test
    public void getAtmLocation()
    {
        when(atmLocatorService.getAtmLocation()).thenReturn(mockResponse);
        List<LocateAtmResponse> actualResponse = atmLocatorController.getAtmLocation();
        Assertions.assertEquals(mockResponse.size(), actualResponse.size());
    }

    @Test
    public void getAtmLocationByCity()
    {
        when(atmLocatorService.getAtmLocationByCity("Kukatpally")).thenReturn(mockResponse);
        List<LocateAtmResponse> actualResponse = atmLocatorController.getAtmLocationByCity("Kukatpally");
        Assertions.assertEquals(mockResponse.size(), actualResponse.size());
    }
}
