package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int minMusica1, segMusica1, minMusica2, segMusica2, minMusica3, segMusica3, totalMinutos3Musicas, totalSegundos3Musicas, minParaSeg, totalsegundos, h, m, s, resto;

        // Ler minutos musica 1
        System.out.print("Insira um numero: ");
        minMusica1= input.nextInt();

        // Ler segundos musica 1
        System.out.print("Insira um numero: ");
        segMusica1 = input.nextInt();

        // Ler minutos musica 2
        System.out.print("Insira um numero: ");
        minMusica2 = input.nextInt();

        // Ler segundos musica 2
        System.out.println("Insira um numero: ");
        segMusica2 = input.nextInt();

        // Ler minutos musica 3
        System.out.print("Insira um numero: ");
        minMusica3 = input.nextInt();

        // Ler segundos musica 2
        System.out.println("Insira um numero: ");
        segMusica3 = input.nextInt();

        // Calcular total minutos 3 musicas
        totalMinutos3Musicas = minMusica1+minMusica2+minMusica3;

        // Apresentar o total de minutos 3 musicas
        System.out.println("Total Minutos 3 musicas: " + totalMinutos3Musicas);

        // Calcular  total de segundos das 3 musicas
        totalSegundos3Musicas = segMusica1+segMusica2+segMusica3;

        // Apresentar o total de segundos das 3 musicas
        System.out.println("Total Segundos 3 musicas: " + totalSegundos3Musicas);

        // Calcular total minutos em segundos
        minParaSeg = totalMinutos3Musicas*60;

        // Apresentar total minutos em segundos
        System.out.println("Total minutos em segundos: " + minParaSeg);

        // Calcular total segundos
        totalsegundos = totalSegundos3Musicas+minParaSeg;

        // Apresentar total segundos
        System.out.println("Total em segundos: " + totalsegundos);

        // Horas do album
        h = totalsegundos/3600;
        resto = totalsegundos %3600;

        // Minutos do album
        m = resto/60;

        // Segundos do album
        s = totalsegundos - (h*3600+m*60);

        // Tempo do album
        System.out.println("Tempo de album: " + h + "h: " + m + "m: " + s + "s");









    }
}
