package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        double salario;

        // Ler o salario
        System.out.print("Insira o salario: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            System.out.println("Taxa 20%: " + (salario * 0.2));

        } else {

            if (salario > 15000 && salario <= 20000) {
                System.out.println("Taxa 30%: " + (salario * 0.3));

            } else {

                if (salario > 20000 && salario <= 25000) {
                    System.out.println("Taxa 35%: " + (salario * 0.35));

                } else {

                    System.out.println("Taxa 40%: " + (salario * 0.40));

                }


            }


        }
    }}
