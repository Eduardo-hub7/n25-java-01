package br.com.senaisp.bauru.aula08;

import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Utilizando uma estrutura while
        String res="";
        while (!res.equals("S") && !res.equals("N")) {
        	System.out.println("Digite S ou N:");
        	res = sc.nextLine();
        }
        System.out.println("Saiu");
        sc.close();
	}

}
