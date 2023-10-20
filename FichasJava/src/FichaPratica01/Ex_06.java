package FichaPratica01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        // Ler valor1
        System.out.print("Insira um numero: ");
        valor1 = input.nextInt();

        // Ler valor2
        System.out.print("Insira um numero: ");
        valor2 = input.nextInt();

        // Apresentar valor1 e valor2
        System.out.println("\nValor1: " + valor1);
        System.out.println("Valor2: " + valor2);


        // Trocar as variáveis
        System.out.println("\nA trocar as variáveis...");
//        int aux;
//        aux = valor1;
//
//        valor1=valor2;
//        valor2=aux

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // Apresentar valor1 e valor2
        System.out.println("\nValor1: " + valor1);
        System.out.println("Valor2: " + valor2);


    }
}
