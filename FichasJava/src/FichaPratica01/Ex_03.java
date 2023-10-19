package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, area, perimetro;

        // Ler num1 (largura)
        System.out.print("Insira um numero: ");
        num1 = input.nextInt();

        // Ler num2 (altura)
        System.out.print("Insira um numero: ");
        num2 = input.nextInt();

        // Calcular area
        area = num1*num2;

        // Apresentar area
        System.out.println("Area: " + area);

        // Calcular perimetro
        perimetro = 2*(num1+num2);

        // Apresentar perimetro
        System.out.println("Perimetro: " + perimetro);




    }
}
