package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        double nota1, nota2, nota3, mediaPonderada;

        // ler nota1
        System.out.print("Insira a nota1 entre 0 e 20 valores: ");
        nota1 = input.nextDouble();


        // Ler nota2
        System.out.print("Insira a nota2 entre 0 e 20 valores: ");
        nota2 = input.nextDouble();


        // Ler nota3
        System.out.print("Insira a nota3 entre 0 e 20 valores: ");
        nota3 = input.nextDouble();


        // Calcular media ponderada
        mediaPonderada = (nota1*0.25) + (nota2*0.35) + (nota3*0.40);

        // Apresentar media ponderada
        System.out.println("Media Ponderada: " + mediaPonderada);

        if(mediaPonderada>9.5) {// Aprovação
            System.out.println("\nO aluno está aprovado.");

        }else {
            System.out.println("\nO aluno não está aprovado.");

        }




    }
}
