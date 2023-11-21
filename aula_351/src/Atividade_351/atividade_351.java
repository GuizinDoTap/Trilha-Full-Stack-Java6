package Atividade_351;

import java.util.Scanner;

public class atividade_351 {

	public static void main(String[] args) {
		int variavel;
		variavel = 23;
		
		String nome = "Soul ON";
		
		int numero = 22;
		double var = 6.9;
		boolean status = true;
		
		int number;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero");
		number = leitura.nextInt();
		System.out.println("Você digitou: " + number);
		
		String name, lastName;
		System.out.println("Digite seu Nome");
		name = leitura.nextLine();
		System.out.println("Digite seu Sobrenome");
		lastName = leitura.nextLine();
		System.out.println("Seu nome completo é: " + name + " " + lastName);
		

	}

}
