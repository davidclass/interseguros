package com.example.reestructure.controllers;

//import com.example.reestructure.models.service.HttpClient;
import com.example.reestructure.models.service.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
        import java.util.Map;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RestController
@RequestMapping("/api")
public class UserReectructureResController {

    /** VARIABLES **/

    @Autowired
    @Qualifier("dataService")
    private IDataService dataService;



    /** METODOS **/



    @PostMapping("/interseguro")
    public ResponseEntity<?> reestructurarData(){

        String sessionKey = "";

        // Mapa para almacenar objetos asociado a nombres y asignar mensajes de error
        Map<String, Object> response = new HashMap<>();

        try{
//            listUserNew = userService.formatDataUser();
            sessionKey = dataService.obtenerData();

        }catch (Exception e){

            response.put("mensaje", "Error al realizar la consulta a la API.");
            response.put("error", e.getMessage().concat(": ").concat(e.getLocalizedMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (sessionKey.length() == 0){
            response.put("mensaje", " La API  no contiene datos!");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        response.put("sessionKey", sessionKey);
        response.put("mensaje", "Data encontrada");

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
}
