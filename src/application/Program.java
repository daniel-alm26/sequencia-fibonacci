package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int anterior = 0;
		int atual = 0;
		int numero;
		
		System.out.print("Digite o numero que deseja pesquisar na sequencia fibonacci: ");
		numero = sc.nextInt();
		
	
		for (int contador = 1; contador <= 12; contador++) {
			if (contador == 1) {
				atual = 1;
				anterior = 0;
			} else {
				atual += anterior;
				anterior = atual - anterior;
			}

			System.out.println(atual + " ");	
			
			if (numero == atual) {
				System.out.println("Este numero pertece a sequencia Fibonacci");
			}
			else {			
				System.out.println("Este numero não pertence a sequencia Fibonacci");
			}	
		
		}
		
		
		
		
		
		sc.close();
	}
}
