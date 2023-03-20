package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Repositorio.DadosEmListas;

class Program {

    public static void main(String[] args) {
        GerenciadorConsultas gerenciadorConsultas = new DadosEmListas();
        DadosEmListas.pupuladorMedicosTeste();
        DadosEmListas.pupuladorPacientesTeste();
        DateTimeFormatter dFormatterH = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        while(true){
            
         
            System.out.println("Cadastro de Médicos (1)");    
            System.out.println("Cadastro de Pacientes (2)");    
            System.out.println("Cadastro de Consultas  (3)");    
            System.out.println("Cancelamento de Consultas (filtro por CPF do Paciente + Data + CRM) (4)");    
            System.out.println("Consultas Agendadas (filtro por data e CRM) (5)");    
            int opcao = new Scanner(System.in).nextInt();

            switch(opcao){
                case 1:
                    gerenciadorConsultas.cadastrarMedicos();
                    break;
                case 2:
                    gerenciadorConsultas.cadastrarPacientes();
                    break;
                case 3:
                    gerenciadorConsultas.cadastrarConsultas();
                    break;
                case 4:
                    System.out.println("Filtro para cancelamento:");
                    System.out.print("cpf: ");
                    String cpf = new Scanner(System.in).next();
                    System.out.print("Data da consulta (dd/MM/yyy HH:mm): ");
                    LocalDateTime data = LocalDateTime.parse(new Scanner(System.in).nextLine(),dFormatterH);
                    System.out.print("crm: ");
                    String crm = new Scanner(System.in).next();
                    
                    gerenciadorConsultas.cancelarConsultas(cpf, data, crm);
                    break;
                case 5:
                    System.out.println("Filtro para exibição:");
                    System.out.print("crm: ");
                    String crmf = new Scanner(System.in).next();
                    System.out.print("Data da consulta (dd/MM/yyy HH:mm): ");
                    LocalDateTime dataf = LocalDateTime.parse(new Scanner(System.in).next(),dFormatterH);
                    
                    gerenciadorConsultas.exibirConsultasAgendadas(dataf,crmf);
                    break;   
            }
            
            if(opcao == 0){
                System.out.println("Encerrando programa...");    
                break;
            } 
        }
    }
}