/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package be.ejb;

import javax.ejb.Local;

/**
 *
 * @author default
 */
@Local
public interface EjbConversorTemperaturaLocal {

    double celciusParaFahrenheit(double celcius);

    double celciusParaKelvin(double celcius);
}
