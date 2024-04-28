package com.mycompany.prj_jogardado;

/*
    ANA BEATRIZ MARTINS BATISTA
    BRUNO SANTOS PROTUGAL
    MARIANE BATISTA DE SOUZA
*/
import java.util.ArrayList;

public class ControladorJogoDados {
    private Jogo jogo;
    private ArrayList<Jogador> jogadores;

    public ControladorJogoDados() {
        this.jogo = new Jogo();
        this.jogadores = new ArrayList();
    }

    public void adicionarJogador(String nome) {
        Jogador jogador = new Jogador(nome);
        jogadores.add(jogador);
    }


    public String jogarRodada(String nomeJogador) {
        // Lógica para jogar uma rodada do jogo
        // Por exemplo, aqui chamamos o método jogar() da classe Jogo
        int resultado = jogo.jogar();
        for (Jogador jogador : jogadores) {
        if (jogador.getNome().equals(nomeJogador)) {
            boolean venceu = jogo.obterResultado(resultado);
            if (venceu) {
                return jogador.getNome() + " venceu!";
            } else {
                return jogador.getNome() + " perdeu!";
            }
        }
    }
    return "Jogador não encontrado.";
    }

    // Outros métodos de controle, como reiniciar o jogo, etc.
}
