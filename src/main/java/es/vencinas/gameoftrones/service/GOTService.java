package es.vencinas.gameoftrones.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;

import jakarta.annotation.PostConstruct;

@Service
public class GOTService {

    private final Faker gotFaker;

    private final ArrayList<GameOfThrones> personajeList = new ArrayList<>();

    public GOTService() {
        this.gotFaker = new Faker();
    }

    @PostConstruct
    private void init(){
        GameOfThrones personaje = gotFaker.gameOfThrones();
        personajeList.add(personaje);
    }

    public GameOfThrones getPersonaje(int i){
        return personajeList.get(i);
    }
}

