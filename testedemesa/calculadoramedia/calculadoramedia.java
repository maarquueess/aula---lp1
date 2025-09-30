package calculadora;

import java.util.Scanner;

public class calculadoramedia {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Leitura das entradas
	        System.out.print("Digite a nota P1: ");
	        double P1 = scanner.nextDouble();

	        System.out.print("Digite a nota E1: ");
	        double E1 = scanner.nextDouble();

	        System.out.print("Digite a nota E2: ");
	        double E2 = scanner.nextDouble();

	        System.out.print("Digite a nota X: ");
	        double X = scanner.nextDouble();

	        System.out.print("Digite a nota SUB: ");
	        double SUB = scanner.nextDouble();

	        System.out.print("Digite a nota API: ");
	        double API = scanner.nextDouble();

	        // Cálculo da Base
	        double base = (P1 * 0.5) + (E1 * 0.2) + (E2 * 0.3) + X + (SUB * 0.15);

	        // Cálculo da média final
	        double mediaFinal;
	        double mediaComAPI = (base * 0.5) + (base > 5.9 ? API * 0.5 : 0);

	        if (mediaComAPI < 6) {
	            mediaFinal = base * 0.5;
	        } else {
	            mediaFinal = mediaComAPI;
	        }

	        // Limitar a nota máxima em 10
	        if (mediaFinal > 10) {
	            mediaFinal = 10;
	        }

	        // Arredondar para 1 casa decimal
	        mediaFinal = Math.round(mediaFinal * 10.0) / 10.0;

	        // Exibir resultado
	        System.out.println("A média final do aluno é: " + mediaFinal);

	        scanner.close();
	    }
	}
