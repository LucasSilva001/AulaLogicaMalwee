package br.com.lucas;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Insira um valor: ");
		int valor01 = tec.nextInt();
		int multiplicador = 0;
		
		while(multiplicador <=10) {
			System.out.println(valor01 + "x" + multiplicador + " = " + (valor01*multiplicador));
			multiplicador += 1;
			
		}
		
		System.out.println("Fim da tabuada!");
	}

}
