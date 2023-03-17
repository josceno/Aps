package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Medico extends Pessoa {
    private String crm;

    public Medico(String crm, String nome, LocalDate dataNascimento, LocalDate dataCadastro) {
        super(nome, dataNascimento, dataCadastro);
        this.crm = crm;

    }

    public String getCrm() {
        return crm;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((crm == null) ? 0 : crm.hashCode());
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
        if (crm == null) {
            if (other.crm != null)
                return false;
        } else if (!crm.equals(other.crm))
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
        return "Medico [crm=" + crm + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", dataCadastro="
                + dataCadastro + "]";
    }

}