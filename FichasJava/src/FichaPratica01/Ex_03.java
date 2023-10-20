package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int largura, comprimento, area, perimetro;

        // Ler largura
        System.out.print("Insira a largura: ");
        largura = input.nextInt();

        // Ler num2 comprimento
        System.out.print("Insira o comprimento: ");
        comprimento = input.nextInt();

        // Calcular area
        area = largura*comprimento;

        // Apresentar area
        System.out.println("Area: " + area);

        // Calcular perimetro
        perimetro = 2*(largura+comprimento);

        // Apresentar perimetro
        System.out.println("Perimetro: " + perimetro);




    }
}
