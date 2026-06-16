package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.paypal.PaypalSDK;

public class PaypalGateway implements PagamentoGateway {

    private final PaypalSDK sdk;

    public PaypalGateway() {
        this.sdk = new PaypalSDK();
    }

    @Override
    public void pagar(double valor) {
        sdk.realizarPagamento(valor);
    }
}