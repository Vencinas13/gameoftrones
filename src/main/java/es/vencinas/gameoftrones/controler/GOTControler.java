package es.vencinas.gameoftrones.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.vencinas.gameoftrones.service.GOTService;

@RestController
public class GOTControler {
    
    @Autowired
    GOTService service;
    
    @GetMapping("/")
    public String Hello() {
        return "Hola mundo";
    }
    
}
