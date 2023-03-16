package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Medico extends Pessoa {
    private String crml;

    public Medico(String crml, String nome, LocalDate dataNascimento, LocalDate dataCadastro) {
        super(nome, dataNascimento, dataCadastro);
        this.crml = crml;

    }

    public String getCrml() {
        return crml;
    }

    public void setCrml(String crml) {
        this.crml = crml;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((crml == null) ? 0 : crml.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Medico other = (Medico) obj;
        if (crml == null) {
            if (other.crml != null)
                return false;
        } else if (!crml.equals(other.crml))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (dataCadastro == null) {
            if (other.dataCadastro != null)
                return false;
        } else if (!dataCadastro.equals(other.dataCadastro))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Medico [crml=" + crml + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", dataCadastro="
                + dataCadastro + "]";
    }

}