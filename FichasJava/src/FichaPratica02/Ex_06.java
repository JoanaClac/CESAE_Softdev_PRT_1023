package FichaPratica02;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1, num2;

        // Ler num1
        System.out.print("Insira um numero: ");
        num1= input.nextInt();


        // Ler num2
        System.out.print("Insira um numero: ");
        num2= input.nextInt();

        if(num1<num2) { // Maior: num2
            System.out.println("Maior: " + num2 + "\nMenor: " + num1);
        }

        if(num1>num2) { // Maior: num1
            System.out.println("Maior: " + num1 + "\nMenor: " + num2);
        }

        if(num1==num2) { // Os numeros sao iguais
            System.out.println("Os numeros sao iguais");
        }





    }
}
