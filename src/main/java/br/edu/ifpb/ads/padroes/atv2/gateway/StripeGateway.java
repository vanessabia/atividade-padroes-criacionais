package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.stripe.StripeSDK;

public class StripeGateway implements PagamentoGateway {

    private final StripeSDK sdk;

    public StripeGateway() {
        this.sdk = new StripeSDK();
    }

    @Override
    public void pagar(double valor) {
        sdk.makePayment(valor);
    }
}