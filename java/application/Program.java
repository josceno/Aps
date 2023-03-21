package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import Repositorio.DadosEmListas;
import models.exceptions.FalhaPesquisa;

class Program {

    public static void main(String[] args) {
        GerenciadorConsultas gerenciadorConsultas = new DadosEmListas();
        DadosEmListas.pupuladorMedicosTeste();
        DadosEmListas.pupuladorPacientesTeste();
        DadosEmListas.populadorConsultaTeste();
        DateTimeFormatter dFormatterH = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        while(true){
            
            System.out.println("Cadastro de Médicos (1)");    
            System.out.println("Cadastro de Pacientes (2)");    
            System.out.println("Cadastro de Consultas  (3)");    
            System.out.println("Cancelamento de Consultas (filtro por CPF do Paciente + Data + CRM) (4)");    
            System.out.println("Consultas Agendadas (filtro por data e CRM) (5)");    
            
            int opcao; 
            do{
                System.out.print("-> ");
                opcao = new Scanner(System.in).nextInt();
            }while(opcao != 1 && opcao !=2 && opcao != 3  && opcao != 4 && opcao !=5 && opcao !=0);

            switch(opcao){
                case 1:
                    try {
                        gerenciadorConsultas.cadastrarMedicos();
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de data invalido, verifique se a data cadastra esta no fomato dia/mês/ano"
                        +"\n (observação o dia e mês devem contar dois digitos e o mês precisa ser menor do que 12 o ano deve conter 4 digitos e os items devem se separados por '/')");
                    }finally{
                        break;
                    } 
                    
                case 2:
                    try {
                        gerenciadorConsultas.cadastrarPacientes();
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de data invalido, verifique se a data cadastra esta no fomato dia/mês/ano"
                        +"\n (observação o dia e mês devem contar dois digitos e o mês precisa ser menor do que 12 o ano deve conter 4 digitos e os items devem se separados por '/')");
                    }finally{
                        break;
                    }
                case 3:
                    try {
                        gerenciadorConsultas.cadastrarConsultas();
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de data invalido, verifique se a data cadastra esta no fomato dia/mês/ano hora:minuto"
                        +"\n (observação o dia, mês,hora e minuto devem contar dois digitos e o mês precisa ser menor do que 12 o ano deve conter 4 digitos e os items devem se separados por '/')");
                    }catch(FalhaPesquisa e){
                        System.out.println(e.getMessage());
                    } finally{
                        break;
                    }
                case 4:
                    try {
                        System.out.println("Filtro para cancelamento:");
                        System.out.print("cpf: ");
                        String cpf = new Scanner(System.in).next();
                        System.out.print("Data da consulta (dd/MM/yyyy HH:mm): ");
                        LocalDateTime data = LocalDateTime.parse(new Scanner(System.in).nextLine(),dFormatterH);
                        System.out.print("crm: ");
                        String crm = new Scanner(System.in).next();
                        
                        gerenciadorConsultas.cancelarConsultas(cpf, data, crm);
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de data invalido, verifique se a data cadastra esta no fomato dia/mês/ano hora:minuto"
                        +"\n (observação: os campos dia,mês,hora e minuto devem contar dois digitos e o mês precisa ser menor do que 12 o ano deve conter 4 digitos e os items devem se separados por '/')");
                    } catch (FalhaPesquisa e){
                        System.out.println(e.getMessage());
                    } 
                    finally{
                        break;
                    }
                    
                case 5:
                    try {
                        System.out.println("Filtro para exibição:");
                        System.out.print("crm: ");
                        String crmf = new Scanner(System.in).next();
                        System.out.print("Data da consulta (dd/MM/yyy HH:mm): ");
                        LocalDateTime dataf = LocalDateTime.parse(new Scanner(System.in).nextLine(),dFormatterH);
                        
                        gerenciadorConsultas.exibirConsultasAgendadas(dataf,crmf);
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de data invalido, verifique se a data cadastra esta no fomato dia/mês/ano hora:minuto"
                        +"\n (observação: os campos dia,mês,hora e minuto devem contar dois digitos e o mês precisa ser menor do que 12 o ano deve conter 4 digitos e os items devem se separados por '/')");
                    }catch (FalhaPesquisa e){
                        System.out.println(e.getMessage());
                    }finally{
                        break;
                    }
            
            }
            
            if(opcao == 0){
                System.out.println("Encerrando programa...");    
                break;
            } 
        }
    }
}