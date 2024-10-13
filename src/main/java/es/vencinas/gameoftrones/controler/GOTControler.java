package es.vencinas.gameoftrones.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GOTControler {
    
    @GetMapping("/")
    public String Hello() {
        return "Hola mundo";
    }
    
}
