package br.com.pflics.codigos.inutilizados;

public class Cupons {

    private String TonkenCupon;
    private double desconto;

    public Cupons(String TonkenCupon, double desconto) {
        this.TonkenCupon = TonkenCupon;
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getTonkenCupon() {
        return TonkenCupon;
    }

    public void setTonkenCupon(String TonkenCupon) {
        this.TonkenCupon = TonkenCupon;
    }

    
}
