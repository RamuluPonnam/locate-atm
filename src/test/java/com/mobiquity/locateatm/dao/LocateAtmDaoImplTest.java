package com.mobiquity.locateatm.dao;

import com.mobiquity.locateatm.LocateAtmApplication;
import com.mobiquity.locateatm.pojo.LocateAtmResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/*
 *@author RPonnam
 *@created 4/23/2021
 */
@ExtendWith(MockitoExtension.class)
@SpringBootTest(classes = LocateAtmApplication.class)
public class LocateAtmDaoImplTest {

    @Autowired
    LocateAtmDaoImpl locateAtmDao;

    @Test
    public void getAtmLocation() {
        List<LocateAtmResponse> response = locateAtmDao.getAtmLocation();
        Assertions.assertEquals(2931, response.size());
    }
}
