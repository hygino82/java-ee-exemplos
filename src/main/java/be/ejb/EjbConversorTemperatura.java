package be.ejb;

import javax.ejb.Stateless;

@Stateless
public class EjbConversorTemperatura implements EjbConversorTemperaturaLocal {

    @Override
    public double celciusParaFahrenheit(double celcius) {
        return (9 * celcius) / 5 + 32;
    }

    @Override
    public double celciusParaKelvin(double celcius) {
        return 273 + celcius;
    }
}
