package es.vencinas.gameoftrones.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.GameOfThrones;

import es.vencinas.gameoftrones.service.GOTService;
import io.micrometer.tracing.Span;
import io.micrometer.tracing.Tracer;

@RestController
public class GOTControler {
    
    @Autowired
    GOTService service;

    @Autowired
    Tracer tracer;
    
    @GetMapping("/")
    public String Hello() {
        Span echoSpan = tracer.nextSpan().name("Prueba").start();
        GameOfThrones got = service.getPersonaje(0);
        echoSpan.end();
        return got.character().concat(got.city().concat(got.dragon().concat(got.house())));
    }
}