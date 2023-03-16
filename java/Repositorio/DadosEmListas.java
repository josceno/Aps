package Repositorio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.GerenciadorConsultas;
import models.Consulta;
import models.Medico;
import models.Paciente;

public class DadosEmListas implements GerenciadorConsultas {
    public static DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static List<Medico> medicos = new ArrayList<>();
    public static List<Paciente> pacientes = new ArrayList<>();
    public static List<Consulta> consultas = new ArrayList<>();

    @Override
    public void cadastrarMedicos() {
        String crm = new Scanner(System.in).next();
        String nome = new Scanner(System.in).nextLine();
        LocalDate dataAniversario = LocalDate.parse(new Scanner(System.in).next(), dFormatter);
    }

    @Override
    public void cadastrarPacientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarPacientes'");
    }

    @Override
    public void cadastrarConsultas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarConsultas'");
    }

    @Override
    public void cancelarConsultas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarConsultas'");
    }

    @Override
    public void exibirConsultasAgendadas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirConsultasAgendadas'");
    }

}
