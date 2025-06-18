package br.com.senaisp.bauru.aula11;

import java.util.Scanner;

public class Exemplo11 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exemplo de uso do continue");
        for(int i = 0; i < 5; i++) {
        	if (i==3) continue;
        	System.out.println(i);
        }
        sc.close();
	}

}
