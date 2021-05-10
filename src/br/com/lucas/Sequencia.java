package br.com.lucas;

import java.util.Scanner;

public class Sequencia {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		
		if (valor1 < valor2) {
			while (valor1 <= valor2)	{
				System.out.println(valor1);
				valor1 += 1;
				
				}
		}
		else if (valor1 > valor2) {
			while (valor1 >= valor2) {
				System.out.println(valor1); 
				valor1 -= 1;
				
				}
			}
		}
		
	}

	


