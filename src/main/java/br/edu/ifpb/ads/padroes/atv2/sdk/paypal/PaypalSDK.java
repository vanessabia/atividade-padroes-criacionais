package br.edu.ifpb.ads.padroes.atv2.sdk.paypal;

public class PaypalSDK {
    public void realizarPagamento(double valor) {

        System.out.println(
                "Pagamento realizado via PayPal: R$ "
                        + valor
        );
    }
}
