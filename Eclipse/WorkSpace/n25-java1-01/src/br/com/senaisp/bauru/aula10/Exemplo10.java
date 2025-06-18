package br.com.senaisp.bauru.aula10;

import java.util.Scanner;

public class Exemplo10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int res = 1;
        for (int i = num ; i > 1; i--) {
        	res *= i;// res = res * i
        	//break; // Quebra o laço de repetição
        }
        System.out.println("O fatorial de " + num + " é " + res);
        sc.close();
	}

}
