package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.config.PagSeguroModule;
import br.edu.ifpb.ads.padroes.atv2.config.PaypalModule;
import br.edu.ifpb.ads.padroes.atv2.config.StripeModule;
import br.edu.ifpb.ads.padroes.atv2.service.PagamentoService;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {

        Injector paypalInjector =
                Guice.createInjector(
                        new PaypalModule()
                );

        PagamentoService paypalService =
                paypalInjector.getInstance(
                        PagamentoService.class
                );

        paypalService.pagar(100);

        Injector stripeInjector =
                Guice.createInjector(
                        new StripeModule()
                );

        PagamentoService stripeService =
                stripeInjector.getInstance(
                        PagamentoService.class
                );

        stripeService.pagar(200);

        Injector pagSeguroInjector =
                Guice.createInjector(
                        new PagSeguroModule()
                );

        PagamentoService pagSeguroService =
                pagSeguroInjector.getInstance(
                        PagamentoService.class
                );

        pagSeguroService.pagar(300);
    }
}
