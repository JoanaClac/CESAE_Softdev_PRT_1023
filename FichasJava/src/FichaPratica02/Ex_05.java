package FichaPratica02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1, num2;
        // Ler num1
        System.out.print("Insira um numero: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Insira um numero: ");
        num2= input.nextInt();

        if(num1>num2) { // Maior: num1
            System.out.println("Menor: " + num2 + "\nMaior: " + num1);
        }

        if(num1<num2) { // Maior: num2
            System.out.println("Menor: " + num1 + "\nMaior: " + num2);
        }

        if(num1==num2) // Numeros sao iguais
            System.out.println("Sao iguais");






    }
}
