package models;

import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected LocalDate dataCadastro;

    public Pessoa(String nome, LocalDate dataNascimento, LocalDate dataCadastro) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
