package br.com.pflics.codigos.inutilizados;

import java.util.Date;

public class Cartao extends Usuario {

    private int idCartao;
    private String nomeTitular;
    private long cpfTitular;
    private long numero;
    private Date validade;
    private int cvv;

    public Cartao(String nomeTitular, long cpfTitular, long numero, Date validade, int cvv, long cpf) {
        super(cpf);
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.numero = numero;
        this.validade = validade;
        this.cvv = cvv;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public long getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(long cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    
}
