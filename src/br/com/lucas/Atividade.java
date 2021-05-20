package br.com.lucas;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);
		String continuar = "s";
		
		do {
			System.out.println("Menu\r\n" +
					  "1 - Verificar sexo e idade\"\r\n" + 
					"\"2 - Contagem de valores\"\r\n" + 
					"\"3 - Tabuada\"\r\n" + 
					"\"4 - Cadastrar cursos\"");
			System.out.println("Informe a opção que deseja: ");
			int opcao = tec.nextInt();
			switch (opcao ) {
			case 1:
				System.out.println("Verificar sexo e idade");
				System.out.println("Informe o seu nome: ");
				String nome = tec.next();
				System.out.println("Informe seu ano de nascimento: ");
				int anoDeNascimento = tec.nextInt();
				int idade = 2021 - anoDeNascimento;
				System.out.println("Insira seu sexo: ");
				String sexo = tec.next();
				
				System.out.println(nome + " você nasceu no ano de " + anoDeNascimento + " tem " +
				idade + " e é do sexo " + sexo);
				
				if (sexo.equalsIgnoreCase("m")) {
					System.out.println("Você é do sexo masculino");
				} else if(sexo.equalsIgnoreCase("f")) {
					System.out.println("Você é do sexo feminino");
				} else {
					System.out.println("Opção inválida");
					break;
				}
				
				if(idade < 12) {
					System.out.println("Você é criança");
				} else if(idade > 12 && idade < 18) {
					System.out.println("Você é jovem");
				} else if(idade > 18 && idade < 65) {
					System.out.println("Adulto");
				} else if(idade > 65) {
					System.out.println("Idoso");
				}
				
				if(idade < 16) {
					System.out.println("Não pode votar");
				} else if (idade >= 16 && idade <= 17 || idade > 70) {
					System.out.println("Seu voto é opcional");
				} else if (idade >= 18 && idade <= 70) {
					System.out.println("Seu voto é obrigatório");
				}
				
				if(idade < 18) {
					System.out.println("Você não pode tirar a habilitação");
				} else if(idade >= 18) {
					System.out.println("Você pode tirar a habilitação");
				}
				
				break;
				
			case 2:
				System.out.println("Contagem de valores");
				System.out.println("Insira o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.println("Insira o segundo valor: ");
				int segundoValor = tec.nextInt();
				
				if(primeiroValor < segundoValor) {
					while(primeiroValor <= segundoValor) {
						System.out.println(primeiroValor);
						primeiroValor += 1;
					}
				} else if( primeiroValor > segundoValor) {
					while(primeiroValor >= segundoValor) {
						System.out.println(segundoValor);
						segundoValor += 1;
						
					}
				} else if( primeiroValor == segundoValor) {
					System.out.println("Valor igual ao primeiro, impossível imprimir a sequência");
				}
				
				break;
				
			case 3: 
				System.out.println("Informe um valor: ");
				int valor = tec.nextInt();
				int multiplicador = 0;
				
				while(multiplicador <= 10) {
					System.out.println(valor + " x " + multiplicador + " = " + (valor*multiplicador));
					multiplicador += 1;
					
				}
				break;
			
			case 4:
				System.out.println("Cadastrar cursos");
				String cursos[] = new String[5];
				String inserirCursos = "s";
				int aux = 0;
				
				while(inserirCursos.equalsIgnoreCase("s")) {
					System.out.println("Insira o nome do curso: ");
					cursos[aux] = tec.next();
					aux += 1;
					if(aux == 5) {
						System.out.println("!Limite máximo de cursos cadastrados!");
						
						break;
					}
					System.out.println("Deseja inserir um novo curso? [s/n]");
					inserirCursos = tec.next();
					}
				for(String curso : cursos) {
					if(curso != null) {
					System.out.println(curso);
					}
				}
				
				break;
				
			default:
				System.out.println("Opção inválida");
			}
			
			System.out.println("Deseja realizar outra operação? [s/n] ");
			continuar = tec.next();
			
		} while(continuar.equalsIgnoreCase("s"));
	 
	 

	}

}
