package application;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface GerenciadorConsultas {

    public void cadastrarMedicos();

    public void cadastrarPacientes();

    public void cadastrarConsultas();

    public void cancelarConsultas(String cpf, LocalDateTime data, String crm);

    public void exibirConsultasAgendadas(LocalDateTime data, String crm);

}
