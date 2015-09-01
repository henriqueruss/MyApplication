package com.example.ti.myapplication;

/**
 * Created by ti on 01/09/15.
 */
public class Zombie {

    private String nome;
    private int idade;

    public Zombie() {
    }

    public Zombie(String nome, int idade) {
        super();
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome;
    }

}
