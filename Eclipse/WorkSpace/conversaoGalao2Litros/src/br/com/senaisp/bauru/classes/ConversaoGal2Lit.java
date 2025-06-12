package br.com.senaisp.bauru.classes;

import java.util.Scanner;

public class ConversaoGal2Lit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Favor digitar a quantidade de galões: ");
		
		double galao = sc.nextDouble();
		double litros = galao * 3.785;

		// Fazendo a conversão e mostrando
		System.out.println(galao + " galões é igual a " + litros + " litros ");
		sc.close();
	}

}
