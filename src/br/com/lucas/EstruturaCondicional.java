package br.com.lucas;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		 int idade = 25;
		 
		 if(idade < 12) {
			 System.out.println("Crian�a");
			
		 } else if(idade > 12 && idade < 18) {
			 System.out.println("Jovem");
			 
		 } else if(idade >= 18 && idade < 65) {
			 System.out.println("Adulto");
		 } else {
			 System.out.println("Idoso"); 
			 
		 }

	}

}
