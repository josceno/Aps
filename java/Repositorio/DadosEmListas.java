package Repositorio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import application.GerenciadorConsultas;
import models.Consulta;
import models.Medico;
import models.Paciente;
import models.StatusConsulta;

public class DadosEmListas implements GerenciadorConsultas {
    public static DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static DateTimeFormatter dFormatterH = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    public static List<Medico> medicos = new ArrayList<>();
    public static List<Paciente> pacientes = new ArrayList<>();
    public static List<Consulta> consultas = new ArrayList<>();

    public static void pupuladorMedicosTeste(){
        medicos.add(new Medico("1234", "Dr. John", LocalDate.of(1980, 5, 12), LocalDate.now()));
        medicos.add(new Medico("5678", "Dr. Jane", LocalDate.of(1975, 9, 3), LocalDate.now()));
        medicos.add(new Medico("9012", "Dr. Sarah", LocalDate.of(1990, 1, 20), LocalDate.now()));
        medicos.add(new Medico("3456", "Dr. David", LocalDate.of(1985, 11, 7), LocalDate.now()));
        medicos.add(new Medico("7890", "Dr. Lisa", LocalDate.of(1970, 7, 28), LocalDate.now()));
        System.out.println("Populador de Medicos de teste acionado");
    }
    public static void pupuladorPacientesTeste(){
        pacientes.add(new Paciente("111.111.111-11", "John Doe", LocalDate.of(1990, 5, 12), LocalDate.now()));
        pacientes.add(new Paciente("222.222.222-22", "Jane Doe", LocalDate.of(1985, 9, 3), LocalDate.now()));
        pacientes.add(new Paciente("333.333.333-33", "Sarah Smith", LocalDate.of(1995, 1, 20), LocalDate.now()));
        pacientes.add(new Paciente("555.555.555-55", "Lisa Williams", LocalDate.of(1975, 7, 28), LocalDate.now()));
        System.out.println("Populador de Pacientes de teste acionado");
    }
    public static void populadorConsultaTeste(){
        Paciente paciente =  new Paciente("111.111.111-11", "John Doe", LocalDate.of(1990, 5, 12));
        Medico medico = new Medico("5678", "Dr. Jane", LocalDate.of(1975, 9, 3));
        DadosEmListas dl = new DadosEmListas();
        double valorConsulta = (dl.testasPrimeiraConsulta(paciente)) ? 300.00:350.00;
        consultas.add( new Consulta(medico, paciente, LocalDateTime.of(2023, 10, 10, 20, 0), "testo", StatusConsulta.AGENDADA, valorConsulta));
       
        Paciente paciente1 =  new Paciente("111.111.111-21", "John Doe", LocalDate.of(1990, 5, 12));
        Medico medico1 = new Medico("1234", "Dr. Jone", LocalDate.of(1975, 9, 3));
        DadosEmListas dl1 = new DadosEmListas();
        double valorConsulta1 = (dl1.testasPrimeiraConsulta(paciente1)) ? 300.00:350.00;
        consultas.add( new Consulta(medico1, paciente1, LocalDateTime.of(2023, 10, 10, 20, 0), "testo", StatusConsulta.AGENDADA, valorConsulta1));

        Paciente paciente12 =  new Paciente("111.111.111-21", "John Doe", LocalDate.of(1990, 5, 12));
        Medico medico12 = new Medico("5678", "Dr. Jone", LocalDate.of(1975, 9, 3));
 
        double valorConsulta12 = (dl1.testasPrimeiraConsulta(paciente1)) ? 300.00:350.00;
        consultas.add( new Consulta(medico1, paciente1, LocalDateTime.of(2023, 10, 10, 20, 0), "testo", StatusConsulta.AGENDADA, valorConsulta12));
    }

    @Override
    public void cadastrarMedicos() {
       
        System.out.println("Cadastre o medico");
        System.out.print("CRM ");
        String crm = new Scanner(System.in).next();
        System.out.print("NOME ");
        String nome = new Scanner(System.in).nextLine();
        System.out.print("DATA NASCIMENTO (dd/MM/yyyy) ");
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
        System.out.print("DATA NASCIMENTO (dd/MM/yyyy) ");
        LocalDate dataAniversario = LocalDate.parse(new Scanner(System.in).next(), dFormatter);
        LocalDate dataCadastro = LocalDate.now();

        pacientes.add(new Paciente(cpf, nome, dataAniversario, dataCadastro));
        System.out.println("cadastro inserido com sucesso");
    }

    @Override
    public void cadastrarConsultas() {
        System.out.print("insira o cpf do paciente: ");
        Paciente paciente = pegarPorCpf(new Scanner(System.in).next());
        System.out.print("insira o crm do paciente: ");
        Medico medico = pegarPorCrm(new Scanner(System.in).next());
        System.out.print("DATA HORA (dd/MM/yyyy HH:MM) ");
        LocalDateTime dataConsulta = LocalDateTime.parse(new Scanner(System.in).nextLine(), dFormatterH);
        System.out.print("insira flag Destino: ");
        String flagDestino = new Scanner(System.in).nextLine();
        StatusConsulta status = StatusConsulta.AGENDADA;
        System.out.println("valor da consulta: ");
        double valorConsulta = (testasPrimeiraConsulta(paciente)) ? 300.00:350.00;
        int codigo = consultas.size();
        
        consultas.add(new Consulta(codigo, medico, paciente, dataConsulta, flagDestino, status, valorConsulta));
        
        System.out.println("Cadastro inserido com sucesso");
    }
    public boolean testasPrimeiraConsulta(Paciente paciente){
        for (Consulta consulta : consultas) {
            if(consulta.getPaciente().getCpf() == paciente.getCpf()){
                return false;
            }          
        }
        return true;
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
    public void cancelarConsultas(String cpf, LocalDateTime data, String crm) {
        for (int i = 0; i<consultas.size(); i++) {
            if(consultas.get(i).getPaciente().getCpf().equals(cpf) && consultas.get(i).getDataConsulta().equals(data) && consultas.get(i).getMedico().getCrm().equals(crm)){
                consultas.get(i).setStatusConsulta(StatusConsulta.CANCELADA);
                System.out.println(consultas.get(i)+":  cancelada com sucesso");
            }
        }

    }

    @Override
    public void exibirConsultasAgendadas(LocalDateTime data, String crm) {
        for (Consulta consulta : consultas) {
            if(consulta.getDataConsulta().equals(data) && consulta.getMedico().getCrm().equals(crm)){
                System.out.println(consulta);
                System.out.println("-----------------------------");
            }else if(data.equals(null) || data.equals("") && crm.equals(null) || crm.equals("")){
                System.out.println("Nenhum filtro encotrando, exibindo todas as consultas: ");
                consultas.forEach(System.out::println);
            }
            
        }
       
    }

}
