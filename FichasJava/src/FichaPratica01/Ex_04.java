package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        final double PI = 3.1415;
        double area, raio;

        // Ler raio
        System.out.print("Insira o raio: ");
        raio= input.nextDouble();

        // Apresentar raio
        System.out.println("Raio: " + raio);

        // Calcular a area
        area = PI*(raio*raio);

        // Apresentar area
        System.out.println("Area: " + area);








    }
}
