package br.com.lucas;

public class LacoDeRepeticaoWhile {

	public static void main(String[] args) {

		int valor = 0;
		
		System.out.println("Valor : " + valor );
		
		while(valor < 25) {
			System.out.println("-> Valor: " + valor);
			 valor++;
			// valor += 1;
			// valor = valor +1;
		}
		
		System.out.println("Agora valor �: "+ valor);
	}

}
