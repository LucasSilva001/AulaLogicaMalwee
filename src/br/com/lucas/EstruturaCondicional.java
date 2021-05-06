package br.com.lucas;

public class EstruturaCondicional {

	public static void main(String[] args) {
		 int idade = 25;
		 
		 if(idade < 12) {
			 System.out.println("Criança");
			
		 } else if(idade < 18) {
			 System.out.println("Jovem");
			 
		 } else if(idade < 65) {
			 
		 } else {
			 System.out.println("Idoso"); 
		 }

	}

}
