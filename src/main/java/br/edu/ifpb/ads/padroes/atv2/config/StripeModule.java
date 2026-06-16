package br.edu.ifpb.ads.padroes.atv2.config;

import com.google.inject.AbstractModule;
import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.StripeGateway;

public class StripeModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(PagamentoGateway.class)
                .to(StripeGateway.class);
    }
}
