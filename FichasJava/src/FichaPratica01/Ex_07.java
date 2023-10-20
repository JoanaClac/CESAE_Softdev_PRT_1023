package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double preco1, preco2, preco3, soma, totalDesconto;

        // Ler num1
        System.out.print("Insira um preco: ");
        preco1= input.nextDouble();

        // Ler num2
        System.out.print("Insira um preco: ");
        preco2 = input.nextDouble();

        // Ler num3
        System.out.print("Insira um preco: ");
        preco3 = input.nextDouble();

        // Calcular soma de preco1+preco2+preco3
        soma = preco1+preco2+preco3;

        // Apresentar a soma
       System.out.println("Soma: " + soma);

       // Calcular total com desconto de 10%
        totalDesconto = soma*0.9;

       // Apresentar total com desconto de 10%
        System.out.println("Total com desconto de 10%: " + totalDesconto);


    }
}
