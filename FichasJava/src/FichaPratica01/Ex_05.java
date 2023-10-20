package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double media, mediaPonderada,num1, num2, num3, soma;

        // Ler num1
        System.out.print("Insira um numero: ");
        num1= input.nextDouble();

        // Ler num2
        System.out.print("Insira um numero: ");
        num2 = input.nextDouble();

        // Ler num3
        System.out.print("Insira um numero: ");
        num3 = input.nextDouble();

        // Calcular a soma de num1+num2+num3
        soma = num1+num2+num3;

        // Apresentar a soma
        System.out.println("Soma: " + soma);

        // Calcular media aritmetica
        media = soma/3;

        // Apresentar media aritmetia
        System.out.println("Media: " + media);

        // Calcular media ponderada
        mediaPonderada = (num1*0.2) + (num2*0.3) + (num3*0.5);

        // Apresentar media ponderada
        System.out.println("Media Ponderada: " + mediaPonderada);



    }
}
