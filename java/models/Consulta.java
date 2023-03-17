package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private LocalDateTime dataConsulta;
    private String flagDestino;
    private StatusConsulta statusConsulta;
    private double valorConsulta;

    public Consulta(Medico medico, Paciente paciente, LocalDateTime dataConsulta, LocalDate horaConsulta,
            String flagDestino, StatusConsulta statusConsulta, double valorConsulta) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataConsulta = dataConsulta;
        this.flagDestino = flagDestino;
        this.statusConsulta = statusConsulta;
        this.valorConsulta = valorConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getFlagDestino() {
        return flagDestino;
    }

    public void setFlagDestino(String flagDestino) {
        this.flagDestino = flagDestino;
    }

    public StatusConsulta getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(StatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public String toString() {
        return "Consulta [medico=" + medico + ", paciente=" + paciente + ", dataConsulta=" + dataConsulta
                + ", flagDestino=" + flagDestino + ", statusConsulta="
                + statusConsulta + ", valorConsulta=" + valorConsulta + "]";
    }

}
