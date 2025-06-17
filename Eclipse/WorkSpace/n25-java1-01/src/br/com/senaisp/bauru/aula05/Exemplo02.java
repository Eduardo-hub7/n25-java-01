package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.next(); //Utiliza o delimitador padrão
        System.out.println("Seu nome é " + nome);
        //Agora pegando o nome completo
        System.out.println("Digite seu nome completo: ");
        sc.nextLine();//Captura o enter do comando anterior
        String nomeCompleto = sc.nextLine(); //Use o demilitador /n
        System.out.println("Nome completo: " + nomeCompleto);
        sc.close();
	}

}
