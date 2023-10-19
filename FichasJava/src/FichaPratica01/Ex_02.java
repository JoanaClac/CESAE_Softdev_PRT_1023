package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, soma, subtracao, multiplicacao, divisao;

        // Ler num1
        System.out.print("Insira um numero: ");
        num1= input.nextInt();

        // Ler num2
        System.out.print("Insira um numero: ");
        num2 = input.nextInt();

        // Calcular a soma de num1+num2
        soma = num1+num2;

        // Apresentar a soma
        System.out.println("Soma: " + soma);

        // Calcular a subtracao de num1-num2
        subtracao = num1-num2;

        // Apresentar a subtracao
        System.out.println("Subtracao: " + subtracao);

        // Calcular a multiplicacao de num1*num2
        multiplicacao = num1*num2;

        // Apresentar a multiplicacao
        System.out.println("Multiplicacao: " + multiplicacao);

        // Calcular a divisão de num1/num2
        divisao = num1/num2;

        // Apresentar a divisao
        System.out.println("Divisao: " + divisao);

    }
}
