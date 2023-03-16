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
        System.out.println("Cadastre o medico");
        System.out.print("CRM ");
        String crm = new Scanner(System.in).next();
        System.out.print("NOME ");
        String nome = new Scanner(System.in).nextLine();
        System.out.print("DAATA NASCIMENTO (dd-MM-yyyy) ");
        LocalDate dataAniversario = LocalDate.parse(new Scanner(System.in).next(), dFormatter);
        LocalDate dataCadastro = LocalDate.now();

        medicos.add(new Medico(crm, nome, dataAniversario, dataCadastro));
        System.out.println("cadastro inserido com sucesso");
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
