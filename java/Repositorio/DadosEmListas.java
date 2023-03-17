package Repositorio;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    public static DateTimeFormatter dFormatterH = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM");
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
        System.out.print("DATA NASCIMENTO (dd-MM-yyyy) ");
        LocalDate dataAniversario = LocalDate.parse(new Scanner(System.in).next(), dFormatter);
        LocalDate dataCadastro = LocalDate.now();

        medicos.add(new Medico(crm, nome, dataAniversario, dataCadastro));
        System.out.println("cadastro inserido com sucesso");
    }

    @Override
    public void cadastrarPacientes() {
        System.out.println("Cadastre o medico");
        System.out.print("CPF ");
        String cpf = new Scanner(System.in).next();
        System.out.print("NOME ");
        String nome = new Scanner(System.in).nextLine();
        System.out.print("DATA NASCIMENTO (dd-MM-yyyy) ");
        LocalDate dataAniversario = LocalDate.parse(new Scanner(System.in).next(), dFormatter);
        LocalDate dataCadastro = LocalDate.now();

        pacientes.add(new Paciente(cpf, nome, dataAniversario, dataCadastro));
        System.out.println("cadastro inserido com sucesso");
    }

    @Override
    public void cadastrarConsultas() {
        System.out.println("insira o cpf do paciente");
        Paciente paciente = pegarPorCpf(new Scanner(System.in).next());
        System.out.println("insira o crm do paciente");
        Medico medico = pegarPorCrm(new Scanner(System.in).next());
        System.out.print("DATA HORA (dd-MM-yyyy) ");
        LocalDateTime dataConsulta = LocalDateTime.parse(new Scanner(System.in).next(), dFormatterH);
        System.out.print("insira flag Destino");
        String flagDestino = new Scanner(System.in).nextLine();

    }

    public Paciente pegarPorCpf(String cpf) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCpf().equals(cpf)) {
                return paciente;
            }
        }
        return null;
    }

    public Medico pegarPorCrm(String crm) {
        for (Medico medico : medicos) {
            if (medico.getCrm().equals(crm)) {
                return medico;
            }
        }
        return null;
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
