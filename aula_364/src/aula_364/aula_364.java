package aula_364;

import java.util.Scanner;

public class aula_364 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um numero e irei dizer se é par ou impar: ");
		numero = leitura.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("O numero digitado é par!");
		} else {
			System.out.println("O numero digitado é impar!");
		}
		
		int num, num2;
		System.out.println("Digite um numero:");
		num = leitura.nextInt();
		System.out.println("Digite outro numero:");
		num2 = leitura.nextInt();
		
		if(num > num2) {
			System.out.println("O primeiro numero digitado é maior que o segundo!");
		} else {
			System.out.println("O segundo numero digitado é maior que o primeiro!");
		}
		
		
		
		Scanner idades = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua Idade: ");
		idade = idades.nextInt();
		
		System.out.println((idade >= 18) ? "Voce é maior de idade !" : "Voce é menor de idade!");
		
		
		Scanner letras = new Scanner(System.in);
		char letra;
		System.out.println("Digite sua Idade: ");
		letra = letras.next().charAt(0);
		
		System.out.println((letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') ? "A letra digitada é vogal" : "A letra digitada não é vogal");
	}

}
