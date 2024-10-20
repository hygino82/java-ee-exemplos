package br.jsf;

import br.model.Parcela;
import bri.ICalculadoraSac;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.*;

@Named(value = "jsfCalculadoraSac")
@RequestScoped
public class JsfCalculadoraSac {

    @EJB
    private ICalculadoraSac ejbCalculadoraSac;

    public JsfCalculadoraSac() {
    }

    @Getter
    @Setter
    private double valor;

    @Getter
    @Setter
    private double taxa;

    @Getter
    @Setter
    private int prestacoes;

    @Getter
    private List<Parcela> parcelas;

    public void calcularParcelas() {
        parcelas = ejbCalculadoraSac.gerarParcelas(valor, taxa, prestacoes);
    }
}
