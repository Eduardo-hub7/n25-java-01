package br.com.senaisp.bauru.aula06;

import java.util.Scanner;

public class Exemplo06 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 5:");
        int vlr = sc.nextInt();
        switch(vlr) {
        case 1 -> System.out.println("Você ganhou uma caneta!");
        case 2 -> System.out.println("Você ganhou um lápis!");
        case 3 -> System.out.println("Você ganhou uma borracha!");
        case 4 -> System.out.println("Você ganhou bombom!");
        case 5 -> System.out.println("Você ganhou uma bala!");
        default -> System.out.println("Opção inválida!");
        }
        sc.close();
	}

}
