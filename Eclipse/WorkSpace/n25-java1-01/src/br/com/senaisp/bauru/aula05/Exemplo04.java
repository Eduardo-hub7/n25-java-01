package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento:");
        String dtNasc = sc.nextLine();
        //Criando um scanner de apoio
        Scanner sc2 = new Scanner(dtNasc); // Passando o texto
        sc2.useDelimiter("/"); //Mudando o delimitador para /
        int dia = sc2.nextInt();
        int mes = sc2.nextInt();
        int ano = sc2.nextInt();
        System.out.println("Você tem " + (2025 - ano) + " anos");
        sc.close();
        sc2.close();
        //Verificando se o mês é válido
        switch(mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	if (dia>1 && dia<=31) {
        		System.out.println("Data Válida!");
        	} else {
        		System.out.println("Data Inválida");
        	}
        	break;
        case 4:
        case 6:
        case 9:
        case 11:
        	if (dia>=1 && dia<=30) {
        		System.out.println("Data Válida");
        	} else {
        		System.out.println("Data Inválida");
        	}
        	break;
        case 2:
        	if (dia>=1 && dia <=28 || dia==29 && ano % 4 == 0) {
        		System.out.println("Data Válida");
        	} else {
        		System.out.println("Data Inválida");
        	}
        	break;
        default: System.out.println("Data Inválida!");
        }
	}

}
