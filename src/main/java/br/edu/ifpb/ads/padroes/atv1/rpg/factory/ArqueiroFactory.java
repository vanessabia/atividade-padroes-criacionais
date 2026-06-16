package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.EquipamentoFactory;

public class ArqueiroFactory extends ClasseFactory {

    @Override
    public EquipamentoFactory criarEquipamentos() {

        return new EquipamentoFactory() {

            @Override
            public Arma criarArma() {
                return new Arma("Arco Élfico", 20, "Arco");
            }

            @Override
            public Armadura criarArmadura() {
                return new Armadura("Armadura de Couro", 12, "Média");
            }
        };
    }
}