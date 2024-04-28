package com.mycompany.prj_jogardado;

/*
    ANA BEATRIZ MARTINS BATISTA
    BRUNO SANTOS PROTUGAL
    MARIANE BATISTA DE SOUZA
*/

import java.util.Random;

public class Dado {
    private int face;

    public void lancar() {
        // Simula o lançamento do dado, atribuindo um valor aleatório à face
        Random random = new Random();
        face = random.nextInt(6) + 1; // Valores de 1 a 6
    }

    public int obterFace() {
        return face;
    }
}