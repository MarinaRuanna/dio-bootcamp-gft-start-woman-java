package br.com.dio.desafiosDioJava;
/*
Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais
e todos os lados tem o mesmo comprimento. Um polígono simples é aquele cujos segmentos de reta não se interceptam.
Abaixo pode-se ver vários mosaicos feitos por polígonos regulares.

Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular,
mostre seu perímetro.
 */

import java.util.Scanner;

public class poligonosRegularesSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.nextLine();
        String[] split = N.split(" ");
        int P = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);
        System.out.println(P);
    }
}
