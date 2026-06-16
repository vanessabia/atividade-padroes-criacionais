package br.edu.ifpb.ads.padroes.atv2.sdk.stripe;

public class StripeSDK {
    public void makePayment(double valor) {

        System.out.println(
                "Pagamento realizado via Stripe: R$ "
                        + valor
        );
    }
}
