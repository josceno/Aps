package models;

import java.time.LocalDate;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private LocalDate dataConsulta;
    private LocalDate horaConsulta;
    private String flagDestino;
    private StatusConsulta statusConsulta;
    private double valorConsulta;

    public Consulta(Medico medico, Paciente paciente, LocalDate dataConsulta, LocalDate horaConsulta,
            String flagDestino, StatusConsulta statusConsulta, double valorConsulta) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
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

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalDate getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalDate horaConsulta) {
        this.horaConsulta = horaConsulta;
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
                + ", horaConsulta=" + horaConsulta + ", flagDestino=" + flagDestino + ", statusConsulta="
                + statusConsulta + ", valorConsulta=" + valorConsulta + "]";
    }

}
