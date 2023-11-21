package aula_368;

import java.util.Scanner;

public class aula_368 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um numero");
		numero = leitura.nextInt();
		
		for(int i = 0; i < numero ; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		int resultado = 0;
		
		for(int i = 0; i < 15 ; i++) {
			resultado = resultado + i;
		}
		
		System.out.println("A soma dos numeros de 1 a 15 é " + resultado);
		
		int num;
		int soma = 0;
		System.out.println("Digite um numero");
		num = leitura.nextInt();
		
		for(int i = 0; i < numero ; i++) {
			
			if(i%2 == 0) {
				soma = soma + i;
			}
		}
		
		System.out.println("A soma dos numeros  é " + soma);
		
		Scanner lei = new Scanner(System.in);
		int idade;
		int somar = 0, media = 0;
		
		for(int i = 0; i < 5 ; i++) {
			
			System.out.println("Digite sua idade");
			idade = lei.nextInt();
			
			somar = somar + idade;
			media = soma / 5;
		}
		
		System.out.println("A soma de idades é " + somar);
		System.out.println("A media de idades é " + media);
	}
}
	
	
