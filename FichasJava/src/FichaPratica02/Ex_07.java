package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        double num1;

        // Ler variaveis
        System.out.print("Insira um numero: ");
        num1= input.nextDouble();

        if(num1%2==0) { // Numero par
            System.out.println("O número é par");

        }else {
            System.out.println("O número é ímpar");

        }

    }
}
