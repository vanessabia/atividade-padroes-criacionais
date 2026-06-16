package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.EquipamentoFactory;

public class MagoFactory extends ClasseFactory {

    @Override
    public EquipamentoFactory criarEquipamentos() {

        return new EquipamentoFactory() {

            @Override
            public Arma criarArma() {
                return new Arma("Cajado Mágico", 15, "Cajado");
            }

            @Override
            public Armadura criarArmadura() {
                return new Armadura("Vestes Mágicas", 8, "Leve");
            }
        };
    }
}