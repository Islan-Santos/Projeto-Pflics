package br.com.pflics.codigos.inutilizados;


public class Planos {

    private int idPlano;
    private String nomePlano;
    private String beneficios;
    private double preco;

    public Planos() {
    }

    public Planos(String nomePlano, String beneficios, int preco) {
        this.nomePlano = nomePlano;
        this.beneficios = beneficios;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
    
    
}
