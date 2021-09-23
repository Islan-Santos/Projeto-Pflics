package br.com.pflics.codgin;

public class User {

    private String cpf;
    private String login;
    private String senha;
    private String perfil;

    public User() {
    }

    public User(String cpf, String login, String senha, String perfil) {
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "User{" + "cpf=" + cpf + ", login=" + login + ", senha=" + senha + ", perfil=" + perfil + '}';
    }

}
