package br.com.fiap.fakekabum.model;

public class Fabricante {

    private String nome;

    private String email;

    public Fabricante(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public String getNome() {
        return nome;
    }

    public Fabricante setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Fabricante setEmail(String email) {
        this.email = email;
        return this;
    }
}