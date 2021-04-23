package com.mobiquity.locateatm.service;

import com.mobiquity.locateatm.LocateAtmDao;
import com.mobiquity.locateatm.UtilResonse;
import com.mobiquity.locateatm.pojo.LocateAtmResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
@ExtendWith(MockitoExtension.class)
public class LocateAtmServiceImplTest {

    private List<LocateAtmResponse> mockResponse;

    @InjectMocks
    private LocateAtmServiceImpl locateAtmService;

    @Mock
    private LocateAtmDao locateAtmDao;

    @BeforeEach
    public void setUp() {
        mockResponse = UtilResonse.getTestResponse();
    }

    @Test
    public void getAtmLocation() {

        when(locateAtmDao.getAtmLocation()).thenReturn(mockResponse);
        List<LocateAtmResponse> actualResponse = locateAtmService.getAtmLocation();
        Assertions.assertEquals(mockResponse.size(), actualResponse.size());
    }

    @Test
    public void getAtmLocationByCity()
    {
        Mockito.when(locateAtmDao.getAtmLocation()).thenReturn(mockResponse);
        List<LocateAtmResponse> actualResponse = locateAtmService.getAtmLocationByCity("Kukatpally");
        Assertions.assertEquals(1, actualResponse.size());
    }
}
