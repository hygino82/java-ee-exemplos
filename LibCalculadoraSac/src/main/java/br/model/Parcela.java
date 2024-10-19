package br.model;

public class Parcela {

    private int numero;
    private double pmt;
    private double juros;
    private double amortizacao;
    private double saldo;

    public Parcela() {
    }

    public Parcela(int numero, double pmt, double juros, double amortizacao, double saldo) {
        this.numero = numero;
        this.pmt = pmt;
        this.juros = juros;
        this.amortizacao = amortizacao;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPmt() {
        return pmt;
    }

    public void setPmt(double pmt) {
        this.pmt = pmt;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getAmortizacao() {
        return amortizacao;
    }

    public void setAmortizacao(double amortizacao) {
        this.amortizacao = amortizacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
