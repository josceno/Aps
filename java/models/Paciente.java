package models;

import java.time.LocalDate;

public class Paciente extends Pessoa {
    private String cpf;

    public Paciente(String cpf, String nome, LocalDate dataNascimento, LocalDate dataCadastro) {
        super(nome, dataNascimento, dataCadastro);
        this.cpf = cpf;

    }
    public Paciente(String cpf, String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
        this.cpf = cpf;
        this.dataCadastro = dataCadastro.now();

    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
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
        Paciente other = (Paciente) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (dataNascimento == null) {
            if (other.dataNascimento != null)
                return false;
        } else if (!dataNascimento.equals(other.dataNascimento))
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
        return "Paciente [cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", dataCadastro="
                + dataCadastro + "]";
    }

}
