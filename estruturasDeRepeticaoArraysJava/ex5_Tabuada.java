package br.com.dio.estruturasDeRepeticaoArraysJava;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A sída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

import java.util.Scanner;

public class ex5_Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de 1 a 10 que deseja ver a tabuada: ");
        int tabuada = scan.nextInt();



        if(tabuada > 0 && tabuada <= 10){
            System.out.println("Tabuada de " + tabuada);
            for(int i = 1; i <= 10 ; i++ ){
            System.out.println(i + " X " + tabuada + " = " + i * tabuada);
        }
        } else{
                System.out.println("Valor inválido");
            }


    }
}
