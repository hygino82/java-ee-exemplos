package br.ejb;

import br.model.Parcela;
import bri.ICalculadoraSac;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class EjbCalculadoraSac implements ICalculadoraSac {

    @Override
    public List<Parcela> gerarParcelas(double valor, double taxa, int prestacoes) {
        List<Parcela> parcelas = new ArrayList<>();
        final double amortizacao = valor / prestacoes;
        double saldo = valor;
        double i = taxa / 100.0;

        for (int n = 1; n <= prestacoes; n++) {
            final double juros = saldo * i;
            final double pmt = amortizacao + juros;
            saldo -= amortizacao;

            parcelas.add(new Parcela(n, pmt, juros, amortizacao, saldo));
        }

        return parcelas;
    }
}
