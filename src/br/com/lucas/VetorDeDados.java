package br.com.lucas;

import java.util.Scanner;

public class VetorDeDados {

	public static void main(String[] args) {
		
		//int idade[] = new int [5];
		Scanner tec = new Scanner(System.in);
		int idade[] = {5, 18, 16, 21, 20, 4, 28, 32};
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}
		
		String addNovo = "s";
		do {
			System.out.println("informe o index do vetor: ");
			for (int i = 0; i < idade.length; i++) {
				System.out.print(i + " | ");
			}
			System.out.print("-> ");
			int index = tec.nextInt();
			
			System.out.print("Informe a idade: ");
			idade[index] = tec.nextInt();
			
			
			System.out.println("Deseja informar uma nova idade? [s/n]");
			addNovo = tec.next();
			
		}while(addNovo.equals("s"));
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println(idade[i] + " | ");
		}
		
		System.out.println("Vetor ordenado em forma crescente");
		int aux;
			for(int i = 0; i < idade.length - 1; i++) {
				for(int j = i + 1; j < idade.length; j++) {
					if(idade[i] > idade[j]) {
						aux = idade[i];
						idade[i] = idade[j];
						idade[j] = aux;
					}
				
			}

			
		}
			for(int i = 0; i < idade.length; i++) {
				System.out.println(idade[i]);
			
		}
			
	}
	}

		

