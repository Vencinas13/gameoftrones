package es.vencinas.gameoftrones.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.GameOfThrones;

import es.vencinas.gameoftrones.service.GOTService;

@RestController
public class GOTControler {
    
    @Autowired
    GOTService service;
    
    @GetMapping("/")
    public String Hello() {
        GameOfThrones got = service.getPersonaje(0);
        return got.character().concat(got.city().concat(got.dragon().concat(got.house())));
    }
}