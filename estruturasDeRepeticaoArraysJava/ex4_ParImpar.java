package br.com.dio.estruturasDeRepeticaoArraysJava;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares,
 */

import java.util.Scanner;

public class ex4_ParImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;

        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;


        } while(count < quantNumeros);

        System.out.println("Pares: " + quantPares);
        System.out.println("Impares: " + quantImpares);

    }
}
