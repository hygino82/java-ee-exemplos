package br.jsf;

import be.ejb.EjbConversorTemperaturaLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.*;

@Named(value = "jsfCalculadoraTemperatura")
@RequestScoped
public class JsfCalculadoraTemperatura {

    @EJB
    private EjbConversorTemperaturaLocal ejbConversorTemperatura;

    public JsfCalculadoraTemperatura() {
    }

    @Getter
    private double kelvin;

    @Getter
    @Setter
    private double celcius;

    @Getter
    private double fahrenheit;

    public void converterTemperatura() {
        kelvin = ejbConversorTemperatura.celciusParaKelvin(celcius);
        fahrenheit = ejbConversorTemperatura.celciusParaFahrenheit(celcius);
    }
}
