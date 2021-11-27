package com.example.reestructure.models.service;

import com.example.reestructure.models.dao.IDataApiDao;
import com.example.reestructure.models.entity.Salida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Repository("dataService")
public class DataServiceImpl implements IDataService{

    @Autowired
    @Qualifier("dataDao")
    private IDataApiDao userApiDao;

    @Override
    public String obtenerData() throws Exception {

        Salida salidaOld = null;


        try {
            salidaOld = userApiDao.consultarURL2();
            System.out.println("salida: " + salidaOld);
            /*for (Data dataOld : salidaOld.getData()) {



            }*/

        } catch (Exception e) {
            System.out.println("userOld_0: " + e.getMessage());
        }


//        return "d1374be3f715b841e1dc991d1675ae28b6575d43ec7c1b5f3780c880d9a1edac";
        return "d1374be3f715b841e1dc991d1675ae28b6575d43ec7c1b5f3780c880d9a1edac";
    }
}
