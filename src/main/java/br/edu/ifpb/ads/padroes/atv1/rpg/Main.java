package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;

public class Main {

    public static void main(String[] args) {

        Personagem p1 =
                CriadorPersonagem.criarPersonagem(
                        "Aragorn",
                        "Humano",
                        "Guerreiro"
                );

        Personagem p2 =
                CriadorPersonagem.criarPersonagemEspecial(
                        "Aragorn",
                        "Humano",
                        "Guerreiro"
                );

        System.out.println(p1);
        System.out.println(p2);

        ConfiguracaoJogo config =
                ConfiguracaoJogo.getInstance();

        System.out.println(
                config.getNivelDificuldade()
        );
    }
}
