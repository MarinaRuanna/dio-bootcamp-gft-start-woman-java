package br.com.dio.estruturasDeRepeticaoArraysJava;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */

import java.util.Random;

public class ex9_NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i <  numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        for (int numero : numerosAleatorios) {
            System.out.println("Número aletatórios: " + numero);

        }
        for (int numero : numerosAleatorios) {
            System.out.println("Sucessor do número aletatórios: " + (numero + 1));

        }
    }
}
