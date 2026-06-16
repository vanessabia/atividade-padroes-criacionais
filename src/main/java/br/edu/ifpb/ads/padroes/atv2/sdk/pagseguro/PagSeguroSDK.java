package br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro;

public class PagSeguroSDK {
    public void processarPagamento(double valor) {

        System.out.println(
                "Pagamento realizado via PagSeguro: R$ "
                        + valor
        );
    }
}
