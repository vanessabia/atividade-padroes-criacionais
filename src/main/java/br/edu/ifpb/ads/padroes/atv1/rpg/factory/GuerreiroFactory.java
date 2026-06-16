package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.EquipamentoFactory;

public class GuerreiroFactory extends ClasseFactory {

    @Override
    public EquipamentoFactory criarEquipamentos() {

        return new EquipamentoFactory() {

            @Override
            public Arma criarArma() {
                return new Arma("Espada de Ferro", 25, "Espada");
            }

            @Override
            public Armadura criarArmadura() {
                return new Armadura("Armadura de Placas", 20, "Pesada");
            }
        };
    }
}