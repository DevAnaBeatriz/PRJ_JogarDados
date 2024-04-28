package com.mycompany.prj_jogardado;

/*
    ANA BEATRIZ MARTINS BATISTA
    BRUNO SANTOS PROTUGAL
    MARIANE BATISTA DE SOUZA
*/
public class Jogo {
    private int resultado;

    public int jogar() {
        // Simula o lançamento dos dados e retorna a soma
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        dado1.lancar();
        dado2.lancar();
        resultado = dado1.obterFace() + dado2.obterFace();
        return resultado;
    }

    public boolean obterResultado(int resultado) {
        System.out.println("Resultado da soma dos dados: "+resultado);
        // Determina se o jogador venceu ou perdeu
        return resultado == 7;
    }
}